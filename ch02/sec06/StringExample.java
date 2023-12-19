package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
	//작은따옴표를 감싼 문자는 char타입이지만 큰따옴표로 감싼 여러 개의 문자들은 유니코드로 변환되지 않는다.
	// \는 출력시 줄바꿈
		
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는\"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.println("나는\n");
		System.out.print("자바를\n"); // \n이  ln의 기능을함 
		System.out.print("배웁니다");
		
	}

}
