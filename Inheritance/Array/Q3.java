import java.util.*;
class Q3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.length() <=20 && !(str.equals("my dick"))){
			for (int i = 0 ; i<str.length() ;i++ ) {
				
				System.out.println(str.charAt(i));
			}
			
		}
		//easter egg
		else if (str.equals("my dick")){
			System.out.println("too long");
		}
		else{
			System.out.println("too long");
		}
	}
}

