package Day07;

import java.util.*;
import java.util.stream.Collectors;

public class Ahyeong0520 {

  public static void main(String[] args) {
    //H-Index
    //int[] citations = {10, 8, 5, 4, 3}; //4
    //int[] citations = {25, 8, 5, 3, 3}; //3
    //int[] citations = {3, 0, 6, 1, 5}; //3
    //int[] citations = {0,0,0,0}; //0
    //int[] citations = {5, 5, 6, 5, 5, 6}; //5
    int[] citations = {5,6,7,8}; //4
    
    Solution solution = new Solution();
    System.out.println("======================");
    System.out.println(solution.solution(citations));
  }
}

class Solution {
  public int solution(int[] citations) {
      int answer = citations.length;
      // 내림차순 정렬
      Integer[] revers = Arrays.stream(citations).boxed().toArray(Integer[]::new);
      Arrays.sort(revers, Collections.reverseOrder());
      
      // 비교
      for (int i = 0; i < revers.length; i++) {
        // citations 값이 순위(i)값 보다 작거나 같은 경우
        if(i >= revers[i]) {
          answer = i;
          break;
        }
      }

      return answer;
  }
}