import java.util.*;
class Special{
	public static void main(String[] args) {

		int arr1[] = {1,2,3,4,6,10};
		int arr2[] = {1,3,2,4};
		int arrLen1 =6;
		int arrLen2 =4;


		
		int temp;
		for(int i =0 ; i < arrLen1 ; i++){
				for (int j=0 ;j < arrLen1-1-i ;j++ ) {
					if (arr1[j]>arr1[j+1]){
						temp = arr1[j];
						arr1[j] = arr1[j+1];
						arr1[j+1] = temp;
					}
										
				}
			}
		for(int i =0 ; i < arrLen2 ; i++){
				for (int j=0 ;j < arrLen2-1-i ;j++ ) {
					if (arr2[j]>arr2[j+1]){
						temp = arr2[j];
						arr2[j] = arr2[j+1];
						arr2[j+1] = temp;
					}
										
				}
			}
		int finalarr[] = new int [100];

		int p ,q ,i;
		i=0;
		p=0;
		q=0;
		if(arrLen2!=0 &&arrLen1 !=0){
			while(true){
				System.out.println(i);
				System.out.println(p);
				System.out.println(q);
				if(p>=arrLen1-1){
					if (q<=arrLen2-1){
						while(true){
							if (q == arrLen2){
								break;
							}
							finalarr[i] = arr2[q];
							i++;q++;
							
						}
					}
					break;
				}
				else if (q>=arrLen2-1) {
					if(p <= arrLen1-1){
						while(true){
							if (p == arrLen1){
								break;
							}

							finalarr[i] = arr1[p];
							i++;p++;
							
						}
					}
					break;
				}
					
				
				else if (arr1[p]>arr2[q]){
					finalarr[i]=arr2[q];
					i++;
					q++;
				}
				else if (arr1[p]==arr2[q]) {
					finalarr[i]=arr2[q];
					
					p++;q++;i+=1;
	
					
				}
				else if(arr1[p]<arr2[q]){
					finalarr[i]=arr1[p];
					i++;
					p++;
				}
				
				System.out.println(Arrays.toString(finalarr));
			}
		}
		else if (arrLen1==0 ) {
			for (i =0; i <arrLen2; i++){
				finalarr[i]=arr2[i];
			}
			
		}
		else if(arrLen2==0){
			for (i =0; i <arrLen1; i++){
				finalarr[i]=arr1[i];
			}

		}
		System.out.print(Arrays.toString(finalarr));


	}
}