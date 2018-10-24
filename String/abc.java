import java.util.*;
class Abc{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String abc = sc.nextLine();
		//System.out.println(abc.reverse());
		System.out.println(abc.concat(abc));
		//System.out.println(abc.charAt(2));
		System.out.println(abc.format("abc %f",2.22));
		System.out.println(abc.length());
		System.out.println(abc.replace("a","e"));
		System.out.println(abc.contains("E"));
		byte bar[] = abc.getBytes();
		for(byte i : bar){
			System.out.println(i);
		}
		
	}
}