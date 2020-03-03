package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class A {

	int alphaZ;

	void foo() {
	
	int a = alphaZ;
	int b = alphaZ + 1;
	int c = alphaZ + 2;

	}

}

class B extends A {

	void bar() {
	
		int a = alphaZ;
		int b = alphaZ * 20;
		int z = alphaZ + alphaZ;

		System.out.println(alphaZ);


	}

}
