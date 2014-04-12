import java.lang.reflect.Method;


public class Reflection {

	public static void main(String[] args) {
		try {
			Class cls=Class.forName("java.lang.String");
			Method[] methods = cls.getMethods();
			for (int i = 0; i < methods.length; i++) {
				Method meth=methods[i];
				System.out.print(meth.getReturnType().getSimpleName()+" "+meth.getName()+"(");
				Class[] params = meth.getParameterTypes();
				for (int j = 0; j < params.length; j++) {
					System.out.print(params[j].getSimpleName()+ " arg"+j);
					if(j!=params.length-1) System.out.print(",");
				}
				System.out.println(")");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
