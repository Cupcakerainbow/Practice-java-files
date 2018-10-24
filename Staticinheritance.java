class A{
	void show(){
		System.out.println("A");
	}
}
class B extends A {
	void show(){
		System.out.println("B");
	}
	void show0(){
		System.out.println("B0");
	}
	public static void main(String[] args) {
		A b = new B();
		b.show();

	}
