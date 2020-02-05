package example;


public class Main {

    public static void main(String args[]){
      Parent1 parent1 = new Parent1();
      Child2 child2 = new Child2();
      int x = parent1.getInt();
      int y = child2.getInt();
      System.out.println(x + "  " + y);
    }

}


class Parent1 {

  public int x = 5;
  public int y = 10;
  public final int getInt() {
    where();
    return x*y;
  }

  public void where() {
    System.out.println("Here");
  }

}

class Child1 extends Parent1 {

  public void when() {
    System.out.println("Now");
  }

}

class Child2 {
  public int x = 5;
  public int y = 10;
  public final int getInt() {
    return y*x/2;
  } 

}



