class InvalidMarksExpection extends Exception{
	InvalidMarksExpection(String args){
		super(args);
	}
}

class Marks {
	void show(int a){
		if(a<50){
			throw new InvalidMarksExpection("Not Valid");
		}
		else{
			System.out.println("OK");
		}
	}
	public static void main(String[] args) {
		Marks m = new Marks();
		m.show(60);
		m.show(25);

	}
}

