package datastructure6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P1715 {

    public static void main(String[] args) throws IOException {
        //당시에 최선!

        //카드묶음 수 입력을 받는다
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());

//        //묶음 수 만큼 배열을 만들고, 배열 수만큼 각각에 크기를 입력받는다
//        ArrayList <Integer> list = new ArrayList<Integer>();

//        //반복문으로 배열의 끝 까지 반복을 한다
//        for(int i = 1 ; i < N + 1 ; i++){
//            st = new StringTokenizer(bf.readLine());
//            int M = Integer.parseInt(st.nextToken());
//            list.add(M);
//        }
//        System.out.println(list);
//
//        int total = list.get(0) + list.get(1);
//        int tmp = 0;
//
//        //0번째 배열에서 1~끝까지 배열 중의 합 중  최소의 합이 있는 인덱스를 구한다
//        for(int i = 1 ; i < list.size() ; i ++){
//            tmp = total;
//            tmp += list.get(i);
//
//            //최소합이 있는 총합을 넣어준다
//
//            //총합이 임시값보다 크면
//            if(total > tmp){
//                //임시 값이 최솟값으로서  total 에 넣어준다.
//                total = tmp;
//                //합한 숫자가 있는 인덱스 배열에서 제거한다
//                list.remove(i);
//                System.out.println(list);
//
//                //총합이 임시값보다 작으면
//            } else {
//                //현재 총합이 최소이다.
//            }
//        }
//        System.out.println(total);
//        //반복

        //우선순위 큐 선언
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //반복문으로 값 대입
        for(int i = 0 ; i < N  ; i++){
            st = new StringTokenizer(bf.readLine());
            int M = Integer.parseInt(st.nextToken());
            pq.add(M);
        }

        int x = 0;
        int y = 0;
        int sum = 0;

        //반복문으로 큐 사이즈가 1이면 반복종료
        while (pq.size() != 1){

            //큐에서 꺼내면서 x,y에 리턴
            x = pq.remove();
            y = pq.remove();

            //우선순위가 높은 즉 값이 낮은것을 더하고, sum에 대입
            sum += (x+y);
            //큐에 누적해서 추가
            pq.add((x+y));
        }

        System.out.println(sum);
    }

}
