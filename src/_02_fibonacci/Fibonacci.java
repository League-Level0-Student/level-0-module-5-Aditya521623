package _02_fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
int num1 = 1;
int num2 = 1;
int sum = 0;
System.out.println(num1);
System.out.println(num2);
for(int i = 0;i<12;i++ ) {
	
	sum =num1+num2;
	num1=num2;
num2=sum;

System.out.println(sum);
}
	}

}
