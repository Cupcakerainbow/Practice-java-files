import java.util.*;
class Matrix{
	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{9,8,7},{6,5,4},{3,2,1}};
		int c[][] =new int[3][3];
		int option;
		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
		System.out.println("1.Add 2.Multiply 3.Transpose");
		while(true){
			option = sc.nextInt();
			switch (option){
				case 1:
					for(int i=0;i<3;i++){
						for (int j= 0;j<3 ;j++ ) {
							c[i][j] = a[i][j]+b[i][j];

							
						}
					}
					System.out.println(" " + Arrays.deepToString(c));
					break;
				case 2:
					for(int i=0;i<3;i++){
						for (int j= 0;j<3 ;j++ ) {
							c[i][j] = a[i][j]*b[i][j];

							
						}
					}
					System.out.println(" " + Arrays.deepToString(c));
					break;
				case 3 :
					for(int i=0;i<3;i++){
						for (int j= 0;j<i ;j++ ) {
							int temp;
							temp = a[i][j];
							a[i][j] = a[2-i][2-j];

							a[2-i][2-j] = temp;

							
						}
						for (int j= 0;j<i ;j++ ) {
							int temp;
							temp = b[i][j];
							b[i][j] = b[2-i][2-j];

							b[2-i][2-j] = temp;

							
						}
					}

					System.out.println(" " + Arrays.deepToString(a));
					System.out.println(" " + Arrays.deepToString(b));
					break;
			}
		}
	}
}