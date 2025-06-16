package com.tistoryexample.java2;

public class Main {
	

public static void main(String[] args){

	// main 메서드 작성시,static 키워드를 지정해야하는 이유?
		// : 프로젝트의 모든 클래스 객체의 인스턴스를 생성하지 않아도 호출 가능한 정적 메서드(static)를 진입접을 지정함으로써,
		//   실행을 위한 객체의 생성과 메모리 할당을 실제 해당 객체가 사용될 때까지 지연될수 있다.
		//   즉, 불필요한 객체 생성으로 인한 메모리 낭비를 방지한다.
		// 메인 메서드는 C언어의 메인 함수로부터 차용했다
		// c언어의 main 함수는 int 데이터 타입의 값을 리턴함
		// c언어의 main 함수가 종료될 때 0 또는 -1이라는 int 데이터 타입의 값을 리턴함.
		// 0 이라는 값의 의미는 정상적으로 main 함수가 종료됨을 의미
		// -1 이라는 값의 의미는 비정상적(에러나 예외가 발생됨)으로 main 함수가 종료됨을 의미함
		// 아래 방식처럼 구현해야함
		// class level
		// member level

    	
    	Object obj;
    	
         int[] numbers = {1,2,3,4,5,6,7,8,9,10};
         
         // 자바 컴파일러가 배열에 대한 for-each 문을 내부적으로 
         // for (int i = 0; i < arr.length; i++) 형태로 변환
         for (int item : numbers) {
             System.out.println("Count is: " + item);
         }
    }
}