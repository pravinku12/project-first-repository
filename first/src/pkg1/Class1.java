package pkg1;

public class Class1 {
	
	int a,b,c,d,e;
	
	public void method(int a1,int a2,int a3,int a4,int a5) {
		a=a1;
		b=a2;
		c=a3;
		d=a4; 
		e=a5;
	}
	
	public static void main(String[] args) {
		Class1 ob=new Class1();
		System.out.println("change done");
		ob.method(2,3,4,5,6);
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
		System.out.println(ob.e);
	}
	

}
