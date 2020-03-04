package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class A {

	int alpha;

	void foobar() {
	
	int a = alpha;
	int c = alpha + 2;

	B b = new B();
	
	b.bar();

	}

}

class B extends A {

	void bar() {
	
		int a = alpha;
		int b = alpha * 20;
		int z = alpha + alpha;

		System.out.println(alpha);


	}

}
