

public class main {


    private void extracted() {
        int y = getY();
	x=x*x;
        print(x, y);

    }


    public static void main(String args[]){
        mult();
    }

    private static void mult(){
        int x = getX();
	extracted();
    }


}

class exampleClass1 {

    void exampleMethodBar() {
	int x = 5;
	int y = 10;
	for(int z = 0; z < x; z++) {
		System.out.println(y * z);
	}
	System.out.println("This is a rename class and method example");
    }

}
