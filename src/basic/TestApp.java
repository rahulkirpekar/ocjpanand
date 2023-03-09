package basic;

public class TestApp 
{
	static 
	{
		System.out.println("Parent -- static Block");
	}
	{
		System.out.println("Parent -- Instance Block");
	}	
	public TestApp() 
	{
		System.out.println("Parent --  Default Constructor");
	}
	public TestApp(int no1) 
	{
		System.out.println("Parent --  Default Constructor - " + no1);
	}
	public void  test1() 
	{
		System.out.println("Parent --  non static method");
	}
	public static void  test2() 
	{
		System.out.println("Parent --  static method");
	}
}
