package programmers;

import java.util.StringTokenizer;

public class P12951 {

    static String solution(String s) {
        String answer = "";

        StringTokenizer st = new StringTokenizer(s);
        System.out.println(st.countTokens());

         for(int i = 0 ;i < st.countTokens() * 2; i++ ){
             String tmp = st.nextToken();
             System.out.println(tmp);

             char a = tmp.charAt(0);
             a+= 32;

             System.out.println(a);


         }


        return answer;
    }

    public static void main(String[] args) {

        String a = "3people unFollowed me";
        String a_ = solution(a);
        System.out.println(a);

        String b = "for the last week";
        String b_ = solution(b);
        System.out.println(b);


    }

}
