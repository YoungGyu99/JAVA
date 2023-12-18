package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		long var3 = 10000000000; // 컴파일러는 int로 간주하기 때문에 에러 발생
		long var4 = 10000000000L; // L을 붙히면  오류가 안뜸

	}

}
