package datastructure6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11047 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 동전의 종류
        int K = Integer.parseInt(st.nextToken()); // 가격의 합
        int [] A = new int[N + 1];

        //동전의 가격
        for(int i =  1 ; i < N + 1 ; i++){
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
        }
        //오름차순 정렬 ( 필요없을수도?)
        Arrays.sort(A);

        int count = 0;

    // 등호표시 때문문에 loop에 빠짐
        while(K > 0){
            // 같은 동전여러개라고 생각해서 조건에 따라 증감식을 달리 해야한다고 생각해서 while문을  씀

            if(K > A[N]){ // 금액이 동전보다 클 때

                //K 위치에 따라서 0으로 나와버림
                int coin =  K / A[N] ;
                count  += coin; // 동전갯수
                K %= A[N]; //동전 뺀 후 금액
                N -- ;
            }
            else { //금액이 동전보다 작을 때
                N --; // 동전 금액 줄이기
            }
        }
        System.out.println(count);
    }
}

//10 4200
//1
//5
//10
//50
//100
//500
//1000
//5000
//10000
//50000