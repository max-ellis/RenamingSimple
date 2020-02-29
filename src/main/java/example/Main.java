package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class newA {

  void foo() {
	int value1 = 0;
	int y = 0;
	int num = value1 + y;
	int a = add(x,y);
  }

  int add(int a, int b) {

	return a + b;

  }

}



class newB extends newA {
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




