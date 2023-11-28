
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray [] = new int[5]; // intArray라는 변수에다가 5의 공간만큼을 배열로 선언. (0,1 ,2 ,3 ,4 ,5) 
		
		try  // 에러상황을 캐치해서 출력함
		{
			intArray[3] = 10;
			intArray[6] = 1; 
		}
		catch(Exception e) // Exception 예외
		{
			e.printStackTrace(); // 실제 에러문을 출력, 에러를 찾아낼때 사용
			System.out.println("배열 범위 초과"); 
			System.exit(0); // 강제로 프로그램을 종료 밑에 내용은 출력이 안됨 , 에러 발생시 프로그램을 종료하고 싶을때 사용가능
		}
		System.out.println("프로그램 종료"); // try catch 를 빠져나오면 알아서 끝남
	}
}
