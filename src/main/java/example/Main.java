package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class A {
  int num = 5;

  void foo() {
    int x = num;
  }

}


class newB extends A {
  void bar() {
	int a = 0;
    int x = 5 * num;
  }

}


class C extends newB {
  void foobar() {
    int z = 10 * num;
  }


}


