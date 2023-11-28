
public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열
		// array 
		String a = "a";
		int b = 1;
		
		int arrayInt[] = new int[10];// 0부터 9까지의 수를 담고 있음.
		for (int i=0; i<arrayInt.length; i++) { //length 길이만큼 for문을 돌려라
			System.out.println(i);
		}	
		
		int arrayInt2[] = {1,3,5,7,9};
		for (int i=0; i<arrayInt2.length; i++) {
			System.out.println(i); 
		}
		int arrayInt3[] = {1,3,5,7,9};
		for (int i = 0; i<arrayInt3.length; i++) {
			System.out.println(arrayInt3[i]);
		}
		
		String arrayStr[] = {"a","b","c","d","e"};
		for (int i = 0; i<arrayStr.length; i++) {
			System.out.println(arrayStr[i]);
			
		}
	}
		 	}
