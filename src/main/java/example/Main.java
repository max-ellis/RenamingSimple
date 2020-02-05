package example;


public class Main {

    public static void main(String args[]){
      Type teacher = new Type();
      teacher.subject();
      teacher.associate();
    }

}

class Professor {
  
  public Professor() {
    System.out.println("Class Professor");
  }
  
  public static void associate() {
    System.out.println("Associate Professor");
  }

}

class Field extends Professor {

  public Field() {
    System.out.println("Class Field");
  }

  public static void subject() {
    System.out.println("Subject: Computer Science");
  }

}

class Type extends Field {
  
  public Type() {
    System.out.println("Type: Teacher");
  }



}
