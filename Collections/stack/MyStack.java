package stack;

import java.util.List;
import java.util.Vector;


public class MyStack<E> {

	private Vector<E> vect;
	public MyStack(){
		vect=new Vector<E>();
	}
	/**
	 * Looks at the object at the top of this stack without removing it from the stack.
	 **/
	
	public E peek() {		
		return vect.lastElement();
	}
	

	/**Removes the object at the top of this stack and returns 
	 * that object as the value of this function.
	 * @param item
	 * @return
	 */
	public E pop(){
		E e=vect.lastElement();
		vect.remove(vect.size()-1);
		return e;
	}
	/**
	 * Pushes an item onto the top of this stack.
	 * @param item
	 * @return
	 */
	public E push(E item){
		vect.add(item);
		return item;
	}
	
}