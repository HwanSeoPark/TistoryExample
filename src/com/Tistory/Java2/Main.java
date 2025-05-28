package com.Tistory.Java2;

public class Main {
	
public static void main(String[] args){
    	
    	Object obj;
    	
         int[] numbers = {1,2,3,4,5,6,7,8,9,10};
         
         // 자바 컴파일러가 배열에 대한 for-each 문을 내부적으로 
         // for (int i = 0; i < arr.length; i++) 형태로 변환
         for (int item : numbers) {
             System.out.println("Count is: " + item);
         }
    }
}