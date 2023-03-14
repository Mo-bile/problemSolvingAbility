package datastructrue5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11724 {

	static ArrayList<Integer>[] A;
	static Boolean [] visited;
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		A = new ArrayList[n + 1]; 
		visited = new Boolean[n + 1];
		
		for(int i = 1 ; i < n + 1 ; i++) {
			A[i] = new ArrayList<Integer>();
			visited[i] = false;
		}

		for(int i = 1 ; i < m + 1 ; i++) {
			st = new StringTokenizer(bf.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			//양방향
			A[u].add(v);
			A[v].add(u);
		}
		
		int count = 0 ;
		
		//현재노드 순회
		for(int i = 1 ; i < n + 1 ; i++) {
			if(!visited[i]) { //방문하지 않았으면
				count++;
				DFS(i); 
				}
			}
		
		System.out.println(count);
		}

		//현재노드로 DFS탐색 시작
	private static void DFS(int v) {
		
		
		//현재노드와 방문노드 비교
		if(visited[v]) return;
		visited[v] = true;
		
		for(int i : A[v]) { //인접리스트의 세부 배열에 내용들을 
							// 반복하면서 하나씩 i에 대입
			
			if(visited[i] == false) { //방문한적없으면 
				DFS(i); //대입
			}
		}
	}
}
