package datastructrue3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11660 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//1. 버퍼리더로 N과 M을 받는다
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		//두개의 값으로 토큰을 만들어준다 
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		
		//2. N만큼 반복문으로 2차원배열을 만든다
		long[][] num = new long[N][N];
		long[][] sum = new long[N][N+1]; //안전하게 + 1 해줌 
		
		//버버리더 토큰 만들기로 반복문을 이용 값을 N만큼 입력을 N번 받는다 
		for(int i = 0 ; i < N ; i++) {
//			System.out.println("입력");
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			for(int j = 0 ; j < N  ; j++) {
//				System.out.println("또 입력");
				sum[i][j+1] = sum[i][j] + Integer.parseInt(stringTokenizer.nextToken());
			}
		}
		// 이와 동시에 합배열을 2차원 반복문으로 동시에 만들어준다
		for(int i = 0 ; i < N ; i++) { 
			System.out.println();
				for(int j = 0 ; j< N ; j++) { // 토큰없기 때문에 N+1을 안해줌
					System.out.print(sum[i][j+1] + " ");
				}
			}
		
		//3. x,y값을 기준으로 구간합 공식을 매번 실행시켜준다 (M번반복)
		for(int k = 0 ; k < M ; k++) {
		
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int a_x = Integer.parseInt(stringTokenizer.nextToken());
			int a_y = Integer.parseInt(stringTokenizer.nextToken());
			int b_x = Integer.parseInt(stringTokenizer.nextToken());
			int b_y = Integer.parseInt(stringTokenizer.nextToken());
			
			for(int i = 0 ; i < N ; i++) { 
				System.out.println();
					for(int j = 0 ; j < N ; j++) {
						System.out.print((sum[b_y][b_x]) - (sum[a_y-1][a_x-1])  + " ");
					}
				}
		
		
		}
	}

}
