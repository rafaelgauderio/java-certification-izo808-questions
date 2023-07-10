package arrays;

import java.util.ArrayList;
import java.util.List;

public class ProgramArrayList02 {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<Object>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("a");

		// list mainteins the order of insertion
		// list allow duplicate elements		
		// remove the element with the first index
		// if the list does not contains the element, the list is unchanged
		
		if (list.remove("a")) { // it will be remove because the list contains the element "a";
			if (list.remove("a")) { // it will remove because contains a second "a" on the list 
				list.remove("b"); // it will remove because contains a "b" element
			} else {
				list.remove("c"); // it will not enter here, because the fisrt if is true
			}

		}
		System.out.println(list);
	}

}
