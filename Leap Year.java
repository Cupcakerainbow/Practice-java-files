class LeapYear{
	public static void main(String[] args) {
		int year = 2000;
		if (year%4 == 0 ){

			if (year%100==0){
				if(year%400==0){
					
					System.out.println("Is a Leap year");
				}
				else{
					System.out.println("Not a Leap year");	
				}
			}
			else{
					System.out.println("Is a Leap year");
				}
		}
		else{
			System.out.println("Not a Leap year");
		}
	}
} 