class Fibo{
	public static void main(String[] args) {
		int no = 10 ;//Enter  Fibonacci till the no +2 
		int fib =1;
		int previos = 0;
		int temp =0 ;
		System.out.println(temp);
		for (int i =1 ; i <no ; i++){
			temp = fib;
			fib =fib + previos ;
			previos = temp ;
			System.out.println(previos);
		}
		//System.out.println(fib);

	}
}