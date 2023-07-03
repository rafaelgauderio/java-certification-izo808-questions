package arrays;

import java.util.ArrayList;
import java.util.Iterator;


class Book{
	String name;
	
	public Book () {
		
	}
	
	public Book (String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + "]";
	}
	
	
}

class TextBook extends Book{ 
	
	public TextBook (String name) {
		super(name);
	}
	
	
}



class BookList extends ArrayList<Book>

{

    public int count = 0;

    public boolean add(Book o)    {

       if(o instanceof Book ) 
       {
    	   count = count-1;
    	   return   super.add((Book) o);
       }	
    	 

       else return count++ == -1;

    }    
    

}


public class Program05 {
	
	public static void main (String [] args) {
		
		//in valid context

		BookList list = new BookList();

		list.add(new Book("Escravidão"));

		list.add(new TextBook("Clean Code"));
		
		list.add(new Book("C++"));
		
		// só vai incrementar o contando se não for uma instancia de Book
		
		
		

		for(Book nickname : list) {
			System.out.println(nickname.toString()); // vai imprimir 3 registro de memória de book
		}
		
		System.out.println("\n");
		
		
		Iterator<Book> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}	
		
		System.out.println("\n");
		
		
		System.out.println("size: " + list.size()); //3

		System.out.println("count: "+ list.count); //-3
		
	}
}


