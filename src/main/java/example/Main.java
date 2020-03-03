package example;


public class Main {

    public static void main(String args[]){
      
    }

}

class ClassA {

	int abcdefghijklmnopNames = 5;

	void foo() {
		int x = 2*abcdefghijklmnopNames;
		int abcdefghijklmnopRes = add(x, abcdefghijklmnopNames);
	}

	int add(int a, int b) {
		a*= abcdefghijklmnopNames;
		return a + b;
	}

}

class ClassB extends ClassA{


	void bar() {
		int x = abcdefghijklmnopNames;
		int y = x * abcdefghijklmnopNames;

	}

}

