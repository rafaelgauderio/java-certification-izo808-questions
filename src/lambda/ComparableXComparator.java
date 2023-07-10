package lambda;


import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
	String name;
	Integer age;

	public Student (String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public int compareTo(Student o) {
		
		return Collator.getInstance().compare(name,o.name);
			
	}
	

}

public class ComparableXComparator {

	public static void main(String[] args) {
		
		System.out.println("Comparator\n"
				+ "\tTwo parameters in the interface method.\n"
				+ "\tComparator compare(parameter1, parameter2)\n"
				+ "\tDo not Has to be implemented");
		
		System.out.println("Comparable\n"
				+ "\tOne parameter.\n"
				+ "\tHas to be implemented necessary"
				+ "\tComparable compareTo(parameter)\n"
				+ "\tDefines the 'natural order'");
		
		ArrayList <Student> list = new ArrayList<Student>();
		list.add(new Student("Rafael", 35));
		list.add(new Student("Claudia", 27));
		list.add(new Student("Elisa", 32));
		list.add(new Student("Agnes",45));
		
		Collections.sort(list, new Comparator<Student> () {

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.age.compareTo(o2.age);
			}
			
		});
		
		System.out.println("\nOrder by age");
		System.out.println(list);
		
		// now order by name		
		Collections.sort(list);
		
		System.out.println("\nOrder by name");
		System.out.println(list);
		
		
		
		
		
		

	}

}
