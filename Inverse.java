class Inverse {
	public static void main(String[] args) {
		int no = 123456789;
		long inverse = 0;
		while(no >0){
			inverse += no%10;
			inverse*=10;
			//System.out.println(inverse);
			no /=10;
		}
		System.out.println(inverse/10);

	}
}