package Day09;

import java.util.*;
import java.util.Map.Entry;

public class Ahyeong0522 {
  public static void main(String[] args) {
    //[1,2,3,4,5]	
    int[] answers = {1,2,3,4,5};
    Solution solution = new Solution();
    System.out.println(Arrays.toString(solution.solution(answers)));
  }
}

//수포자 3명
// 1번 : 1,2,3,4,5 반복
// 2번 : 2,1,2,3,2,4,2,5 반복
// 3번 : 3,3,1,1,2,2,4,4,5,5, 반복


class Solution {
  public int[] solution(int[] answers) {
      int[] first = {1,2,3,4,5};
      int[] second = {2,1,2,3,2,4,2,5};
      int[] third = {3,3,1,1,2,2,4,4,5,5};  

      int[] check = new int[3];
      for (int i = 0; i < answers.length; i++) {
        if(first[i % first.length] == answers[i]) check[0]++;
        if(second[i % second.length] == answers[i]) check[1]++;
        if(third[i % third.length] == answers[i]) check[2]++;
      }
      int maxCorrect = Arrays.stream(check).max().getAsInt();
      List<Integer> answer = new ArrayList<>();
      for (int i = 0; i < check.length; i++) {
        if(check[i] == maxCorrect) {
          answer.add(i + 1);
        }  
      }

      return answer.stream().mapToInt(Integer::intValue).toArray();
  }
}