package datastructrue5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11724 {

	//리스트를 전역으로 미리 선언해준다
	//리스트를 정수형으로 타입을 정해준다.
	static ArrayList<Integer>[] A;
	//방문배열 참조명 선언
	static Boolean [] visited;
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	//입력이 10만개 이상이면 버퍼리더로 읽는것이 권장된다.
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //

		//버퍼로 입력을 받고, 문자열을 자르는 과정이다.
		StringTokenizer st = new StringTokenizer(bf.readLine());
		//문자열에 띄어쓰기 단위로 두개가 입력되기 때문에 잘린것은 두개로 나눠서 입력된다
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		//리스트로 입력을 받는다
		// 이 경우 필요한 크기보다 1을 더해주어서 리스트 객체를 만들어준다
		// 1을 더해준 이유는 데이터를 쉽게 넣고 빼기 위함이다.
		A = new ArrayList[n + 1];
		//방문배열도 마찬가지
		visited = new Boolean[n + 1];

		for(int i = 1 ; i < n + 1 ; i++) {
			//리스트 안 리스트이기 때문에 각 배열인덱스  마다 리스트객체를 선언해서 넣어준다.
			A[i] = new ArrayList<Integer>();
			//flase로 초기화
			visited[i] = false;
		}

		// 사고를 수월하게 하기위해 반복문 인덱스를 조정
		for(int i = 1 ; i < m + 1 ; i++) {
			//문자열 입력을 받는다
			st = new StringTokenizer(bf.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			//양방향으로 추가(에지의 양끝점 u와 v가 주어지기 때문)
			A[u].add(v);
			A[v].add(u);
		}

		//연결요소 갯수 판단위해서
		int count = 0 ;
		
		//현재노드 순회
		for(int i = 1 ; i  <  n + 1 ; i++) {
			if(!visited [i] ) { //방문하지 않았으면
				//첫번째 연결요소찾음
				count++;
				//노드에서 탐색 시작
				DFS(i); 
				}
			}
		
		System.out.println(count);
		}

		//현재노드로 DFS탐색 시작
	private static void DFS(int v) {

		//깊이우선 탐색 특성상 다음 깊이에서  확인용이다
		//해당 노드가 방문한적 있으면 DFS 메소드를 종료한다.
		if(visited[v])
			return;

		// 방문배열에 특정 노드를 기록한다.
		visited[v] = true;

		//인접리스트의 각 노드와 연결노드들을
		// 반복하면서 하나씩 i에 대입
		for (int i : A[v]) {

			if(visited[i] == false) { //방문한적 없으면
				DFS(i); //대입
			}
		}
	}

	private  static  void DFS2(int v){

		if(visited[v]) return;
		visited[v] = true;

		for(int i : A[v]){

		}

	}


}
