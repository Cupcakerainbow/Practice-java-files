class UpperTriangle {
	public static void main(String[] args) {
		int len = 5;
		for (int a=0 ;a<len ; a++) {
			for(int j=len-a;j>=0;j--) {

				System.out.print(" ");

				
			}
			for(int j=0;j<=a;j++) {

				System.out.print("*");

				
			}

			System.out.print("\n");
			
		}
	}
}