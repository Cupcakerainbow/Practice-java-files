


class Derived extends Base {
	int sub ;
	void sub(int x , int y){
		a=x;
		b=y;
		sub =  x-y ;

	}
	void show(){
		System.out.println("Diff is = "+ sub);
	}
}
class Derived1 extends Derived{
	public static void main(String[] args) {
		Derived d = new Derived();
		d.sum(10,20);
		d.show();
		d.sub(20,10);
		d.show();
		Pattern P = new Pattern();
		P.Pat();




	}
}