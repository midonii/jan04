package animal;

public class Cat extends Animal2 {
	
	@Override
	public void sound() {
	//	super.sound();	// 에러. 추상메소드
	}
	
	@Override
	public void eat() {
		super.eat();
	}
	
}
