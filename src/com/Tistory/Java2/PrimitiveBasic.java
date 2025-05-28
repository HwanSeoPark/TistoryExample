package com.Tistory.Java2; // 현재 Main 클래스가
								
// Main,java --> Main.class
// java(.exe) -cp . Main(.class) <---- CMD에서 실행시키는 실습을 한적 있음
public class PrimitiveBasic {

	public int iamInstanceVariable; // Main 클래스 객체가 생성되었을 때 사용!!
									// iamInstanceVariable은
									// Main 클래스 객체가 생성될 때 생성됨.	
	public static int iamStaticVarible; // Main class 파일이 VM에 의해서 메모리가 로드되면
                                        // 라이프 사이클(생명주기[셍성/소멸])이 시작됨 
	
	
		
//	   static {
//		   System.out.println ("Hello World");
//	   }
	
		public static void main(String ...args/*String[] args*/) {
		
		    // size : 8bit (Msb는 sign 비트, 나머지 7비트는 절대 값)
			byte onebyte = 127; // 128일때 오류 메세지 : Type mismatch: cannot convert from int to byte
			byte minusOneByte = -128;
			
			// size : 16bit (sign bit:msb 위치에 있고, 15비트가 절대값을 표현)
			short oneShort = 32767;
			short minusOneShort = -32768;
			
			
			// 양의 정수 값은 2^31(2,147,483,647)
			int x = 2147483647; // 로컬 변수는 디폴트 값을 지원하지 않는다. 값을 지정해 줘야한다.
			
			// 2,147,483,648
			// 2^63
			long xxx = 2_147_483_648L; // ,대신 _사용 
									   //2147483647 값과 비교
			
			System.out.println(x);
			
			// local[지역] 변수의 라이프 사이클은 main 메서드 호출[생성]과 리턴[소멸] 기간내에만 존재
			int innerVariable = 0;
		
			int localVariable = PrimitiveBasic.iamStaticVarible;
		
			char oneChar = 'H';
			char secondChar = 'e';
			char thirdChar = 'l';				
			char fourthChar = 'l';
			char fithChar = 'o';
			//charater은 하나의 문자만 저장 가능
			
			// 문자열...
			// str은 String 클래스 객체를 참조하는 참조 변수...
			String str = "Hello"; // 문자열 literar을 바로 사용할수 있음(특수한 literal임)
			//위의 식을 String str = new String("Hello"); << 컴파일러가 이런식으로 자동 번역해줌
			
			// new 연산자와 해당 클래스의 컨스트럭터를 호출식을 조합한 코드로 특정 클래스 객체를 생성한다
			String str2 = new String("Hello");
			
	}

}
