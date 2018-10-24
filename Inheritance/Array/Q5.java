import java.util.*;
class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count =0 ;
		while(true){
			if(str.charAt(count) == str.charAt(count+1)){
				str= str.substring(0,count+1) + str.substring(count+2,str.length()); 
			}
			else{
				count++;
				
			}
			if(count >= str.length()-1){
				break;
			}
			//System.out.println(str + " " + count + " "+ str.length());	
		}
		System.out.println(str);
	}
}