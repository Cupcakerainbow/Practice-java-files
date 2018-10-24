class A {
	public static void main(String[] args) {
		int a[] = new int[10];
		try{
			System.out.println(a[50]);
		}
		catch(Exception e){
			System.out.println(e);

		}

		int b = 98;
		try{
			b = b / 0; 
			a[90] = a[90];
			
		}
		catch (ArithmeticException e) {
			System.out.println("Stopped at first Statement");
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Stopped at second statement");
		}
		finally{
			System.out.println("here");}
		try{
			b = b / 0; 
			a[90] = a[90];
			
		}
		catch (ArithmeticException e) {
			System.out.println("Stopped at first Statement");
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Stopped at second statement");
		}
		finally{
			System.out.println("here");}



	}
}