import java.util.*;
class D2B{
	static int number_ent;
	static String str = "";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		number_ent = sc.nextInt();
		D2b(number_ent);
		System.out.println("");
		D2o(number_ent);
		System.out.println("");
		D2h(number_ent);
		
		



	}
	static void D2b(int number){
		if(number%2==1){
			D2b(number/2);
			System.out.print("1");
		}
		else if (number==0) {
		}
		else{
			D2b(number/2);
			System.out.print("0");
		}

	}
	static void D2o(int number){
		int temp=number%8;
		if (number!=0){	
			D2o(number/8);
			System.out.print(temp);
		}
		else{

		}
	}
	static void D2h(int number){
		int temp=number%16;
		if (number!=0 && temp < 10){	
			D2o(number/16);
			System.out.print(temp);
		}
		else if (temp>9 && temp <16) {
			D2o(number/16);
			System.out.print((char)(temp-10+65));
			
		}
		else{

		}
	}


}