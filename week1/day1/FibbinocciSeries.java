package week1.day1;

public class FibbinocciSeries {
 public static void main(String[] args) {
	int a=0,b=1;
	int c;
	int sum=11;
	System.out.println(a+" "+b);
	for (int i=2;i<sum;++i) {
		c=a+b;
		System.out.println(""+c);
		a=b;
		b=c;
		
	}
}
}
