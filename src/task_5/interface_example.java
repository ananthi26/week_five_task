package task_5;
interface features
{
	public void name();
}
interface walk
{
	void sound();
}
class dog implements features,walk
{
	public void name()
	{
		System.out.println("Dog name is:anvii");
	}
	public void sound()
	{
		System.out.println("Bow...");
	}
}
public class interface_example {
	public static void main (String[] args)
	{
		dog d=new dog();
		d.name();
		d.sound();
	}

}
