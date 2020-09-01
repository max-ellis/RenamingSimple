

public class main {

    public static void main(String args[]){
        graph();
    }

    private static void method(){
        int x = getIntX();
        int y = getIntY();
	x = x*y;;
        graph(x, y);
    }
    private static void method(int a, int b){
        System.out.println(a*b);
    }
}

class superClass {

    void foo() {
	String code = "Code here";
	System.out.println(code);
    }

    void methodbar() {
	int x = 5;
	int y = 10;
	for(int z = 0; z < x; z++) {
		System.out.println(y * z);
	}
	System.out.println("This is a rename method override example");
    }

}

class subClass extends superClass {

    void foo() {
	String code = "subclass code here";
	System.out.println(code);
    }

    void method() {
	String words = "This is in no way related to bar above";
	System.out.println(words);
    }
}
