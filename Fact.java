
import java.util.*;
class Fact {
	public static void main(String[] args) {
		int no ;
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		System.out.println(factorial(no));
	}
	static int factorial(int x){
		if (x==1 || x == 0){
			return 1;
		}

		x = x*factorial(x-1);
		return x;
	}
}