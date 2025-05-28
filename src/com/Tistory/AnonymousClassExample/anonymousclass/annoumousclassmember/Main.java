package com.Tistory.AnonymousClassExample.anonymousclass.annoumousclassmember;

public class Main {
	public static void main(String... args) {
		// HelloWorld 인터페이스를 익명 클래스로 구현
		HelloWorld anonymous  = new HelloWorld() {

			// 익명 클래스의 멤버 변수
			private String name = "Bob";
			
			// 익명 클래스의 추가 메서드(고유 메서드)
		    public void introduce() {
		    	System.out.println("[내부 메서드] 이름은 : " + name);
		    }
			
		    // 익명 클래스 멤버 변수 접근
			@Override
			public void Hello() {
				System.out.println("안녕하세요, 제 이름은" + name + "입니다!!");				
			
				// 익명 클래스 내부 메서드 호출
				introduce();
			}			
		};
		anonymous.Hello();
		
//		anonymous.introduce(); // ❌ 컴파일 에러: HelloWorld 타입에는 존재하지 않음
	}
}
