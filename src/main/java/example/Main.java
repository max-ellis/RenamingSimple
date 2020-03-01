package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class A {

  int newz = 5;

  void foo() {
	int x = 0;
	int y = 0;
	System.out.println(x);
	System.out.println(y);
	x = 1;
	y += x;
	int num = x + y;
	int a = addNum(x,y);
  }

  int addNum(int a, int b) {

	int c = a + b;
	System.out.println(c);
	System.out.println(a);
	a = a * a;
	b = b * b;
	c = c * b;
	b = c;
	return a + b;

  }

}



class B extends A {
  void originalBar() {
	foo();
	int num = newz;
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
	int g = newz*newz;
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
	int l = newz+newz*newz;
  }

}




