import java.util.*;
class Amoeba{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int no = sc.nextInt()-1 ; 
		int fib =1;
		int previos = 0;
		int temp =0 ;
		//System.out.println(temp);
		for (int i =1 ; i <no ; i++){
			temp = fib;
			fib =fib + previos ;
			previos = temp ;
			
		}
		System.out.println("The Amoeba Size is "+fib);

	}
}