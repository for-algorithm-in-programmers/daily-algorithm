package Day05;

import java.util.Arrays;

public class Ahyeong0516 {
  public static void main(String[] args) {
    Solution solution = new Solution();
    
    int[] arr = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};

    System.out.println(Arrays.toString(solution.solution(arr, commands)));
  }
}

class Solution {
  public int[] solution(int[] array, int[][] commands) {
      int[] answer = new int[commands.length];

      for (int i = 0; i < commands.length; i++) {
        //배열은 0번째부터 시작
        int start = commands[i][0] - 1;
        int end = commands[i][1];
        int k = commands[i][2] - 1;

        // Arrays.copyOfRange(원본배열, 복사시작인덱스, 복사종료인덱스)
        int[] tmp = Arrays.copyOfRange(array, start, end);

        Arrays.sort(tmp);
        answer[i] = tmp[k];
      }

      return answer;
  }
}
