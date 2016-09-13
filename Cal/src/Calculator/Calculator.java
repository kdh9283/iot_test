package Calculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("덧셈 기능");
		System.out.println("첫번째 숫자를 입력하세요");
		int first=sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int second = sc.nextInt();
		int sum=first+second;
		System.out.println("합 : "+sum);
	
	}

	

}
