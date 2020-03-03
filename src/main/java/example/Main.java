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
		int abcdefghijklmnoPName = 0;
		int x = abcdefghijklmnopName;
		int y = x * abcdefghijklmnopName;
		System.out.println(abcdefghijklmnoPName);

		int a = abcdefghijklmnoPName + abcdefghijklmnopName;


		System.out.println(abcdefghijklmnopName);
	}

}

