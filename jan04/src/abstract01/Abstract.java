package abstract01;
// 추상화
/*
 * 추상화 : 인스턴스화할 필요가 없는 성질의 클래스
 * 자바에서는 객체지향으로 프로그램이 실행되는데
 * 이 추상화라는 개념을 클래스에 적용시키면
 * 자신의 인스턴스를 발생시킬 수 없는 형태가 됨.
 * 
 * 결론, 인스턴스화 할 필요는 없지만 상속개념에서 중요한 위치를 가지게 될때
 * 보통 추상클래스로 선언하여 사용.
 * 
 * 추상화 선언규칙
 * 1. 클래스에 정의된 메소드 중 추상 메소드가 하나라도 있다면, 해당 클래스는 추상클래스로 선언되어야 함.
 * 2. 추상메소드 : 바디'{}'가 없는 형태, abstract라는 키워드가 붙은 형태.
 * 					바디가 없기 때문에 ()뒤에 ;콜론을 붙임.
 * 3. 추상클래스는 자신의 인스턴스를 만들 수 없음.
 * 		하지만 생성자, 메소드, 필드는 모두 선언/정의 할 수 있음.
 * 		상속도 가능, super타입으로 존재할 수 있음.
 * 		다형성 적용가능
 * 4. 만약 추상 메소드가 하나도 없지만 해당 클래스를 추상화하고싶다면?
 * 		abstract 키워드를 붙여 추상화할 수 있음.
 * 
 */
public class Abstract {

}
