package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class newA {

  void foobar() {
	int x = 0;
	int y = 0;
	int z = x + y;
	System.out.println(z);
	System.out.println(y);
	System.out.println(x);
  }

}


class B extends newA {
  void originalBar() {
	foobar();
  }

}

class C extends newA {
  void newBar() {
    foobar();
    int a = 0;
	int b = 1;
	int c = 2;
	int d = 3;
	int e = 4;
  }

}

class D extends newA {
  void originalBar() {
    foobar();
    int a = 0;
	int b = 1;
	int c = 2;
	int d = 3;
	int e = 5;
  }

}




