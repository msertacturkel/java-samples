import java.lang.reflect.Method;

public class Framework {

	public static void main(String[] args) {
		try {
			Class cls = Class.forName("BirSinif");
			Method[] methods = cls.getMethods();

			for (int i = 0; i < methods.length; i++) {
				int count = 0;
				int paramSay = 0;
				Method meth = methods[i];

				Class[] params = meth.getParameterTypes();
				for (int j = 0; j < params.length; j++) {
					paramSay++;
					if (params[j].getSimpleName().equals("String"))
						count++;

				}

				if (paramSay == 2 && count == 2) {
					System.out.println(meth.getName());

				}

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
