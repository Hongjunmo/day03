package day03;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("�����Է�: ");
		int input1=scan.nextInt();
		if(input1%2==0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
		if (input1%3==0) {
			System.out.println("3�� ���");
		}else {
			System.out.println("3�� ����� �ƴմϴ�");
		}
	
		System.out.println("num1 �� �Է�:");
		int num1=scan.nextInt();
		System.out.println("num2 �� �Է�:");
		int num2=scan.nextInt();
		if(num1<num2) {
			System.out.println("num2�� num1���� ũ��");
		}else {
			System.out.println("num2���� num1�� ũ��");
		}
		
		scan.close();
	}
}
