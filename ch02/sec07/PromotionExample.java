package ch02.sec07;

public class PromotionExample {
    public static void main(String[] args) {
// long (8bate) 를 float(4bate)를 값의 허용범위 덕분에 넣을 수 있음
// byte < short, char < int < long < float < double

	byte byteValue = 10;
	int intValue = byteValue;
    System.out.println("intValue:" + intValue);
    
    char charValue = '가';
    intValue = charValue;
    System.out.println("가의 유니코드:" + intValue);
    
    intValue = 50;
    long longValue = intValue;
    System.out.println("longValue:" + longValue);
    
    longValue = 100;
    float floatValue = longValue;
    
    System.out.println("floatValue:" + floatValue);
    
    floatValue = 100.5F;
    double doubleValue = floatValue;
    System.out.println("doubleValue:" + doubleValue);
	
}
}