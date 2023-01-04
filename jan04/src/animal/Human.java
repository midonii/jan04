package animal;

public class Human extends Animal {
	
	private String ssn;
	final static int NUM = 101;
	static int check = 500;
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		ssn = ssn.replace("-", "");		// 주민번호에 '-' 기호 삭제
		if(ssn.length() > 12) {
			this.ssn = ssn;
		} else {	// 13자리 미만 입력되면 남는글자 * 표시
			while(ssn.length() < 13) {
				ssn += "*";
			}
			this.ssn = ssn;
		}
	}
	
	
	
	
	public int add(int num1 , int num2) {
		return num1 + num2;
	}

	@Override
	public void sound() {
		// super.sound(); 	// 부모의 것 그대로 사용하겠다는건데, 사람소리 내야하니 필요없음.
		System.out.println("아...추워....");
	}
	
	public static void main(String[] args) {
		Human human = new Human(); // Human 클래스 가져올 객체 생성
		Object h = new Human();		// Object 클래스 가져올 객체 생성?
		//부모			자식
		Animal h2 = new Human();
		Human.check = 5000;
		
		int result = human.add(15, 30);
		// human.ssn = "주민번호";
		human.setSsn("921103");
		System.out.println(human.getSsn());
		
		
	}
}
