package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class Xclass {

  int global1 = 5;
  int global2 = 10;

  void foo() {
	int x = 0;
	int y= 0;
	System.out.println(x);
	System.out.println(y);
	x = 1;
	y += x;
	int num = x + y;
	int a = add(x,y);
  }

  int add(int a, int b) {

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



class B extends Xclass {
  void originalBar() {
	foo();
	int num = global1;
  }

}

class C extends Xclass {
  void originalBar() {
    foo();
    int a = 0;
	int b = 1;
	int c = 2;
	int d = 3;
	int f = 4;
	int g = global1*global2;
  }

}
