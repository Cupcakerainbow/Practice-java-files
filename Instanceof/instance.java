class A {
	void show(){
		System.out.println("A");
	}

}
class B extends A{
	void show(){
		System.out.println("B");
	}
}
class D{
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a instanceof A);
		B b = new B();
		System.out.println(b instanceof B);
		System.out.println(b instanceof A);
		A c = new B();
		System.out.println(c instanceof B);
		System.out.println(c instanceof A);

	}
}