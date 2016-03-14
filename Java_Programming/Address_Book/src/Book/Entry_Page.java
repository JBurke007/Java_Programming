package Book;


import Book.Entity_Creator;

public class Entry_Page
{
	
	public static void main(String[] args){
		
		Entity_Creator james = new Entity_Creator("James","Burke",23);
		System.out.println(james.lName);
		
		Entity_Creator john = new Entity_Creator("John","Adams");
		System.out.println(john.fName);
		
		Entity_Creator ali = new Entity_Creator("Ali","Burke");
		System.out.println(ali.fName);
		
		ali.fName = "Trevor";
		System.out.println(ali.fName);
		
		System.out.println(ali.getEmerg());
		ali.setEmerg(911);
		System.out.println(ali.getEmerg());
		ali.setEmerg(911);
		System.out.println(ali.getEmerg());
		
	}
	
}
