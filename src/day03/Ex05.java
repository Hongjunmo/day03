package day03;

public class Ex05 {
	public static void main(String[] args) {

		/*
		 * 
		 * ++: �ڱ� �ڽ��� 1 ������Ŵ --: �ڱ� �ڽ��� 1 ���ҽñ�
		 * 
		 */

		int su1 = 5;
		su1++;
		System.out.println(su1);
		++su1;
		System.out.println(su1);

		int n1, n2, n3;
		n1 = 10;
		n2 = ++n1; // ���꺸�� �ڽ��� ���� ����
		n1 = 10;
		n3 = n1++; // ��� ������ ������ �ڽ��� ����
		System.out.println(n2); // 11
		System.out.println(n3); // 10

	}
}
