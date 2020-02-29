package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class A {

  void foo() {
	int value1 = 0;
	int y = 0;
	int num = value1 + y;
	int a = addNum(value1,y);
  }

  int addNum(int a, int b) {

	int c = a + b;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	return c;

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




