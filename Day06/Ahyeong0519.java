package Day06;

import java.util.*;

public class Ahyeong0519 {

  public static void main(String[] args) {
   //[6, 10, 2]	
    Solution solution = new Solution();

    //int[] numbers = {6, 10, 2};  //"6210"
     int[] numbers = {3, 30, 34, 5, 9};   //9534330"

    System.out.println(solution.solution(numbers));
  }
}

class Solution {
  public String solution(int[] numbers) {
      StringBuilder answer = new StringBuilder();
      // int[] → String[]
      String[] stringNumbers = new String[numbers.length];
      for (int i = 0; i < numbers.length; i++) {
        stringNumbers[i] = Integer.toString(numbers[i]);
      }
      // 1. 내림차순 정렬
      // 2. (b+a).compareTo(a+b)
      Arrays.sort(stringNumbers, (a, b) -> (b + a).compareTo(a + b));

      for (String string : stringNumbers) {
        answer.append(string);
      }
      return answer.toString();
  }
}