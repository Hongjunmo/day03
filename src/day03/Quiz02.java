package day03;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		
		System.out.println("�� �Է�:");
		int num= scan.nextInt();
		if(num%3 ==0) {
			System.out.println("3�� ����Դϴ�: " +num);
		}else {
			System.out.println("3�� ����� �ƴմϴ� : " + num);
		}
		
	System.out.println("2)�� �Է�:");
	int num2 = scan.nextInt();
	if(num2<0) {
		System.out.println("���밪�� :"+Math.abs(num2));
	}
		
	System.out.println("3) �� �Է�:");
	int num3 = scan.nextInt();
	System.out.println("3-1) �� �Է�:");
	int num4 = scan.nextInt();
		if (num3>num4){
			System.out.println("���� ū ���� :"+num3);
		}else {
			System.out.println("���� ū ���� :"+num4);
		}
		
		System.out.println("4) �� �Է�:");
		int num5 = scan.nextInt();
		System.out.println("4-1) �� �Է�:");
		int num6 = scan.nextInt();
		System.out.println("4-2) �� �Է�:");
		int num7 = scan.nextInt();
		
		if(num5>num6&&num5>num7) {
			System.out.println("���� ū ���� :"+num5);
		}else if (num6>num5&&num6>num7) {
			System.out.println("���� ū ���� :"+num6);
		}else {
			System.out.println("���� ū ���� :"+num7);
		}
		
	
		System.out.println("5) �� �Է�:");
		int num8 = scan.nextInt();
		System.out.println("5-1) �� �Է�:");
		int num9 = scan.nextInt();
			if (num8>num9&& num8%2==0){
				System.out.println("���� ū ���̸� ¦��:"+ num8);
			}else if (num9>num8 && num9%2==0) {
				System.out.println("���� ū ���̸� ¦��:"+ num9);
			}else {
				System.out.println("ū���� ¦���� �ƴմϴ�.");
			}
		

		System.out.println("6) �� �Է�:");
		int n1 = scan.nextInt();
		System.out.println("6-1) �� �Է�:");
		int n2 = scan.nextInt();
		
	int	total=n1+n2;
	
		if(total%2==0 && total%3==0) {
			System.out.println("���� ¦��, 3�ǹ�� : " + total);
		}else
		System.out.println("¦���� �ƴϰų� 3�� ����� �ƴմϴ�.");
		
	
	
	
	}

}
