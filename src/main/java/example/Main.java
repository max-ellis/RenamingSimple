package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class A {

  void foobar() {
	int x = 0;
	int y = 0;
	int num = x + y;
	int a = add(x,y);
  }
	
  int add(int a, int b) {
	System.out.println("Will this break?");
	return a + b;

  }

}


class B extends A {
  void originalBar() {
	foobar();
  }

}

class C extends A {
  void originalBar() {
    foobar();
    int a = 0;
	int b = 1;
	int c = 2;
	int d = 3;
	int f = 4;
  }

}

class D extends A {
  void originalBar() {
    foobar();
    int a = 0;
	int b = 1;
	int c = 2;
	int d = 3;
	int e = 5;
  }

}




