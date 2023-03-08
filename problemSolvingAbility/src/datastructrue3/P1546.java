package datastructrue3;
import java.util.Scanner;

public class P1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int exams[] = new int[num]; 
		int M = 0;
		int sum = 0;
		
		//굳이 필요 X
		float result = 0 ;
				
		//값 입력과, 총합 넣기
		for(int i = 0 ; i < num ; i++) {
			exams[i] = scan.nextInt(); //뉴라인 입력 
			sum += exams[i];
		}

		//최대값 찾아서 대입하기
		for(int i = 0 ; i< num ; i++) {
			if(M < exams[i] ) {
				M = exams[i];
			}
		}
		
		//총합과 최댓값 연산하기
		result = sum * 100 / M / num;
//		result = result /10 * 10;
		
		//여기다가 바로 출력하기!!
		System.out.println(result);
		
		
		
	}

}
