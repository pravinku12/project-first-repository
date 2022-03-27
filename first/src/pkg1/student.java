package pkg1;

public class student {

	int age=24;  // we have declared a variable named age & roll
	int roll=1234; 
	
public void display1()
{     //this is boundary of method
	System.out.println(" welcome to all of you" );	
	
}
public void display2()
{     //this is boundary of method
	System.out.println(" automation is very easy" );	
	
}



public static void main(String[] args) {
	// this is the boundary of main method
	
	student vishal=new student();
	vishal.display1();//called deepak method
	vishal.display2();
	System.out.println(vishal.age);
	System.out.println(vishal.roll);
	
}
	
	
}
