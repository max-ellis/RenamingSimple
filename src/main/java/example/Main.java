package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class A {

  void foobar() {
	int value1 = 0;
	int y = 0;
	int num = value1 + y;
	int a = add(value1,y);
  }

  int add(int a, int b) {

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




