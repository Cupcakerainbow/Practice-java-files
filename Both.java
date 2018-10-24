class Both {
	public static void main(String[] args) {
		int len = 5;
		for (int i = 0 ;i<len ; i++) {
			for (int j = 0;j<=i;j++){
				System.out.print("*");
			}
			for (int k = 0 ; k<=2*(len-i-1)-1 ; k++){
				System.out.print(" ");
			}
			for (int l=0; l<=i ;l++ ) {
				System.out.print("*");
				
			}
			System.out.print("\n");
		}
	}
}