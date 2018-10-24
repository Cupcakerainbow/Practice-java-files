import java.util.*;
class Array{
	public static void main(String[] args) {
		int a[] = new int[100];
		int arrLen = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true){
		System.out.println("1. Insert \n2. Delete\n3. Sorting\n4.Searching\n5.Exit");
		int option = sc.nextInt();
			if (option== 1){
				int position,value;
				System.out.println("You have Selected Insert");	
				System.out.println("Enter position Number or -1 to got to Main Menu ");
				position = sc.nextInt();
				if (position>0 && position <= arrLen || arrLen ==0 ){
					arrLen+=1;
					value = sc.nextInt();
					int temp=a[position-1];
					a[position-1]=value;
					int boii ;
					for(int i = position-1 ; i <arrLen-1; i++ ){
						boii = a[i+1];
						a[i+1] = temp;
						temp = boii;

					}
					System.out.println("Operation Succesfull ,  New Array is :");
					for (int i =0 ;i < arrLen ;i++ ) {
						System.out.print(a[i] + " ");
						
					}
					System.out.println("");

				}
				else if (position==-1) {
						continue;
						
					}
				else if(position==arrLen+1){
					value = sc.nextInt();
					a[position-1] = value;
					arrLen+=1;
					 for (int i =0 ;i < arrLen ;i++ ) {
						System.out.print(a[i] + " ");
						
					}
					System.out.println("");

				}
				else{
					System.out.println("Invalid position no , Enter no between 1 and "+ arrLen);

				}



			}
		if(option == 2){
			System.out.println("You have Selected Delete");
			int position = sc.nextInt();
			if(position>=1 && position<=arrLen){
				
				a[position-1]=0;
				for(int i = position-1; i<arrLen;i++){
					a[i]=a[i+1];

				}
				arrLen-=1;
				 for (int i =0 ;i < arrLen ;i++ ) {
						System.out.print(a[i] + " ");
						
					}
					System.out.println("");
			}
			else {
				System.out.println("Invalid position Number , Enter position between 1 and " + arrLen);
			}
		}
		if (option==3){
			System.out.println("You have Selected Sorting");
			int temp;
			for(int i =0 ; i < arrLen-1 ; i++){
				for (int j=0 ;j < arrLen-1-i ;j++ ) {
					if (a[j]>a[j+1]){
						temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
										
				}
			}
			System.out.println("Sorted Array :");
			 for (int i =0 ;i < arrLen ;i++ ) {
						System.out.print(a[i] + " ");
						
					}
					System.out.println("");

		}
		if (option==4){
			System.out.println("You have Selected Searching");
			System.out.println("Enter value to get the position Number");
			int value = sc.nextInt();
			for (int i =0 ;i <arrLen; i++){
				if(a[i]==value){
					System.out.println("Element found !!! At position Number" + i+1);
				}
			}
		}
		if (option==5){
			System.out.println("Exiting Program");
			break;
		}
	}



	}
}