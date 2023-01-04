package interface01;
// 인터페이스
/*
 * 인터페이스 : 다른 언어에서 찾아보기 힘든 고급기능
 * 어떻게 사용??
 * 
 * 인터페이스란? 추상클래스 = 추상화
 * 추상클래스는 추상 메소드를 가지고 있다.
 * 				일반 메소드를 가지고 있다.
 * 인터페이스는 오직 추상메소드만 가지고 있다.
 * 인터페이스 내에 존재하는 메소드는 모두 추상메소드.(public abstract 메소드명)
 * 인터페이스 내에 존재하는 변수는 모두 상수.(static final)
 * 
 * 인터페이스는 다중상속 가능.
 * 
 * 인터페이스 선언방식 : interface AAA{}. class 대신 interface
 * interface AAA{
 * 		static final int NUM = 100;
 * 		public abstract void print();	
 * }	
 * 
 * 인터페이스를 상속받는 클래스 :  extends 대신 implements
 * class Cat implements AAA{  
 * 		// AAA에 미구현된 내용을 구현한다.
 * 		@Override
 * 		public void print(){
 * 			// 구현해준다
 * 		}
 * }
 * 
 * 특징 : 인터페이스는 객체로 만들 수 있나요? No.
 * 인터페이스는 기능을 전달하는 목적이므로 객체생성 안됨.
 * 
 * 주의
 * 클래스에 인터페이스 상속시 인터페이스 내 모든 추상메소드를 구현(Override)해야한다.
 * 
 * 상속 vs 인터페이스 ?
 *				상속								인터페이스
 *ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 * 		class A extends B {}					class A implements B {}
 * B 클래스를 상속받아 A에 기능추가 		B 인터페이스의 기능을 A에 구현
 * 			순수상속								권한상속
 * 	: 부모로부터 모든 권한/ 능력 가져옴			: 인터페이스만 가져옴. 비어있는 것을 가져와서 그 속을 채워넣는다.
 *
 *
 */

interface SayHi{	// 인터페이스 선언
	public abstract void sayHi();	
	public void sayBye();	// 인터페이스 내 메소드는 모두 추상메소드이므로 abstract 생략가능
}

class Start /*extends Object*/ implements SayHi {	// 인터페이스와 연결. extends를 먼저, implements를 뒤에 기재

	@Override
	public void sayHi() {
		
	}

	@Override
	public void sayBye() {
		
	}		
	
}

public class Interface {

}
