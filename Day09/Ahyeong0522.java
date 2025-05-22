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

      HashMap<Integer, Integer> check = new HashMap<>(); //1,2,3번의 맞춘 개수
      check.put(1, 0);
      check.put(2, 0);
      check.put(3, 0);
      
      for (int i = 0; i < answers.length; i++) {
        //수포자들의 찍는방식 배열에 벗어나면 다시 0으로
        check.replace(1, first[i % first.length]==answers[i] ? check.get(1)+1 : check.get(1));
        check.replace(2, second[i % first.length]==answers[i] ? check.get(2)+1 : check.get(2));
        check.replace(3, third[i % first.length]==answers[i] ? check.get(3)+1 : check.get(3));             
      }

      int max = Collections.max(check.values());
      List<Integer> answer = new ArrayList<>();

      for(Map.Entry<Integer, Integer> entry : check.entrySet()){
        if(max == entry.getValue()){
          answer.add(entry.getKey());
        }
      }

      return answer.stream().mapToInt(Integer::intValue).toArray();
  }
}