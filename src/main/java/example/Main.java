package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class newA {

  void foo() {
	int x = 0;
	int y = 0;
	int z = x + y;
	System.out.println(z);
	System.out.println(y);
	System.out.println(x);
  }

}


class B extends newA {
  void bar() {
	foo();
  }

}




