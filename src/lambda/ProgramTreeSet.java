package lambda;

import java.util.TreeSet;

public class ProgramTreeSet {

	public static void main(String[] args) {
		
		System.out.println("\nTreeSet\n"
				+ "\tIt is a NavigableSet and so it suportes subSet method.\n"
				+ "\tThe returned subset is backed by the original subSet.\n"
				+ "\tNavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive).\n"
				+ "\tIf we remove or add an element from the subset, the same action will be reflected on the originl set.\n"
				+ "\tThe range of the element add ou remove must be in the range of the original set, otherwise will have an IllegalArgumentException.\n");
		
		TreeSet<Integer> original = new TreeSet<Integer>();
		TreeSet<Integer> subSetTrue = new TreeSet<Integer>();
		TreeSet<Integer> subSetFalse = new TreeSet<Integer>();
		TreeSet<Integer> subSetException = new TreeSet<Integer>();
		
		for(int i=100; i <=110; i ++ ) {
			original.add(i);
		}
		
		System.out.println("original: " + original);
		
		subSetTrue = (TreeSet<Integer>) original.subSet(104, true, 108, true); // it will include 104 and 108
		System.out.println("subSetTrue: " + subSetTrue);
		
		subSetFalse = (TreeSet<Integer>) original.subSet(104, false, 108, false); // it will NOT include 104 and 108
		System.out.println("subSetFalse: " + subSetFalse);
		
		subSetException = (TreeSet<Integer>) original.subSet(104, true, 110, true); // out of range when add 111, IllelArgumentException
		System.out.println("subSetException: " + subSetException);
		subSetException.add(111);
		
	}

}
