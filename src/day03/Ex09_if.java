package day03;

import java.util.Scanner;

public class Ex09_if {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;
		System.out.println("�� �Է�:");
		num = scan.nextInt();
		if(num%2==0) {
			System.out.println("¦��");
		}
		if(num%2==1) {
			System.out.println("Ȧ��");
		}
		
		
	}
}
