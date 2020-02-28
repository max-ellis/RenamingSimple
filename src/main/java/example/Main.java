package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class A {

  void foobar() {
	int x = 0;
	int y = 0;
	int z = x + y;
	System.out.println(z);
	System.out.println(y);
	System.out.println(x);
	int a = add(x,y);
	int b = mult(x,y);
	print(a);
	print(b);
	print(z);
  }
	
  int add(int a, int b) {

	return a + b;

  }

  int mult(int a, int b) {
	return a * b;
  }

  void print(int a) {
	System.out.println(a);

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
	int e = 4;
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




