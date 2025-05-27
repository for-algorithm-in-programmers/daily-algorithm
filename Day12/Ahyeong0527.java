package Day12;

import java.util.*;

public class Ahyeong0527 {

  public static void main(String[] args) {
    // [최소피로도, 소모피로도]
    // result = 3
    int k = 80;
    int[][] dungeons = { { 80, 20 }, { 50, 40 }, { 30, 10 } };

    Solution solution = new Solution();
    System.out.println(solution.solution(k, dungeons));

  }
}

class Solution {
  int max = -1;
  public int solution(int k, int[][] dungeons) {
    // 방문 체크
    boolean[] visited = new boolean[dungeons.length];
    dfs(k, dungeons, visited, 0, 0);
    return max;
  }

  public void dfs(int k, int[][] dungeons, boolean[] visited, int index, int count){
    //모든 던전 탐험시
    if(dungeons.length == index) {
      max = Math.max(max,count);
      return;
    }
    //모든 던전 수 탐색
    for (int i = 0; i < dungeons.length; i++) {
      if(visited[i]) continue; //방문을 했다면 패스
      visited[i] = true; //현재위치 방문 체크
      if(dungeons[i][0] <= k) { //남은피로도가 최소 피로도보다 크거나 같을 때, 기존피로도 - 소모피로도
        dfs(k-dungeons[i][1], dungeons, visited, index+1, count+1);
      } else { //남은 피로도가 최소피로도 보다 낮을 때, 다음 인덱스 찾기
        dfs(k, dungeons, visited, index+1, count);
      }
      visited[i] = false; //전부 탐색한 뒤, 체크 해제
    }
    return;
  }
}