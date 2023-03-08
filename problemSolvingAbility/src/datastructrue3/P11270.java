package datastructrue3;
import java.util.Scanner;

public class P11270 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String SNum = sc.next();
		
		
		char[] CNum = SNum.toCharArray();
		
		int sum = 0;

		for(int i = 0 ; i < CNum.length ; i++) {
			sum += CNum[i] - '0';
		}
		
		System.out.println(sum);
		
		sc.close();
	}

}
