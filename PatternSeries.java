import java.util.*;
class PatternSeries{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		if (no<=0){
			System.out.println("Invalid number");
			System.exit(0);
		}		
		for (int i = 0; i < 2*no-1 ;i++ ){

			if(i<no){
				for(int j = 1; j <=2*i+1; j++){
					System.out.print(j);
				}
			}
			else{
				for (int j = 1; j < 2*(2*no-1-i) ;j++ ) {
					System.out.print(j);
						
						
					}
				}
			
			System.out.println();

		}
	}
}