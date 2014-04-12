import java.util.Locale;


public class LocaleTest {

	public static void main(String[] args) {
		Locale[] locales = Locale.getAvailableLocales();
		for (int i = 0; i < locales.length; i++) {
			Locale locale=locales[i];
			System.out.println(locale.getLanguage()+"\t"+locale.getCountry());
		}

	}

}
