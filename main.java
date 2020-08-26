

public class main {

    public static void main(String args[]){
        foo();
    }

    private static void foo(){
        int x = getIntX();
        int y = getIntY();
	x = x*y;;
        graph(x, y);
    }
    private static void graph(int a, int b){
        System.out.println(a*b);
    }
}

class exampleClass {

    void bar() {
	String code = "Code here";
	System.out.println(code);
    }

    void exampleMethodFoo() {
	int x = 5;
	int y = 10;
	for(int z = 0; z < x; z++) {
		System.out.println(y * z);
	}
	System.out.println("This is a rename class and method example");
    }

}
