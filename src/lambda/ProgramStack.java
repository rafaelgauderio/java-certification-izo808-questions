package lambda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ProgramStack {

	public static void main(String[] args) {
		

		System.out.println("Stack\n"
				+ "LIFO structure: Last in, First Out\n");			
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack);
		System.out.println("first: " + stack.firstElement()); // 1
		System.out.println("last: " + stack.lastElement()); // 3
		System.out.println("remove from the top (last in): " + stack.pop()); // remove 3, the last in
		System.out.println(stack);
		
		
		System.out.println("\nQueue\n"
				+ "FIFO structure: Fist in, Fisrt Out\n");
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println(queue);
		System.out.println("Remove the first in: "+ queue.remove()); // remove the 1 the first
		System.out.println(queue);
		
	}

}
