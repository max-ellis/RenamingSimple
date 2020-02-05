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
  public void assertSubjectTest() {
    Type.subject();
    //assertEquals("Class Field\nType: Teacher\nSubject: Computer Science\n", content.toString());
    assertEquals("Subject: Computer Science\n", content.toString());
  }

  @Test
  public void assertAssociateTest() {
    Type.associate();
    //assertEquals("Class Professor\nClass Type\nAssociate Professor\n", content.toString());
    assertEquals("Associate Professor\n", content.toString());
  }
  
  @Test
  public void assertAllTest() {
    Type type = new Type();
    type.subject();
    type.associate();
    //assertEquals("Class Professor\nClass Type\nAssociate Professor\n", content.toString());
    assertEquals("Class Professor\nClass Field\nType: Teacher\nSubject: Computer Science\nAssociate Professor\n", content.toString());
  }



  @After
  public void restoreStream() {
    System.setOut(originalOut);
  }

}
