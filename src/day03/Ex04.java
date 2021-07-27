package day03;

public class Ex04 {
	public static void main(String[] args) {
		/*
		 논리 연산자
		 - 참 또는 거짓을 표현
		 
		 ||(or) : 하나라도 참이 존재하면 결과는 참
		 -true || false : true
		 - false || false : false
		  
		  &&(and) : 모두가 참일때 참 하나라도 거짓이 있으면 거짓 
		  true && false : false
		  true && true : true
		  
		  !(not) 결과를 반전시킴
		  !false : true
		  !true : false
		  
		 */

		System.out.println(false || true); //true
		System.out.println(true || true);// true
		System.out.println(true && true); //true
		System.out.println(true && false);//false
		System.out.println(!true); //false
		
	
	
	
	}
}
