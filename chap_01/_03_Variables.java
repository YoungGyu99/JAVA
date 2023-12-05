package chap_01;

public class _03_Variables {
// 변수선언
	public static void main(String[] args) {
		String name = "나도코딩";
		int hour = 15;
		
		System.out.println(name + "님, 배송이 시작됩니다." + hour +"시에 방문 예정입니다");
		System.out.println(name + "님, 배송이 완료되었습니다.");

	
		double score = 90.5;
		char grade = 'A';
		name= "강백호";
		System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
		System.out.println("학점은" + grade + "입니다.");
		
		boolean pass = true;
		System.out.println("이번 시험에 합격했을까요?" + pass);
		
		double d = 3.14123456789; // 소숫점이 들어간 경우 double , 정밀하게할때
		float f = 3.14123456789f; // double 가 아닌경우 실수값 뒤에 f를 넣어야함, 정밀할 필요가 없을떄
		
		System.out.println(d);
		System.out.println(f);
		
		long l = 1000000000000l; // long형 자료 큰범위를 가질때 
		l = 1_000_000_000_000l;
		System.out.println(l);
		
		
		// 정수 int(작은범위), long(큰범위), float(정밀한 내용), double(정밀하지 않아도될때)
		//  char (하나문자), String(여러문자), boolean( true / false )
	
	}

}
