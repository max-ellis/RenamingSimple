package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class newA {
  int num = 5;

  void foo() {
    int x = num;
  }

}


class newB extends newA {
  void bar() {
    int x = 5 * num;
  }

}


class newC extends newB {
  void foobar() {
    int z = 10 * num;
  }


}


