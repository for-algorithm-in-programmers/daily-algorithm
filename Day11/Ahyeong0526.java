package Day11;

import java.util.*;

public class Ahyeong0526 {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int brown = 10;
    int yellow = 2;
    //int brown = 16;
    //int yellow = 4;
    // int brown = 8;
    // int yellow = 1;
    // int brown = 24;
    // int yellow = 24;
    System.out.println(solution.solution(brown, yellow));

  }
}

class Solution {
  public int[] solution(int brown, int yellow) {
      int[] answer = new int[2];
      //yellow로 만들 수 있는 사각형 구하기 -> 인수분해
      int[][] yellowNum = new int[yellow][2];
      for(int h = 1; h <= Math.sqrt(yellow); h++){
        if(yellow % h == 0){
          int w = yellow / h;
          if( h <= w){
            yellowNum[h-1][0] = w;
            yellowNum[h-1][1] = h;
          }  
        }
      }      
      // System.out.println("------------");
      for (int[] is : yellowNum) {
        int chk = (is[0] + 2) * (is[1] + 2);
        if(chk-yellow == brown) {
          answer[0] = is[0] + 2;
          answer[1] = is[1] + 2;
        }        
      }
      System.out.println(Arrays.toString(answer));   
      return answer;
  }

}