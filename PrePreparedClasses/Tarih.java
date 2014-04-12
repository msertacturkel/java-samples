import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class Tarih {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		DateFormat df1=DateFormat.getDateTimeInstance();
		DateFormat df2=DateFormat.getDateInstance(DateFormat.LONG);	
		System.out.println(df1.format(d));
		System.out.println(df2.format(d));		
		Locale turk=new Locale("tr");
		DateFormat df3=DateFormat.getDateInstance(DateFormat.LONG,turk);
		System.out.println(df3.format(d));
		SimpleDateFormat sdf=new SimpleDateFormat("'gun:' dd/MM/yyyy 'saat:' HH:mm:ss");
		System.out.println(sdf.format(d));
		Calendar cal=Calendar.getInstance();
		cal.set(1982, Calendar.APRIL, 10);
		System.out.println(cal);
		Date d1=cal.getTime();
		System.out.println(d1);
	}

}
