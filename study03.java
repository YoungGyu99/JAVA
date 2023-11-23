
public class study03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sh ="이쁘다";
		int a = 1;
		
		if(sh == "못생겼다") { //만약에 () 라면.. 중괄호 내부를 실행.
			System.out.println("정답입니다!");
		} 
		else if(sh == "이쁘다") {
			System.out.println("정답입니다!!!");
		}
		else if(sh == "이쁘다") {
			System.out.println("틀렸어요");
		}
		
		
		if(a == 0) {
			System.out.println("a는 0입니다.");
		}else if(a == 1) {
			System.out.println("a는 1입니다.");
		}
		
		// and 연산자, or 연산자
		if(a == 0 && a == 1) { // and 연산자 사용
			System.out.println("TEST");
		}
		
		if(a == 0 || a == 1) { //or 연산자 사용
			System.out.println("TEST2");
		}
	
		
		
		
	}
	

}
