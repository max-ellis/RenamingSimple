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


class B extends A {
  void bar() {
    int x = 5 * num;
  }

}


class C extends B {
  void foobar() {
    int z = 10 * num;
  }


}


