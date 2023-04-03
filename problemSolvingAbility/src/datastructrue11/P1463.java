package datastructrue11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//점화식 : 점점 꽃이 되어가는 식
//작은것부터 ! 2번배열부터! -> 바텀업


//문제 이슈 1 : 1을 바로 혹은 2와 3 둘다 중복되는 경우
//누가 더 적은지 비교하는 방법?  min으로 한다
// 다만 기본으로 -1을 하는것 혹은 2로 나눈경우를 먼저 연산해서 넣어준다



public class P1463 {

    public static void main(String[] args) throws IOException {

        //버퍼로 입력받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //문자열을 정수형으로 바꾸기
        int N = Integer.parseInt(br.readLine());

        //쉬운 생각을 위해서 N + 1 로 선언
        int [] D = new int[N + 1];
        //0으로 세팅한다
        //다만 정수형 배열의 기본값은 0이다.
        D[1] = 0;

        //2부터 N까지 반복한다.
        for(int i = 2 ; i < N + 1 ; i++){

            //최초에 기본값 세팅으로 무조건 다 뺀다.
            D[i] = D[i - 1] + 1 ;

            //1을 빼고 나서 연산한 값과 나눈연산이 둘다 가능한 경우가 있다
            // 이 경우 Math.min 함수를 써서 비교 후 적은 값을 대입한다.
            if(i % 2 == 0)
                D[i] = Math.min(D[i], D[i/2] + 1);

            //마찬가지로 1을 빼고나서 연산한값
            // 혹은 2와 동일하게 나누어 떨어지는 값이 있을 수있다.
            // 이 경우 3으로 나누는것이 더 최솟값이 될 수있는 지 비교후 대입한다
            if(i % 3 == 0) {
                D[i] = Math.min(D[i], D[i/3] + 1);
            }
        }

        for(int i : D){
            System.out.print(i + " ");
        }

    }

}
