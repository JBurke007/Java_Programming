package Book;

public class Entity_Creator
{

	public String fName;
	public String lName;
	public int age;
	public String Name;
	private int emergency = 999;
	
	public Entity_Creator(String Fname, String Lname, int Age){
				
		this.fName = Fname;
		this.lName = Lname;
		this.age = Age;
		//System.out.println(fName+" "+lName+" "+Age);		
	}
	
	// Example of overloading
	public Entity_Creator(String Fname, String Lname){
		
		this.fName = Fname;
		this.lName = Lname;
		//System.out.println(fName+" "+lName+" + No Age Received");		
	}
	
	// Example of overloading
	public int getEmerg(){
		return this.emergency;
		//System.out.println(name);		
	}
	
	public void setEmerg(int num){
		if(num != this.emergency){
			this.emergency = num;
		}
		else{
			System.out.println("You entered the same number, nothing has changed");
		}
		
	}
	
}