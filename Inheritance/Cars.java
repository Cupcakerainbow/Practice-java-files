import java.util.*;
class Cars extends Company {
	void create()
	{	
		Scanner st = new Scanner(System.in);
		System.out.println("Enter model number");
		this.model = st.nextLine();
		System.out.println("Enter year of manufacture");
		this.yom = st.nextInt();
		System.out.println("Enter top speed");
		this.topspeed  = st.nextInt() ;
		csd = 1 ;
		no_of_units_sold++;
	}	
	void displayinfo (){
		System.out.println("Model number " + model);
		
		System.out.println("Year of manufacture "+ yom);
		
		System.out.println("Top speed "+ topspeed );
	

	}	
	int csd(){
		return csd;
	}
	void sell(){
		csd =2 ;
	}
	void display(){
		csd =3;
	}

}
class Company  {
	static int no_of_units_sold = 0;
	String model;
	int yom;
	int topspeed;
	int csd;

}
class Sales{
	public static void main(String[] args) {
		Cars c[] = new Cars[100];
		int count = 0;
		while(true){
			System.out.println("1. Add car data\n2.List of cars sold ,  created and on display\n3.Number of cars manufactured");
			Scanner sc= new Scanner(System.in);

			int option = sc.nextInt();
			switch (option){
				case 1 :
					System.out.println("1.To create a new car \n2.To sell one of the created cars\n3.To put on display");
					option= sc.nextInt();
					switch(option){
						case 1:
							c[count] = new Cars();
							c[count].create();
							count++;
							break;
						case 2:
							System.out.println("List of created cars that were not sold");

							for(int i = 0 ; i <count ; i++){
								if(c[i].csd()==1){
									System.out.println("Car id  "+(i+1)+" info :");
																		
									c[i].displayinfo();

								}
							}
							System.out.println("Enter Car number");
							option =sc.nextInt();
							c[option-1].sell();
							break;

						case 3 :

							System.out.println("List of created cars that were not sold ");
							for(int i = 0 ; i <count ; i++){
								if(c[count].csd()==1){
									System.out.println("Car id  "+(i+1)+" info :");
																		
									c[count].displayinfo();

								}
							}

							System.out.println("Enter Car number");
							option =sc.nextInt();
							c[option-1].display();
							break;
						default:
							break;
						}
					break;


				case 2 :
					System.out.println("List of created cars that were not sold ");
					for(int i = 0 ; i <count ; i++){
						if(c[i].csd()==1){
							System.out.println("Car id  "+(i+1)+" info :");
																		
							c[i].displayinfo();

						}
					}
					System.out.print("List of Sold Cars ");
					for(int i = 0 ; i <count ; i++){
						if(c[i].csd()==2){
							System.out.println("Car id  "+(i+1)+" info :");
																		
							c[i].displayinfo();

						}
					}
					System.out.print("List of  Cars  on display");
					for(int i = 0 ; i <count ; i++){
						if(c[i].csd()==3){
							System.out.println("Car id  "+(i+1)+" info :");
																		
							c[i].displayinfo();

						}
					}
					break;
				case 3:
					System.out.println(count +1 );
				default:
							break;


			}
		}	

	}
		
}
