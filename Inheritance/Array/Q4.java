import java.util.*;
class Q4{
	static String str0 = new String();
	static String sub_string(String str , int start , int no){

		for(int i = start ; i< start + no ; i++){
			str0 += str.charAt(i);
		}
		return str0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string:");
		String str = sc.nextLine();
		System.out.println();
		System.out.println("Enter index from:");
		int start = sc.nextInt();
		System.out.println();
		System.out.println("Number of Characters");
		int no = sc.nextInt();
		System.out.println();
		System.out.println("Sub String is");
		
		System.out.println(sub_string(str,start,no));

	}
}