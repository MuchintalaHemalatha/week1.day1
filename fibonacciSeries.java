package week1.day1;

public class fibonacciSeries {
//Fibonacci Series of given range
	public static void main(String[] args) {
		int range=8;
		int firstNum=0;
		int secNum=1;
		System.out.println(firstNum); 
		for(int i=1;i<range;i++) {
			
			int sum=0;
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			
			System.out.println(firstNum); 
		System.out.println("sum is:"+sum);

	}
	}
}
