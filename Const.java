class CheckName {
	public static void main(String[] args) {
	Name n = new Name();
	System.out.println(n.getName());	
	}
}
class Name {
	private final static String name = "abc";
	public String getName(){
		return name;
	}
}
	
