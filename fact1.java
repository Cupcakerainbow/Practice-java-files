import java.util.*;
class Fact1 {
	static int n ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		factorial();
		display();
	}
	static void factorial(){
		for (int x = n-1 ; x>0 ; x-- ) {
			n =  n * x; 
			
		}
		if (n == 0){
			n=1;
		}

	}
	static void display(){
		System.out.println(n);
	}
}