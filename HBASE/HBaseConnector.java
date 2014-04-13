
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;

public class HBaseConnector {

	private static HTable table;

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Configuration config = HBaseConfiguration.create();
		table = new HTable(config,"mydb");
		Put p=new Put(Bytes.toBytes("Row"));
		p.add(Bytes.toBytes("Family"),Bytes.toBytes("Qualifier"),Bytes.toBytes("Value"));
		table.put(p);
		
		Get g = new Get(Bytes.toBytes("Row"));
		Result r = table.get(g);
		byte[] value = r.getValue(Bytes.toBytes("Family"), Bytes
		.toBytes("Qualifier"));
		String valueStr = Bytes.toString(value);
		System.out.println("GET: " + valueStr);
		
		Scan s = new Scan();
		s.addColumn(Bytes.toBytes("Family"), Bytes
		.toBytes("Qualifier"));
		ResultScanner scanner = table.getScanner(s);
		try {		
			for (Result rr = scanner.next(); rr != null; rr = scanner.next()) {
		
				System.out.println("Found row: " + rr);
			}
		} finally {
		
			scanner.close();
			}
		}
	}
/*
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class connection {
public static void main(String[] args) {
	HBaseAdmin hba=new HBaseAdmin();
	
}
}*/

