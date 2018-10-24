    class Abc{  
    static int a, b ; 
       
     public static void main(String args[]){  
      Abc abc = new Abc();
      abc.a =10;
      abc.b=20;
      Abc ab = new Abc();
      ab.a = 20;
      ab.b = 30;
      display();
      Abc ac = new Abc();
      ac.display();  
     }
     static void display()
     {
     	System.out.println(a + " " + b);
     }  
    }        