package animal;

public abstract class Animal2 {		// 추상클래스 (추상메소드를 하나이상 포함하면 반드시 추상클래스여야 함)
	protected int age;
	protected String name;
	
	public abstract void sound();	// 추상메소드
	
	public void eat() {
		System.out.println("먹는다");
	}
	
}
