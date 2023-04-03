package datastructrue11;

import java.util.Scanner;

public class P14501 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int D [] = new int[N+2]; //점화식 배열
        int T [] = new int[N+1]; //상담에 필요한 일수 저장배열
        int P [] = new int[N+1]; //상담완료시 수입저장배열

        for(int i = 1 ; i < N + 1 ; i++ ){
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }

        for(int i = N ; i > 0 ; i --){
            if(i + T[i] > N + 1){
                D[i] = D[i + 1];
            }
            else{
                D[i] = Math.max(D[i+1], P[i] + D[i + T[i]]);
            }
        }

        System.out.println(D[1]);

    }
}
