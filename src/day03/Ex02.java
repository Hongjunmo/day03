package day03;

public class Ex02 {
	public static void main(String[] args) {

		/*  
		 
		   ���մ��� ������
		   a=10;
		   a= a+3 -> a+=3;
		   a= a*3; -> a*=3;
		   ...
		   */

		int su1, su2;
		su1=su2=5;
		
		System.out.println("su1 + 1 = " + (su1+=1)); //6
		System.out.println("su1 - 1 = " + (su1-=1)); //5
		System.out.println("su1 * su2 = " + (su1*=su2)); // 25
		System.out.println("su1 / su2 = " + (su1/=su2)); //5
		System.out.println("su1 % su2 = " + (su1%=su2)); //0
		
		
	
	
	
	}
}
