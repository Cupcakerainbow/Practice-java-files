import java.util.*;
class Base  {
	int a , b ,sum ;
	
	void sum(int x , int y){
		a = x ;
		b = y ;
		sum = a + b; 
	}
	void show(){
		System.out.println("Sum = " + sum);
	}

}


class Pattern
{

	void  Pat ()
	{
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		if(n<=0)
		{
			System.out.println("Invalid input");
		}
		else
		{
			int res = 1;
			for(int i=1;i<n*2;i+=2)
			{
				System.out.println(res);
				if(i < n*2 -1)
				{
					res = (res*10) + (i+1);
				    res = (res*10) + (i+2);
				}
			}
			
			for(int i = 1;i<n;i++)
			{
				res /= 10;
				res /= 10;
				System.out.println(res);
			}
		}
	}
}
