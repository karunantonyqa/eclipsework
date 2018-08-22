
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloWorld hi = new HelloWorld();
		int a = 4;
		int b = 6;

		System.out.println("Hello World!\n");

		System.out.println(a + " + " + b + " = " + hi.addition(a, b, false));
		System.out.println(a + " x " + b + " = " + hi.multiply(a, b));
		System.out.println(a + " / " + b + " = " + hi.divide(a, b));
		System.out.println(a + " - " + b + " = " + hi.subtract(a, b));
		System.out.println(a + " % " + b + " = " + hi.modulus(a, b));

	}

	public HelloWorld() {

	}

	public int addition(int a, int b, boolean bool) {
		if(bool) {
			a = a + b;
		}else {
			a = a*b;
		}
		return a;

	}

	public int multiply(int a, int b) {
		a = a * b;
		return a;
	}

	public int divide(int a, int b) {
		a = a / b;
		return a;
	}

	public int subtract(int a, int b) {
		a = a - b;
		return a;
	}

	public int modulus(int a, int b) {
		a = a % b;
		return a;
	}

}
