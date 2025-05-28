package com.Tistory.Java2;

public class UseArrays {
	public static void useArray() {
		int[] studentsId = new int[20];	
		for (int i=0; i<studentsId.length; i++) { // .멤버 엑세스 연산자를 쓴걸로 보아 객체로 취급한다
			studentsId[i] = i + 1;
		}		
		// for은 반목구문
		for (int i=0; i<studentsId.length; i++) {
			studentsId[i] = studentsId[i] + 1000;
		}
	}
}