

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

class exampleClass2 {

    void foobar() {
	String code = "Code here";
	System.out.println(code);
    }

    void exampleMethodFoo1() {
	int x = 5;
	int y = 10;
	for(int z = 0; z < x; z++) {
		System.out.println(y * z);
	}
	System.out.println("This is a rename class and method example");
    }

}
