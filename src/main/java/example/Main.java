package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class A {
  int n = 5;

  void foo() {
    int x = n;
  }

}


class newB extends A {
  void bar() {
    int x = 5 * n;
	int a = 0;
  }

}


class C extends newB {
  void foobar() {
    int z = 9 * n;
  }


}


