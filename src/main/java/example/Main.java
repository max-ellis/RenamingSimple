package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class newA {
  int y = 5;
  void foo() {
    int x = y;
  }

}


class B extends newA {
  void bar() {
    int x = 5 * y;
  }

}


class newC extends B {
  void foobar() {
    int z = 10 * y;
  }


}


