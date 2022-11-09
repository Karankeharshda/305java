//java program to demonstreate constructor and finalize
class demo
{
	demo(int x)
	{
		System.out.println(x);
	}
	protected void finalize()
	{
		System.out.println("Object is destroyed by garbage collector");
	}
}
public class DestructorExample
{
	public static void main(String args[])
	{
		demo d1=new demo(23);
		d1.finalize();
		d1=null;
		System.out.println("inside the main method");
	}
}