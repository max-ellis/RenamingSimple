package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class A {

  int variable = 5;
  int variable2 = 10;
  void foo() {
	int value = 0;
	int newY = 0;
	System.out.println(value);
	System.out.println(newY);
	value = 1;
	newY += value;
	int num = value + newY;
	int a = add(variable,variable2);
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



class B extends A {
  void originalBar() {
	foo();
	int num = z;
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




