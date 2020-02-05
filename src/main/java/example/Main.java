package example;


public class Main {

    public static void main(String args[]){
      Parent1 parent1 = new Parent1();
      Child1 child1 = new Child1();
      int x = parent1.getNum();
      int y = child1.test();
      System.out.println(x + "  " + y);
    }

}


class Parent1 {

  public int x = 5;
  public int y = 10;
  public int getNum() {
    where();
    return x*y;
  }

  public void where() {
    System.out.println("Here");
  }

}

class Child1 extends Parent1 {

  public int test() {
    return getNum();
  } 

}

class Child2 {
  public int x = 5;
  public int y = 10;

}



