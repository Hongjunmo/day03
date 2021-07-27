package day03;

import java.util.Scanner;

public class Ex07_if {
	public static void main(String[] args) {

		/*
		 * 제어문 : 프로그램의 흐름을 제어한다
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("1.쉬운게임");
		System.out.println("2.어려운게임");
		System.out.println("3.종료게임");
		System.out.print(">>> :");
		num = scan.nextInt();
		if (num == 1) {
			System.out.println("쉬운게임시작");
		}

		if (num == 2) {
			System.out.println("어려운게임시작");
		}

		if (num == 3) {
			System.out.println("게임을 종료함");
		}
	}
}