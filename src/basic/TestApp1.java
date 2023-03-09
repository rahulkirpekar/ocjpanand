package basic;

public class TestApp1 extends TestApp
{
	static 
	{
		System.out.println("Child --  static Block");
	}
	{
		System.out.println("Child --  Instance Block");
	}	
	public TestApp1() 
	{
		System.out.println("Child --  Default Constructor");
	}
	public TestApp1(int no1) 
	{
		System.out.println("Child --  Default Constructor - " + no1);
	}
	public void  test1() 
	{
		System.out.println("Child --  non static method");
	}
	public static void  test2() 
	{
		System.out.println("Child --  static method");
	}
	public static void main(String[] args) 
	{
		System.out.println("Child --  START main method");

		TestApp1.test2();
		
		TestApp1 obj = new TestApp1();
		
		obj.test1();
		
		System.out.println("Child --  EXIT main method");
	}
}
