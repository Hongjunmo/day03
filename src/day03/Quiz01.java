package day03;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("수를입력: ");
		int input1=scan.nextInt();
		if(input1%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		if (input1%3==0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("3의 배수가 아닙니다");
		}
	
		System.out.println("num1 수 입력:");
		int num1=scan.nextInt();
		System.out.println("num2 수 입력:");
		int num2=scan.nextInt();
		if(num1<num2) {
			System.out.println("num2가 num1보다 크다");
		}else {
			System.out.println("num2보다 num1이 크다");
		}
		
		scan.close();
	}
}
