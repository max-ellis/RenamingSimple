package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class A {

  void foo() {
	int x = 0;
	int y = 0;
	int num = x + y;
	int a = addNum(x,y);
  }

  int addNum(int a, int b) {

	return a + b;

  }

}


class B extends A {
  void originalBar() {
	foo();
  }

}

class C extends A {
  void originalBar() {
    foo();
    int a = 0;
	int b = 1;
	int c = 2;
	int d = 3;
	int f = 4;
  }

}

class D extends A {
  void originalBar() {
    foo();
    int a = 0;
	int b = 1;
	int c = 2;
	int d = 3;
	int e = 5;
  }

}




