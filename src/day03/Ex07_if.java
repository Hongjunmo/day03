package day03;

import java.util.Scanner;

public class Ex07_if {
	public static void main(String[] args) {

		/*
		 * ��� : ���α׷��� �帧�� �����Ѵ�
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("1.�������");
		System.out.println("2.��������");
		System.out.println("3.�������");
		System.out.print(">>> :");
		num = scan.nextInt();
		if (num == 1) {
			System.out.println("������ӽ���");
		}

		if (num == 2) {
			System.out.println("�������ӽ���");
		}

		if (num == 3) {
			System.out.println("������ ������");
		}
	}
}