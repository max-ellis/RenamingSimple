

public class main {

    public static void main(String args[]){
        foo();
    }

    private static void foo(){
        int x = getIntX();
        int y = getIntY();
	x = x*x;
        graph(x, y);
    }
    private static void graph(int a, int b){
        System.out.println(a*b);
    }
}

class A {

    void foo() {
	System.out.println("This is a rename class and method example");
    }

}
