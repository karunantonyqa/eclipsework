
public class Blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(blackJack(24,22));
		
		System.out.println(uniqueSum(11,7,7));
		
		System.out.println(tooHot(90, true));
	}
	
	public static int blackJack(int a, int b) {
		int c = 0;
		
		if((a <= 21 && a>0)&&(b <= 21 && b>0)) {
			c = Math.max(a, b);
		}else if(a>21 && b<21) {
			c=b;
		}else if(a<21 && b>21) {
			c=a;
		}
		return c;		
	}
	
	public static int uniqueSum(int a, int b, int c) {
		
		if(a==b || b==c) {
			b=0;
		}else if(c==a){
			c=0;
		}
		
		if(a!=b && a!=c && b!=c) {
			c = a+b+c;
		}		
		return c;
	}
	
	public static boolean tooHot(int temp, boolean isSummer) {
		boolean inRange = false;
		if(isSummer) {
			if(temp>=90 && temp<=100) {
				inRange = true;
			} else if(!isSummer) {
				if(temp>=60 && temp<=90) {
					inRange = true;
				}else {
					inRange = false;
				}
				
			}
		}
		return inRange;
	}

}
