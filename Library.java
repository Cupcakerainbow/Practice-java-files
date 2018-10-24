import java.util.*;
class Library {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		long inverse = 0;
		if (no <0 ){
			System.out.println("Invalid Number");
			System.exit(0);
		}
			while(no >0){
				inverse += no%10;
				inverse*=10;
				//System.out.println(inverse);
				no /=10;
			}
		System.out.println(inverse/10);

	}
}