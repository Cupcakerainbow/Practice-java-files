import java.util.*;
class Overloading {
	static int Sum(int a, int b){
		return a+b;
	}
	static int Sum(int a , int b , int c){
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.print(Sum(10,20));
		System.out.print(Sum(10,20,40));


	}
}