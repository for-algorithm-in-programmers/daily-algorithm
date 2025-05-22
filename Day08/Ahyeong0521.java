package Day08;

import java.util.*;

public class Ahyeong0521 {
  public static void main(String[] args) {
    
    int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}}; //4000

    Solution solution = new Solution();
    
    System.out.println(solution.solution(sizes));
  }
}


class Solution {
  public int solution(int[][] sizes) {
      int answer = 0;
      //가로, 세로 상관없이 제일 큰거는 무조건
      //명함을 돌릴수 있으니 [[a, b], [c, d]] => 각배열간 큰거를 0번째, 작은거를 1번째에 두고 비교?
      
      List<Integer> wMax = new ArrayList<>();
      List<Integer> hMax = new ArrayList<>();

      for (int i = 0; i < sizes.length; i++) {
        int w = sizes[i][0];
        int h = sizes[i][1];
        if(w > h) {
          wMax.add(w);
          hMax.add(h);
        } else {
          wMax.add(h);
          hMax.add(w);
        }
      }

      Collections.sort(wMax, Collections.reverseOrder());
      Collections.sort(hMax, Collections.reverseOrder());

      return wMax.get(0) * hMax.get(0);
  }
}