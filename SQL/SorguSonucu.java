import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class SorguSonucu extends javax.swing.JFrame {

	private Statement stmt;

	/**
	 * Creates new form SorguSonucu
	 */
	public SorguSonucu() {
		initComponents();
		veriTabaninaBaglan();
	}

	private void veriTabaninaBaglan() {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			String url = "jdbc:derby://localhost:1527/sample";//
			String user = "app";
			String password = "app";
			Connection con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		tablo = new javax.swing.JTable();
		sorguBt = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jScrollPane1.setViewportView(tablo);

		sorguBt.setText("Sorgula");
		sorguBt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sorguBtActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														375,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(sorguBt))
								.addContainerGap(15, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										247,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(sorguBt)
								.addGap(0, 12, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void sorguBtActionPerformed(java.awt.event.ActionEvent evt) {
		String sql = "select * from ogrenci";
		ResultSet rs;
		try {
			rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int sutunSay = rsmd.getColumnCount();
			Vector<String> columnNames = new Vector<String>();
			Vector<Vector> data = new Vector<Vector>();
			// Sutun isimleri olusuyor
			for (int i = 1; i <= sutunSay; i++)
				columnNames.add(rsmd.getColumnName(i));

			while (rs.next()) {// satir satir okunuyor
				Vector<String> kayit = new Vector<String>();
				// kayit vector'u doluyor
				for (int i = 1; i <= sutunSay; i++)
					// satir icindeki sutunlari tariyor
					kayit.add(rs.getString(i));
				data.add(kayit);
			}
			DefaultTableModel dtm = new DefaultTableModel(data, columnNames);
			tablo.setModel(dtm);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(SorguSonucu.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(SorguSonucu.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(SorguSonucu.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SorguSonucu.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SorguSonucu().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JButton sorguBt;
	private javax.swing.JTable tablo;
	// End of variables declaration
}
