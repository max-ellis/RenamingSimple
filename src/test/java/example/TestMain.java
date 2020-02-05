package example;

import example.Main;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before; 


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestMain {
  private final ByteArrayOutputStream content = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @Before
  public void setUpStream() {
    System.setOut(new PrintStream(content));
  }

  @Test
  public void assertIntTest() {
    Parent1 parent1 = new Parent1();
    int x = parent1.getInt();
    assertEquals(x, 50);
  }

  @Test
  public void assertValTest() {
    Child1 child1 = new Child1();
    int y = child1.getVal();
    assertEquals(y, 25);
  }



  @After
  public void restoreStream() {
    System.setOut(originalOut);
  }

}
