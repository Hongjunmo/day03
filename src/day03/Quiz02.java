package day03;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		
		System.out.println("수 입력:");
		int num= scan.nextInt();
		if(num%3 ==0) {
			System.out.println("3의 배수입니다: " +num);
		}else {
			System.out.println("3의 배수가 아닙니다 : " + num);
		}
		
	System.out.println("2)수 입력:");
	int num2 = scan.nextInt();
	if(num2<0) {
		System.out.println("절대값은 :"+Math.abs(num2));
	}
		
	System.out.println("3) 수 입력:");
	int num3 = scan.nextInt();
	System.out.println("3-1) 수 입력:");
	int num4 = scan.nextInt();
		if (num3>num4){
			System.out.println("제일 큰 수는 :"+num3);
		}else {
			System.out.println("제일 큰 수는 :"+num4);
		}
		
		System.out.println("4) 수 입력:");
		int num5 = scan.nextInt();
		System.out.println("4-1) 수 입력:");
		int num6 = scan.nextInt();
		System.out.println("4-2) 수 입력:");
		int num7 = scan.nextInt();
		
		if(num5>num6&&num5>num7) {
			System.out.println("제일 큰 수는 :"+num5);
		}else if (num6>num5&&num6>num7) {
			System.out.println("제일 큰 수는 :"+num6);
		}else {
			System.out.println("제일 큰 수는 :"+num7);
		}
		
	
		System.out.println("5) 수 입력:");
		int num8 = scan.nextInt();
		System.out.println("5-1) 수 입력:");
		int num9 = scan.nextInt();
			if (num8>num9&& num8%2==0){
				System.out.println("가장 큰 수이며 짝수:"+ num8);
			}else if (num9>num8 && num9%2==0) {
				System.out.println("가장 큰 수이며 짝수:"+ num9);
			}else {
				System.out.println("큰수가 짝수가 아닙니다.");
			}
		

		System.out.println("6) 수 입력:");
		int n1 = scan.nextInt();
		System.out.println("6-1) 수 입력:");
		int n2 = scan.nextInt();
		
	int	total=n1+n2;
	
		if(total%2==0 && total%3==0) {
			System.out.println("합이 짝수, 3의배수 : " + total);
		}else
		System.out.println("짝수가 아니거나 3의 배수가 아닙니다.");
		
	
	
	
	}

}
