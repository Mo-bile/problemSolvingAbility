package datastructrue5;

import java.util.Scanner;

public class P2023 {
//
//    public static void main(String[] args) {
//
////        1
//        //1번 N입력을 받는다
//        Scanner sc = new Scanner(System.in);
//        //자릿수 N을 입력받는다
//        int N = sc.nextInt();
//
////        2
//        //2차원배열로 선언한다 (소수 4개 2,3,5,7) + ( 각각 인접리스트 표현 )
//        int x [][] = new int[4][9];
//        // 2차원배열로 선언 ( 동일 ) + 방문배열로 표현
//        boolean y [] = new boolean[10];
//        // 소수인경우 저장하는 배열 선언
//        int prime[] = new int[36];
//
//
////        3
//        // 반복문으로 DFS 호출 (소수4개 반복문)
//        for(int i = 1 ; i < -+ ; i ++){
//            // 1자리 소수확인 -> 2차리 소수확인 한자리씩 하는 방식 재귀방식으로 호출
//            y = new boolean[10];
//
//            // 각 단계 마다 소수인지 반복문으로 확인하기
//
//        }
//
////        4
//        // 마지막 까지 소수인지 확인되면 배열에 저장
//    }
//    //
//    static boolean primeNumber(int num) {
//        for (int i = 2 ; i < num + 1; i++) {
//            //나누어 떨어질 때
//            if (num % i == 0) {
//                // i 와 num 이 다르면 (자기자신이 아니면)
//                if (i != num) {
//                    //소수가 아니다)
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    static void DFS(int V){
//
//    }

    //전역변수로 선언
    static int N;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        //한정해서 넣어주기
        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);
    }

    static void DFS(int number, int order){

        //마지막 출력용 부분
        if(order == N){
            if(isPrime(number)){
                System.out.println(number);
            }
            return;
        }

        //1 부터 10까지 탐색위함
        for(int i = 1 ; i < 10 ; i++){
            //짝수는 소수가 아님 (뒤에 붙는수가)
            if(i % 2 == 0)
                continue;

            //뒤에 붙는수가 소수이면
            //한자릿수 올려서 i를 추가했는데 소수이면
            //출력을 위해서 그리고 자릿수를 올려주어서 DFS를 또 호출한다.
            if(isPrime(number * 10 + i))
                DFS(number * 10 + i, order + 1);
        }
    }

    private static boolean isPrime(int number) {
                //왜 num/2??????
        for(int i = 2 ; i <= number / 2 ; i ++)
            if(number % i == 0)
                return false;
        return true;
    }
}
