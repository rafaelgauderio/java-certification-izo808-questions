package lambda;

import java.util.ArrayDeque;
import java.util.Deque;

public class ProgramDeque {

	public static void main(String[] args) {
		
		System.out.println("Deque\n"
				+ "\tDouble ended queue = Fila duplamente ligada\n"
				+ "\tpoll methods remove items and push methods add itens\n"
				+ "\tDeque can be use as a Queue or a Stack\n"
				+ "\tStack has the method push and pop (add to the front and removes from the front).\n"
				+ "\tQueue has methods: offer, add, poll, remove.\n"
				+ "\tDeque has methods: removeFirst, removeLast");
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		deque.push(10); // push add element in the front
		deque.push(11);
		deque.push(12);
		
		System.out.println(deque);
		System.out.println(deque.pollFirst()); // 12, working as a stack FILO
		System.out.println(deque.poll()); // 11
		System.out.println(deque.pollLast()); // 10
		
		deque.addFirst(13);
		deque.addLast(14);
		System.out.println(deque);
		deque.offerLast(15);
		deque.offerFirst(12);
		System.out.println(deque);
		
		//peek do not remove element from de deque
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
		System.out.println(deque.peek()); // peek the first element of deque
		
		System.out.println("Deque will do not be altered: ");
		System.out.println(deque);
		
		System.out.println(deque.remove()); // remove 1
		
		
		
		

	}

}
