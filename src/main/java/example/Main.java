package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class newA {

  int newz = 5;

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



class B extends newA {
  void originalBar() {
	foo();
	int num = newz;
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
	int g = newz*newz;
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
	int l = newz+newz*newz;
  }

}




