import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class guiexample{
    public static void main(String[] args){
        new guiexample();
    }
    public guiexample(){
        JFrame guiFrame=new JFrame();
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Example Gui");
        guiFrame.setSize(600,400);
        
        guiFrame.setLocationRelativeTo(null);
        String fruitoptions[]={ "Apple", "Apricot", "Banana","Cherry", "Date", "Kiwi", "Orange", "Pear", "Strawberry"};
        String[] vegOptions = {"Asparagus", "Beans", "Broccoli", "Cabbage", "Carrot", "Celery", "Cucumber", "Leek", "Mushroom",
             "Pepper", "Radish", "Shallot", "Spinach", "Swede", "Turnip"};
        final JPanel comboPanel=new JPanel();
        JLabel comboLabel1=new JLabel("Fruits: ");
        JComboBox fruits=new JComboBox(fruitoptions);
        comboPanel.add(comboLabel1);
        comboPanel.add(fruits);

        final JPanel listPanel=new JPanel();
        listPanel.setVisible(false);
        JLabel listlbl=new JLabel("Vegatables: ");
        JList vegs=new JList(vegOptions);
        vegs.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        listPanel.add(listlbl);
        listPanel.add(vegs);
       
        JButton vegFruitBut=new JButton("Fruit or veg");
        
        vegFruitBut.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event)
        {
                listPanel.setVisible(!listPanel.isVisible());
                comboPanel.setVisible(!comboPanel.isVisible());

            
            }
        });

         guiFrame.add(comboPanel,BorderLayout.NORTH);
         guiFrame.add(listPanel,BorderLayout.CENTER);
         guiFrame.add(vegFruitBut,BorderLayout.SOUTH);
        
         guiFrame.setVisible(true);
    }
}
