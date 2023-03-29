package datastructrue5;

import  java.util.*;
import  java.io.*;
public class P1920 {

    public static void main(String[] args) throws  IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int  N = Integer.parseInt(st.nextToken());

        int A[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        //정렬
        Arrays.sort(A);

        st = new StringTokenizer(br.readLine());
        int  M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M ; i++){
            int target = Integer.parseInt(st.nextToken());
            boolean find = false;


            int a = Arrays.binarySearch(A, target);

            if(a >= 0){
                find = false;
            }
            else {
                find = true;
            }


//            //시작 끝 인덱스 지정
//            int start = 0;
//            int end = A.length - 1;
//
//            // start 가 end를 넘어선 순ㅠ간 끝!
//            while (start <= end) {
//                //중간값 인덱스 잡기
//                int median = (start + end) / 2;
//                //중간값
//                int mid = A[median];
//
//                //중간값 보다 작을 때
//                if (mid > target){
//                    //끝점 줄이기
//                    end = mid - 1 ;
//                }
//                //중간값 보다 클 때
//                else if (mid < target) {
//                    //시작점 줄이기
//                    start = mid + 1;
//                }
//                //둘다 아니면 같은 경우
//                else {
//                    //찾음 끝
//                    find = true;
//                    break;
//                }
//            }
            //찾았을 때 1 출력
            if(find){
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }
    }
}
