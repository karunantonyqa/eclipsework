import java.util.ArrayList;
import java.util.Random;

public class BasicExcercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Hello World!");
		
		String hello = "Hello World!";
		System.out.println(hello);
		
		Hello(hello);
		
		Hello2();
		
		boolean sumBool = true;
		
		System.out.println(sum(5,10, sumBool));
		
		//check zero
		System.out.println(checkZero(0,11));
		System.out.println(checkZero(4,0));
		
		
		//for loop
		for(int i=0;i<10;i++) {
			System.out.println(checkZero(1,0));
		}
		
		//arrays 
		
	int[] array = new int[10];
	
	Random rand = new Random();
	int randNum = rand.nextInt(50);
	
	for(int i=0;i<10;i++) {
		array[i] = i*randNum;
		System.out.println("Array values: " + array[i]);
		System.out.println("Check zero " + checkZero(array[i], 0));
		array[i] = array[i]*10;
		System.out.println("array value x10: " + array[i]);
	}


	}
	
	public static void Hello(String a) {
		System.out.println(a);
	}
	
	public static String Hello2() {
		String a = "Hello World!";
		return a;
	}
	
	public static int sum(int a, int b, boolean bool) {
	
		
		if(bool) {
			a = a+b;
		} else {
			a = a*b;
		}
		
		return a;
	}
	
	public static int checkZero(int a, int b) {
		int c = 0;
		if(a == 0 && b !=0) {
			c = b;
		} else if(b==0 && a !=0) {
			c = a;
		}
		return c;
	} 

}
