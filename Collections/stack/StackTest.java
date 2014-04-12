package stack;

import java.awt.Color;
import java.util.Date;
import java.util.Stack;


public class StackTest {

	public static void main(String[] args) {
		Stack s=new Stack<Object>();
		s.push("merhaba");
		s.push(new Date());
		s.push(Color.red);
		s.remove(1);//izin verilmemeliydi
		Object obj1 = s.peek();
		Object obj2 = s.peek();
		Object obj3 = s.peek();
		Object obj4= s.pop();
		Object obj5 = s.peek();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println(obj5);
		/*for (Object object : s) {
			System.out.println(object);
		}*/
	}

}