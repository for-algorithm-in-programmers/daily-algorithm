package Day14;

import java.util.*;

public class Ahyeong0529 {
  public static void main(String[] args) {
    // String word = "AAAAE";
    // String word = "AAAE";
    String word = "I";
    // String word = "EIO";

    Solution solution = new Solution();
    System.out.println(solution.solution(word));
  }
}

class Solution {

  public int solution(String word) {
    int answer = 0;
    String aeiou = "AEIOU";
    // 각 자리에서 가중치를 구해서
    int[] part = new int[aeiou.length()];
    int sum = 0;
    for (int i = aeiou.length() - 1; i >= 0; i--) {
      part[i] = sum + 1;
      sum = part[i] * 5;
    }

    for (int i = 0; i < word.length(); i++) {
      int index = aeiou.indexOf((word.charAt(i)));
      answer += index * part[i];
    }

    return answer + word.length();
  }

}