package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int i,n=0, sum=0;
		int a=3;
		n=a/2;
		if(a==0||a==1) {
		System.out.println(a+ "The number is not a prime");		
		}
		else {
			for (i=2;i<n;i++) {
				if(n%i==0) {
					System.out.println(a+"Number is not prime");
					sum=1;
					break;
					
				}
			}
			if(sum==0) {
				System.out.println(a+"is a prime number");
			}
		}
		
	}

}
