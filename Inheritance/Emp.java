import java.util.*;
class Employee {
	static String companyName = "EME Tech";
	static int baseSalary = 1000;
	static int no_of_emp = 0 ;
	static String[] Emp_names = new String[100];
	String name ="";
	String perks;
	String work ;
	int Salary=0;

	void display() {
		System.out.println("Company Name: "+ companyName);
		System.out.println("Number of Employees: " + no_of_emp);
		System.out.println("Base Salary: " +baseSalary );
		System.out.println("Employee names: " );
		for (int i = 0; i < no_of_emp; i++ ) {
			System.out.println(Emp_names[i]);
		}

	}


}
class SoftwareEngineer extends Employee{
	void test(){
		System.out.print("Works");

	}
	
	SoftwareEngineer(String name){
		Salary = 10000+baseSalary ;
		this.name = name ;
		Emp_names[no_of_emp] = name;
		no_of_emp+=1;
		perks = "Health insurance , Free lunch";
		work = "Coding";
	}
}
class SrSoftware extends Employee{
	SrSoftware(String name){
		this.name = name ;
		Salary = 11000 + baseSalary ;
		Emp_names[no_of_emp] = name;
		no_of_emp+=1;
		perks = "Health insurance , Free lunch , accomundation and car";
		work = "Coding and Supervising ";

	}
}
class ModuleLead extends Employee{
	ModuleLead(String name){
		Salary = 5000 + baseSalary ;
		this.name = name ;
		Emp_names[no_of_emp] = name;
		no_of_emp+=1;
		perks = "Health insurance , Free lunch , free breakfast";
		work = "Supervising ";

	}
}
class TechnicalLead extends Employee{
	TechnicalLead(String name){
		Salary = 6000 + baseSalary ;
		this.name = name ;
		Emp_names[no_of_emp] = name;
		no_of_emp+=1;
		perks = "Health insurance , Free lunch , accomundation and car";
		work = "Coding, Supervising and hiring";

	}
}
class ProjectManagers extends Employee{
	static int Salary =  baseSalary -500 ;
	ProjectManagers(String name){
		this.name = name ;
		Emp_names[no_of_emp] = name;
		no_of_emp+=1;
		perks = "Everyone hates you";
		work = "Ordering people around ";

	}
}
class Director extends Employee{
	Director(String name){
		Salary = baseSalary ;
		this.name = name ;
		Emp_names[no_of_emp] = name;
		no_of_emp+=1;
		perks = "Can do whatever he wants including changing perks";
		work = "Does what he wants ";

	}

}

class access {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee database ");
		String name = "";
		Scanner sc = new Scanner(System.in);
		Employee[] arr = new Employee[100];
		int count =0 ;
			while(true){
				Scanner st = new Scanner(System.in);
				System.out.println("1. Press One for adding an  Employee\n2. Press Two for viewing general info about class\n3. Press 3 for searching");
				int option = sc.nextInt();
				if (option==1){
					System.out.println("1. Press One Software Engineer\n2. Press Two for Sr Software Engineer\n3. Press Three for Module Lead\n4. Press Four for Technical Lead\n5. Press Five for Project Managers\n6. Press Six for Director");
					option = sc.nextInt();
					switch(option){
						case 1 :
							System.out.println("Enter name of Employee");
							name = st.nextLine();
							arr[count] = new SoftwareEngineer(name);
							arr[count].test();
							count ++;
							break;
						case 2 :
							System.out.println("Enter name of Employee");
							name = st.nextLine();
							arr[count] = new SrSoftware(name);
							count ++;
							break;
						case 3 :
							System.out.println("Enter name of Employee");
							name = st.nextLine();
							arr[count] = new ModuleLead(name);
							count ++;
							break;
						case 4 :
							System.out.println("Enter name of Employee");
							name = st.nextLine();
							arr[count] = new TechnicalLead(name);
							count ++;
							break;
						case 5 :
							System.out.println("Enter name of Employee");
							name = st.nextLine();
							arr[count] = new ProjectManagers(name);
							count ++;
							break;
						case 6 :
							System.out.println("Enter name of Employee");
							name = st.nextLine();
							arr[count] = new Director(name);
							count ++;
							break;
						}
				}
			else if (option == 2){
				Employee e = new Employee();
				e.display();
				for(int i = 0 ; i< count ;i++){
					System.out.println("Employee Name: "+ arr[i].name);
					System.out.println("Employee Id: "+ (i+1));
					System.out.println("Salary: " + arr[i].Salary);
					System.out.println("Perks: " + arr[i].perks );
					System.out.println("Role " + arr[i].work );

				}
			}
			else if (option == 3){
				String searchName = st.nextLine();
				for(int i = 0 ; i < count ; i++){
					if(arr[i].name.equals(searchName)){
						System.out.println("Employee Name: "+ arr[i].name);
						System.out.println("Salary: " + arr[i].Salary);
						System.out.println("Perks: " + arr[i].perks );
						System.out.println("Role " + arr[i].work );
						break;
					}
					else if (i==count-1) {
						System.out.println("Not Found");
						
					}

				}
			}
			
		}

	}
		
	
}

	