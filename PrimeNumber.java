class PrimeNumber{
	public static void main(String[] args) {
		int number = 7 ;
		for (int i =2 ; i <number ;i++ )
		{
			if (number%i == 0 ){
				System.out.println("Not Prime Number");
				break;
			}
			else if (i == number-1) {
				System.out.println("Prime Number");
				break;
			}
		}
	}
}