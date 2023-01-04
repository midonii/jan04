package zoo;
// 사육사
public class ZooTrainer extends Animal{
	
	/*
	public void feed(Cat cat) {
		System.out.println(cat.getName() + "에게 밥을 준다.");
	}
	public void feed(Lion lion) {
		System.out.println(lion.getName() + "에게 밥을 준다.");
		
	}
	*/
	public void feed(Predetor predetor) {
		System.out.println(predetor.getName() + "에게 밥을 준다.");
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("톰");
		
		Lion lion = new Lion();
		lion.setName("레오");
		
		ZooTrainer trainer = new ZooTrainer();
		trainer.feed(cat);
		trainer.feed(lion);
		
	}
}
