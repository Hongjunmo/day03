package day03;

public class Ex05 {
	public static void main(String[] args) {

		/*
		 * 
		 * ++: 자기 자신을 1 증가시킴 --: 자기 자신을 1 감소시김
		 * 
		 */

		int su1 = 5;
		su1++;
		System.out.println(su1);
		++su1;
		System.out.println(su1);

		int n1, n2, n3;
		n1 = 10;
		n2 = ++n1; // 연산보다 자신을 먼저 증가
		n1 = 10;
		n3 = n1++; // 모든 연산이 끝나고 자신을 증가
		System.out.println(n2); // 11
		System.out.println(n3); // 10

	}
}
