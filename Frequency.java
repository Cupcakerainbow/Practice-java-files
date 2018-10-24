import java.util.*;
class Frequency{

	static int freq[] = new int[10];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int no;
		no = sc.nextInt();
		if (no > 0){
			int temp;
			while(no>0){
				temp = no%10;
				no /= 10;
				freq[temp]+=1;


			}
			for (int i =0 ;i<10 ;i++ ) {
				System.out.println("Frequency of "+i+" = " + freq[i]);
				
			}
		}
		else {
			System.out.println("Invalid no");
		}


	}
}