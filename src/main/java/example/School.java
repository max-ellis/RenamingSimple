package example;

public class School {
	String name;
	int students;

	public School(String name, int students) {
		this.name = name;
		this.students = students;
	}

	public int method1() {
	    System.out.println("This will be renamed second");
	    return students - 15;
	}

	public String same() {
	    String str = "School will be renamed in the second commit with method1";
	    return str;
	}

}

