import java.util.*;
class Q4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String a ="0";
		String b ="1";
 
		for(int i = 0 ; i < str.length() ; i++){
			//System.out.println(Integer.parseInt(str.substring(i,i+1)));
			if (Integer.parseInt(str.substring(i,i+1))>=2 || Integer.parseInt(str.substring(i,i+1))<0 ) {

			
				System.out.print("Is not a Binary");
				System.exit(0);	
			}	
		}
		System.out.print("Is a Binary");

		
	}
}