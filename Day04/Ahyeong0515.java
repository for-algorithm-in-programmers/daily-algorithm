package Day04;

import java.util.*;

public class Ahyeong0515 {
  public static void main(String[] args) {
   
   String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
   
   Solution solution = new Solution();
   System.out.println(solution.solution(clothes));
  }
}

class Solution {
  public int solution(String[][] clothes) {
      int answer = 1;
      // 옷 종류별로 map을 만듦
      Map<String, List<String>> map = new HashMap<>();
      for (String[] strings : clothes) {
          map.computeIfAbsent(strings[1], k -> new ArrayList<>()).add(strings[0]);
      }
      for (String key : map.keySet()) {
        answer *= (map.get(key).size()+1);
      }
      // 안입는 경우 빼기
      return answer-1;
  }
}
