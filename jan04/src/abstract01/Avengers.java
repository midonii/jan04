package abstract01;

import java.util.Iterator;

public class Avengers {
	public static void main(String[] args) {
		
		Ironman ironman = new Ironman();
		Hulk hulk = new Hulk();
		Superman superman = new Superman();
		
		ironman.attack();
		hulk.attack();
		superman.attack();
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		// 일일히 공격실행 힘들어,, 한번에 공격가능? >> 배열사용(다형성)
		Hero[] avgs = new Hero[3];
		avgs[0] = ironman;
		avgs[1] = hulk;
		avgs[2] = superman;
		
		for(int i = 0; i < avgs.length; i++) {
			avgs[i].attack();
		}
		
		// 다형성
		Hero h1 = new Ironman();	// 부모 h1 = new 자식(); 아이언맨에 있는 애들이 Hero로 들어가고 Hero에 없는 메소드는 숨겨짐.
		h1.attack();
		h1.defense();
		// h1.callJavis(); 			// 에러. Hero에 없는 메소드.
		
		((Ironman)(h1)).javis = "";
		((Ironman)(h1)).callJavis();
		
		Ironman h2 = (Ironman) h1;	// 
		h2.callJavis();
		
		Object obj = new Ironman();
		
		/*
		 * 다형성은 동적바인딩을 지원해야 합니다.
		 * 런타임때 최종타입이 결정되는것.
		 * 다형성의 한계 : 상위 클래스에 만들어진 메소드에 한해 가능
		 */
		
	}
}
