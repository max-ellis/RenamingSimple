package example;

class College extends School {
        String name;
        int students;
	String type;

        public College(String name, int students) {
			super(name, students);
            this.type = "University";
        }

	public void info() {
	    System.out.println("University will be renamed to College in the first commit");
	    System.out.println("College will be renamed to Place in the second commit");
	}

	public String getType() {
	    return this.type;
	}

	public String getName() {
	    return this.name;
	}

	public int getNumberOfStudents() {
	    return this.students;
	}

	public void foo() {
	    System.out.println("This will be renamed in the third commit");
	}

}
