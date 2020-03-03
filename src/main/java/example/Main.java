package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class ClassA {

	int abcdefghijklmnopName = 5;

	void foo() {
		int x = 2*abcdefghijklmnopName;
		int abcdefghijklmnopRes = add(x, abcdefghijklmnopName);
	}

	int add(int a, int b) {
		a*= abcdefghijklmnopName;
		return a + b;
	}

}

class ClassB extends ClassA{


	void bar() {
		int x = abcdefghijklmnopName;
		int y = x * abcdefghijklmnopName;

	}

}

