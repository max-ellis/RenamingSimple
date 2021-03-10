package example;


public class Main {

    public static void main(String args[]){
	System.out.println("Example for nested refactorings across commits");
	String name = "RefMerge University";
	Place university = new Place(name, 50);
	int students = Main.getNumberOfStudents(university);

    }

    public static int getNumberOfStudents(Place school) {
	System.out.println("Main will be renamed in the first commit and this will be renamed to getStudents in the third commit");
	return school.getNumberOfStudents();
    }

}


