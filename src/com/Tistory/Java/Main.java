package com.Tistory.Java;

public class Main {
<<<<<<< HEAD
	
	public static void main (String... args) {	
		   
		        int a = 5, b = 10;

		        // 전위 증감 연산자[prefix]
		        int preA = ++a; // 값을 증가시키고, 그 결과를 리턴함..(=) 연산자에게
//		      a = a + 1;      // 전위 증감 : a의 값을 먼저 1 증가 시킨 후
//		      int preA = a;   //             preA 변수에 대입한다.

		        int preB = --b; // 값을 감소시키고, 그 결과를 리턴함..(=) 연산자에게
//		      b = b - 1;      // 전위 감소 : b의 값을 먼저 1 감소 시킨 후
//		      int preB = b;   //             preB 변수에 대입한다

		        System.out.println("unary: ++a = " + preA + ", --b = " + preB);
		}
	
	}
	

=======
	public static void main(String[] args) {
		Person person = new Person("Bob", 20, "Seoul");
		person.print();
		
//		Person.Address address = new Person.Address("Bob", 20, "Seoul");
	}
}
>>>>>>> origin/main
