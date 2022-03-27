package pkg1;

public class student3 {

	 public int div(int a,int b) {
		 
		 int c;
		 c=a/b;
		 System.out.println("div result is "+c);
		 return c;
	 }
	
	 public int sub(int a1,int b1) {
		 
		 int c1;
		 c1=a1-b1;
		 System.out.println("sub result is "+c1);
		 return c1;
	 }
	 
	 public int sum(int a2,int b2) {
		 
		 int c2;
		 c2=a2+b2;
		 System.out.println("sum result is "+c2);
		 return c2;
		 
	 }
	 
   public int sub1(int a3,int b3) {
		 
		 int c3;
		 c3=a3-b3;
		 System.out.println("sub result is "+c3);
		 return c3;
		 
     }
	  
   public void multi(int a4,int b4) {
   	
   	int c4;
   	c4=a4*b4;
   	System.out.println("final result is "+c4); 
   }
	public static void main(String[] args) {
		
		student3 xy=new student3();
		int divResult=xy.div(10, 2);
		int subResult=xy.sub(divResult, 2);
		int sumResult=xy.sum(subResult, 2);
		int sub1Result=xy.sub1(sumResult, 2);
		xy.multi(sub1Result,2);
	}
	
	

}
