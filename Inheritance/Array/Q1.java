import java.util.*;

class Q1{
	static int check(int w, int arr1[]){
		for (int i : arr1){
			if (w==i){
				return w;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		n1 = sc.nextInt();
		if (n1 <= 0){
			System.out.println("Invalid array size");
			System.exit(0);
		}
		System.out.println();
		int ids[] = new int[n1];
		for(int i = 0; i <n1 ;i++){
			ids[i]= sc.nextInt();
		}
		System.out.println();
		int n2 = sc.nextInt();
		System.out.println();
		int working[] = new int[n2];
		for (int i = 0;i < n2 ;i++ ) {
			working[i] = sc.nextInt();
			
		}
		System.out.println();
		int non_working[] = new int[n1];
		int count = 0;
		for(int i =0 ;i < n1 ; i ++){
			int a = check(ids[i],working);
			if (a == 0){
				non_working[count] = ids[i];
				count++;
			}
		}
		System.out.println();
		for(int i =0 ;i <count ; i++){
			System.out.println(non_working[i]);
		}


	}
}