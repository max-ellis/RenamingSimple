package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class A {
  int y = 5;
  void foo() {
    int x = y;
  }

}


class B extends A {
  void bar() {
    int x = 5 * y;
  }

}


class C extends B {
  void foobar() {
    int z = 10 * y;
  }


}


