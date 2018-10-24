class A <T>{
	T a ;
	T b ;
	void print(){
		//System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		A<Integer> c = new<Integer> A();
		c.a=10;
		c.b=20;
		System.out.println(c.a+c.b);
		c.print();
	}
}