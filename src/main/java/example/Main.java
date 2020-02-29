package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class A {

  int z = 5;

  void foo() {
	int x = 0;
	int y = 0;
	int num = value1 + y;
	int a = addNum(x,y);
  }

  int addNum(int a, int b) {

	int c = a + b + z;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	return c;

  }

}



class B extends A {
  void originalBar() {
	foo();
	int a = z;
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
	int g = z*z;
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
	int l = z+z*z;
  }

}




