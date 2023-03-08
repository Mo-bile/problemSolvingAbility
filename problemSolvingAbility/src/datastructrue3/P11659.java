package datastructrue3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11659 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		//1. 배열의 사이즈와 질의반복횟수 값을 받는다
		int N = sc.nextInt();
		int M = sc.nextInt();
	
		
		//1-2 받은 배열 사이즈 값으로 사이즈를 선언한다 
		int [] ar = new int[N]; 
		int [] sum = new int[N];
		
		//2-1 배열값을 입력받는다
		for(int i = 0 ; i < N ; i++) {
			ar[i] = sc.nextInt();
			
			//2-2 받은 배열값으로 합배열을 만든다
//			sum[i] = ar[i] + sum[i-1]; 
			
			if(i == 0)
				sum[0] = ar[0]; //out of bound 
			else if(i == N)
				sum[i] = ar[i]; 
			else 
				sum[i] = ar[i] + sum[i-1]; 
				
			
		}
		
		int [] result = new int[3];
		//3 질의값으로 합배열 값 간에 연산으로 값을 찾아준다
		for(int i = 0 ; i < M ; i++) {
			int i_ = sc.nextInt();
			int j_ = sc.nextInt();
			
			System.out.println(sum[j_] - sum[i_ - 1]);
		}
		*/

		BufferedReader bufferedReader =
				new BufferedReader(new InputStreamReader(System.in));
		
		//입력받음 
		StringTokenizer stringTokenizer =
				new StringTokenizer(bufferedReader.readLine());
		
		// _ 기준으로 토큰 값저장 및 정수형으로 전환 
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		
		//배열 생성
		long[] S = new long[suNo + 1];
		
		//입력받음
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		//입력받은 수만큼 토큰 값저장 및 정수형으로 변환 
		//하고 이것을 합배열에다가 넣어줌
		
		for(int i = 1; i <= suNo ; i++) { // 같거나 작음의 차이!!
			S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		for(int i = 0; i <= suNo ; i++) {
			System.out.println(S[i]);
		}
		
		for(int q = 0 ; q< quizNo ; q++) {
			//입력받음
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			
			System.out.println(S[j] - S[i - 1] );
			
		}
	}

}
