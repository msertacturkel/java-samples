package stack;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Stack;


public class MyStackTest {

	public static void main(String[] args) {
		
		MyStack<String> s=new MyStack<String>();		
		s.push("merhaba");
		s.push("naber");
		String str1 = s.pop();
		String str2 = s.peek();
		System.out.println(str1);
		System.out.println(str2);
		/*for (Object object : s) {
			System.out.println(object);
		}*/
	}

}