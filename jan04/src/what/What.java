package what;

// 인스턴스 하나만 만들기

// 데이터베이스연결(p243).

class Human{
// 변수
	private static Human human = new Human();
	
// 생성자
	private Human() {}	// private 생성자. 외부에서 못봄
	
// 메소드	
	public static Human getInstance() {	// getter
		return human;	// 여기에서 Human 볼 수 있음.
	}
}

public class What {
	public static void main(String[] args) {
		Human h1 = Human.getInstance();
		Human h2 = Human.getInstance();
		Human h3 = Human.getInstance();
		System.out.println(h1 == h2);
	}
}

