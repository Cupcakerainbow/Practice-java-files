class Armstrong {
	public static void main(String[] args) {
		int no = 153 ;
		int sum = 0 ;
		int temp = no;
		while(temp>0){
			int digit =temp%10;
			sum += (digit)*digit*digit ;
			temp/=10;

		}
		System.out.println(no==sum);
	}
}