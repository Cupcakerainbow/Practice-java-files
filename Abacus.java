import java.util.*;
class Abacus {
	public static void main(String[] args) {
		int no1 , no2 ;
		Scanner sc  = new Scanner(System.in);
		no1 = sc.nextInt();
		no2 = sc.nextInt();
		int carry = 0;
		while(no1 >0 && no2>0){
			int temp = no1%10 + no2%10 ;
			no2/=10;
			no1/=10;
			if (temp >=10){
				carry+=1;
			}
		}
		System.out.println(carry);
	}
}