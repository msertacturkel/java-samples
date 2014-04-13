package org.apache.nutch.analysis.lang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.avro.util.Utf8;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.HTableInterface;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.nutch.metadata.Metadata;
import org.apache.nutch.parse.ParseException;
import org.apache.nutch.parse.ParseUtil;
import org.apache.nutch.parse.ParserNotFound;
import org.apache.nutch.storage.WebPage;
import org.apache.nutch.util.Bytes;
import org.apache.nutch.util.EncodingDetector;
import org.apache.nutch.util.NutchConfiguration;
import org.apache.nutch.util.TableUtil;
import org.yecht.JechtIO.Str;

public class testbenim {
	static File myFile = new File(
			"/home/mst/urldosya/agm.txt");
	Map<String, String> listemiz;

	public testbenim() throws IOException {
		listemiz = getContenmt();
	}

	public static void main(String[] args) throws IOException, ParserNotFound,
			ParseException {
		testbenim tb = new testbenim();
		ParseUtil parser = new ParseUtil(NutchConfiguration.create());
		WebPage page;
		int i = 0;
		for (String s : tb.listemiz.keySet()) {

			String url = TableUtil.unreverseUrl(s);
			page = getPage(tb.listemiz.get(s), url);
			if (page == null) {
				System.out.println("content null geldi.");
				continue;
			}
			parser.parse(url, page);
			ByteBuffer blang = page
					.getFromMetadata(new Utf8(Metadata.LANGUAGE));
			String lang = Bytes.toString(blang);
			String Yaz = url + "==>" + lang;
			printFile(Yaz);
			System.out.println(Yaz);
			i++;

		}
		System.out.println(i);
	}

	private static void printFile(String yazi) throws IOException {
		String s = "";
		FileWriter fwriter = new FileWriter(myFile, true);
		try {
			BufferedWriter bw = new BufferedWriter(fwriter);
			bw.write(yazi + "\n");
			System.out.println(yazi + "\n");
			bw.close();
		} catch (IOException ex) {
			System.out.println("Yazarken oluşan hata = " + ex.toString());
		}
	}

	private static WebPage getPage(String text, String url) {
		if (text == null) {
			return null;
		}
		WebPage page = new WebPage();
		page.setBaseUrl(new Utf8(url));
		page.setContent(ByteBuffer.wrap(text.getBytes()));
		page.setContentType(new Utf8("text/html"));
		page.putToHeaders(EncodingDetector.CONTENT_TYPE_UTF8, new Utf8(
				"text/html"));
		return page;
	}

	public static Map<String, String> getContenmt() throws IOException {
		Configuration conf = HBaseConfiguration.create();
		HTableInterface table = null;
		Map<String, String> liste = new HashMap<String, String>();
		try {
			table = new HTable(conf, Bytes.toBytes("2_webpage"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Scan scan = new Scan();
		scan.addColumn(Bytes.toBytes("f"), Bytes.toBytes("cnt"));

		ResultScanner scanner = null;
		try {
			scanner = table.getScanner(scan);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Iterator<Result> rs = scanner.iterator();

		// int i=0;
		while (rs.hasNext()) {
			Result res = rs.next();
			liste.put(Bytes.toString(res.getRow()), Bytes.toString(res.value()));
			// i++;
			// if(i==500) break;
		}
		return liste;

	}

}
