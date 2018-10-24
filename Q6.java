import java.util.*;
class Q6 {
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
		Scanner st = new Scanner(System.in);
		int sum_input = st.nextInt();
		
		for (int i =0 ; i<number_of_inputs ; i++){
			int temp =0;
			for (int j=i;j<number_of_inputs ;j++ ) {
				temp+=arr[j];
				if(temp == sum_input){
					System.out.print(Arrays.toString(Arrays.copyOfRange(arr, i, j+1)));
					break;
				}
				else if (temp > sum_input) {
					break;
					
				}
				
			}
		}
	}
}