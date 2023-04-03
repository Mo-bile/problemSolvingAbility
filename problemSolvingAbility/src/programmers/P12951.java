package programmers;

import java.util.StringTokenizer;

public class P12951 {

    static String solution(String s) {
        String answer = "";

        StringTokenizer st = new StringTokenizer(s);
        String tk ;

        int i = 0;
//        while (st.hasMoreTokens()){
        while (i < s.length()){
            tk = st.nextToken();

            char[] tmp = tk.toCharArray();
           //a~z 이면
//            97 ~ 122
            if(tmp[0] >= 97 && tmp[0] <= 122) {
                //소문자를 대문자로 변환
                tmp[0] -= 32;
                String a = String.valueOf(tmp);
                answer += a;
                System.out.println(answer);
                //0~9까지
            } else if (tmp[i]  >= 65 && tmp[i] <= 90) {
                tmp[i] += 32;
            } else{
                String a = String.valueOf(tmp);
                answer += a;
            }

            if(st.hasMoreTokens()) {
                answer += " ";
            }
            i ++;
        }
        return answer;
    }

    public static void main(String[] args) {

        String a = "3people unFollowed me";
        String a_ = solution(a);
//        System.out.println (a);

        System.out.println();

        String b = "for the last week";
        String b_ = solution(b);
//        System.out.println(b);
    }

}
