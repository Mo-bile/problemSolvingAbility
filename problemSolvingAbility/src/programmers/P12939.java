package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P12939 {

    public static void main(String[] args) throws IOException {
//        String a = solution("1 2 3 4");
//        String a = solution("1 2 3 4");
        String a = solution("-1 -2 -3 -4");

        System.out.println(a);
    }

    public static String solution(String s) {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st = new StringTokenizer(s);

        int A[] = new int[st.countTokens()]; //이 메소드가 신기해!!!

        
        for(int i = 0 ; i < A.length ; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int max = A[0];
        int min = A[0];

        for(int i = 0 ; i < A.length  ; i++) {
            if(A[i]  > max) {
                max = A[i];
            }
        }

        for(int i = 0 ; i < A.length  ; i++) {
            if(A[i]  < min) {
                min = A[i];
            }
        }

        String a = Integer.toString(max);
        String i = Integer.toString(min);

        String answer = i +" "+ a;
        return answer;
    }
    }


