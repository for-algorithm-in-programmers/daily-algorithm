package Day13;

import java.util.*;

public class Ahyeong0528 {
  public static void main(String[] args) {
    // int n = 9;
    // int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
     //int n = 4;
     //int[][] wires = {{1,2},{2,3},{3,4}};
    int n = 7;
    int[][] wires = {{1,2},{2,7},{3,7},{3,4},{4,5},{6,7}};
    
    Solution solution = new Solution();
    System.out.println(solution.solution(n, wires));
  }
}

class Solution {
  static boolean[] visited;
  static ArrayList<Integer>[] list;
  static int cnt = 0 ;

  public int solution(int n, int[][] wires) {
    int answer = Integer.MAX_VALUE;
    list = new ArrayList[n+1];
    visited = new boolean[n+1];
    // 인접 리스트 만들기
    for(int i = 1; i <= n; i++){ //list안에 새로운 arraylist 객체 생성
      list[i] = new ArrayList<>();
    }
    // 인접리스트 값 추가
    for (int i = 0; i < wires.length; i++) { 
      int v1 = wires[i][0];
      int v2 = wires[i][1];
      list[v1].add(v2);
      list[v2].add(v1);      
    }
    
    for (int i = 0; i < wires.length; i++) {
      int v1 = wires[i][0];
      int v2 = wires[i][1];
      
      list[v1].remove((Integer)v2);
      list[v2].remove((Integer)v1);

      dfs(1);
      answer = Math.min(answer, Math.abs(cnt - (n - cnt)));

      cnt = 0; // 카운트 초기화
      Arrays.fill(visited, false);
      list[v1].add(v2);
      list[v2].add(v1);
    }
    
    return answer;
  }


  public void dfs(int n){
    visited[n] = true;
    cnt++;
    for(int next : list[n]){
      if(!visited[next]) dfs(next);
    }
  }
}