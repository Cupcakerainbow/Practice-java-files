class Gcd {
	public static void main(String args[]){
		int a = 24;
		int b = 1;
		int c = 0 ;
		while(b != 0){
			a = a%b;
			c = b;
			b = a;
			a = c;
		}
		System.out.println(c);
 

	}
}