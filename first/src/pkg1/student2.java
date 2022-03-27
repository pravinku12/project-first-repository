package pkg1;

public class student2 {

	public int sum(int a1,int a2) {
		
		int a3;
		a3= a1+a2;
		System.out.println("sum result is " +a3);
		return a3;
	}
	
    public int sum1(int b1,int b2) {
		
		int b3;
		b3= b1+b2;
		System.out.println("sum1 result is " +b3);
		return b3;
	}
    
    public int sub(int c1,int c2) {
		
  		int c3;
  		c3= c1-c2;
  		System.out.println("sub result is " +c3);
  		return c3;
  	}
	
    public int multi(int d1,int d2) {
		
  		int d3;
  		d3= d1*d2;
  		System.out.println("multi result is " +d3);
  		return d3; 
  	}
    
    public void div(int e1,int e2) {
    	
    	int e3;
    	e3=e1/e2;
    	System.out.println("final result is "+e3); 
    }
    
    public static void main(String[] args) {
		
    	student2 ab=new student2();
    	int sumResult=ab.sum(10, 2);
    	int sumResult1=ab.sum1(sumResult, 2);
    	int subResult=ab.sub(sumResult1, 2);
    	int multiResult=ab.multi(subResult, 2);
    	ab.div(multiResult,2);
	}
	
	
	
	
	
	
	
}
