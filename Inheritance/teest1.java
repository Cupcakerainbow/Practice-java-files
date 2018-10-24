import java.util.*;

class Car extends Company
{
	private int yom,top_spd;
	protected int man=0;
	private String clr,mod;
	Scanner scan = new Scanner(System.in);
	public void create()
	{
		System.out.print("Enter the model - ");
		mod = scan.next();
		System.out.print("Enter the year of manufacture - ");
		yom = scan.nextInt();
		System.out.print("Enter the top speed - ");
		top_spd = scan.nextInt();
		System.out.print("Enter the color of the car - ");
		clr = scan.next();
		counta();
		man++;
		System.out.println("**********Car has created******");	
	}
	public void sold()
	{
		System.out.println("******Car has been Sold********");
		sld();
		System.out.println("Total "+soldd+" cars left out of "+man+" cars");

	}
	public void display()
	{
		System.out.println("The model of the car - "+mod);
		System.out.println("The year of manufacturing - "+yom);
		System.out.println("The color of the car - "+clr);
		System.out.println("The top speed of the car - "+top_spd);
		countm();
		
	}
}
class Company 
{
	protected int soldd=0,count=0;
	void counta()
	{
		count++;
	}
	void countm()
	{
		count--;
	}
	public void sld()
	{
		soldd++;
	}
	
}
class Main
{
	public static void main(String[] args)
	{
		
		Car santro = new Car();
		santro.create();
		santro.create();
		santro.display();
		santro.sold();
		santro.display();

	}
}