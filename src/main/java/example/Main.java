package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class newA {

  void foo() {
	int x = 0;
	int y = 0;
	int num = x + y;
	int a = addNum(x,y);
  }

  int addNum(int a, int b) {

	int c = a + b;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	return c;

  }

}



class B extends newA {
  void originalBar() {
	foo();
  }

}

class C extends newA {
  void originalBar() {
    foo();
    int a = 0;
	int b = 1;
	int c = 2;
	int d = 3;
	int f = 4;
  }

}

class D extends newA {
  void originalBar() {
    foo();
    int a = 0;
	int b = 1;
	int c = 2;
	int d = 3;
	int e = 5;
  }

}




