/**helon world */
class Alphabets1 {
	public static void main(String[] args) {
		/**helon world */
		for (int i =0;i<5 ;i++ ) {
			//Prints "V"
			for (int j=0;j<9 ;j++ ) {
				if(i ==0){
					if(j==0 || j == 8){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				if(i== 1){
					if (j == 1 || j == 7){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}

				}
				if(i==2){

						if (j == 2 || j == 6){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
	
						}
					}
				if(i==3){

					if (j== 3 || j == 5){
						System.out.print("*");
						}
					else{
						System.out.print(" ");
					}
				}
				if(i==4){

						if (j == 4){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
	
						}
					}	
			}
			//Prints A
			for (int j=0;j<9 ;j++ ) {
				if(i ==4){
					if(j==0 || j == 8){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}

				if(i ==3){
					if(j==1 || j == 7){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				if(i== 2){
					if (j <=6 && j >=2 ){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}

				}
				if(i==1){

						if (j == 3 || j == 5){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
	
						}
					}
				if(i==0){

					if (j== 4){
						System.out.print("*");
						}
					else{
						System.out.print(" ");
					}
	
				}	
			}

			//Prints "I"
			System.out.print(" * ");
			

			//Prints "B"
			for (int j=0;j<9 ;j++ ) {
				if(i ==0 || i == 4 || i == 2){

					System.out.print("*");

				}
				if(i== 1 || i == 3){
					if (j == 0 || j == 8){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}

				}
				if (j==8){
					System.out.print(" ");
				}
			}
			//Prints "H"
			for (int j=0;j<9 ;j++ ) {

				if(i== 1 || i == 0){
					if (j == 0 || j == 8){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}

				}
				if(i==2){

					System.out.print("*");
					}
				if(i==3 ||  i == 4){
					if (j == 0 || j == 8){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
			}
			//PRINTS "A"
			for (int j=0;j<9 ;j++ ) {
				if(i ==4){
					if(j==0 || j == 8){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}

				if(i ==3){
					if(j==1 || j == 7){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				if(i== 2){
					if (j <=6 && j >=2 ){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				if(i==1){

						if (j == 3 || j == 5){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
					}
				if(i==0){

					if (j== 4){
						System.out.print("*");
						}
					else{
						System.out.print(" ");
					}
				}	
			}
			//PRINTS 'V'
			for (int j=0;j<9 ;j++ ) {
				if(i ==0){
					if(j==0 || j == 8){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				if(i== 1){
					if (j == 1 || j == 7){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}

				}
				if(i==2){

						if (j == 2 || j == 6){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
	
						}
					}
				if(i==3){

					if (j== 3 || j == 5){
						System.out.print("*");
						}
					else{
						System.out.print(" ");
					}
				}
				if(i==4){

						if (j == 4){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
					}	
			}
			System.out.println("");
		}
	}
}