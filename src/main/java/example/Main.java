package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class A {

	int alpha;

	void foo() {
	
	int a = alpha;
	int c = alpha + 2;

	B b = new B();
	
	b.barz();

	}

}

class B extends A {

	void barz() {
	
		int a = alpha;
		int b = alpha * 20;
		int z = alpha + alpha;

		System.out.println(alpha);


	}

}
