class Diamond{
	public static void main(String[] args) {
		int len = 201; //only odd len allowed 
		int divider = len/2 ;

		for (int i = 0 ; i < len; i++){
			if (divider-i>=0){
				for (int j = 0;j<divider-i  ;j++ ) {
					
					System.out.print(" ");
				}
				for (int k = 0 ; k <2*i+1;k++){
					System.out.print("*");
				}
			}
			else 
			{
				for (int j = 0;j<i-divider  ;j++ ) {
					System.out.print(" ");
				}
				for (int k = 0 ; k < 2*(len - i-1)+1 ;k++){
					System.out.print("*");
				}
			}
			System.out.println("");

		}
	}
}