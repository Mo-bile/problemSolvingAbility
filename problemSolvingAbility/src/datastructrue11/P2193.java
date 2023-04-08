package datastructrue11;

import java.util.Scanner;

public class P2193 {

    public static void main(String[] args) {

        //N 입력 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int [][] D = new int[N + 1][2] ;

        //앞부분 N , 뒤부분 0 or 1
        D[1][1] = 1;
        D[1][0] = 0;

        for(int i = 2 ; i < N + 1 ; i ++){

        //뒷부분이 0인경우
            D[i][0] = D[i - 1][1] +D[i - 1][0] ;
        //뒷 부분이 1인경우
            D[i][1] = D[i - 1][0];

        }

        System.out.println(D[N][0] + D[N][1]);


    }
}
