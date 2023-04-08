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

//        for(int i = N ; i > 0 ; i --){
//            if(i + T[i] > N + 1){
//                D[i] = D[i + 1];
//            }
//            else{
//                D[i] = Math.max(D[i+1], P[i] + D[i + T[i]]);
//            }
//        }


        // N 부터 0까지 반복하기
        for(int i = N ; i > 0 ; i --){

            //i 번째의 필요일수 더한날이! / 퇴사일보다 큰 경우
            if(i + T[i] > N + 1){

                //다음 상담시작일정으로 넘긴다.
                D[i] = D[i + 1];
            }
            //퇴사일 보다 작은경우
            else {

                // 다음 상담시작일정에서 수입과
                // i번째의 필요일수 더한날을 마쳤을 때 수입의 최대값을 비교한다.
                D[i] = Math.max(D[i + 1], P[i] + D[i + T[i]]);
            }

        }



        System.out.println(D[1]);

    }
}
