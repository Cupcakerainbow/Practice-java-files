import java.util.*;
class Q2{
	
	static int number_of_inputs;
	public static void main(String[] args) {
		System.out.println("Enter Comma Separated Values");	
		Scanner sc = new Scanner(System.in).useDelimiter(",");
		String str = "";

		str = sc.nextLine();
		String [] str_arr = str.split(",");
		number_of_inputs = str_arr.length;
		int arr[] = new int[number_of_inputs];
		for (int i =0 ; i < number_of_inputs ; i++){
			arr[i] = Integer.parseInt(str_arr[i]);

		}
		System.out.print("[");
		int zero_count = 0 ;
		for (int x : arr){
			if (x==0){
				zero_count++;
			}
			else{
				System.out.print(x+",");
			}
		}
		for (int i=0;i<zero_count ;i++ ) {
			System.out.print("0,");
					
		}
		System.out.print("]");

	}
}