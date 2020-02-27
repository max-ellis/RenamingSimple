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
    int x = 5 * num;
	int a = 0;
  }

}


class C extends newB {
  void foobar() {
    int z = 9 * num;
  }


}


