package sonu.com;
public class Example {
	static Example ex; 
          int va =90;
	public static void main(String args[])
	{
         ex= new Example();
		 int value = 45;
        test(ex.va);
        System.out.println(ex.va);
        
	}
public static void test(int a)
{
    ex= new Example();
    System.out.println(ex.va);
    
	System.out.println(a);
		return;
	}
}
