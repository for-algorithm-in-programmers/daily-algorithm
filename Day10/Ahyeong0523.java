package Day10;

import java.util.*;

public class Ahyeong0523 {

  public static void main(String[] args) {

    // String numbers = "17"; //3
    // String numbers = "011"; //2
    // String numbers = "123";
    String numbers = "013"; // 4

    Solution solution = new Solution();
    System.out.println(solution.solution(numbers));
  }
}

class Solution {
  Set<Integer> nSet = new HashSet<>(); // Set을 이용해 중복제거

  public int solution(String numbers) {
    // 조합
    getCombinations("", numbers);
    return nSet.size();
  }

  // 소수판별
  public boolean isPrime(int n) {
    if (n < 2)
      return false;
    for (int i = 2; i <= (int) Math.sqrt(n); i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  // 만들 수 있는 모든 숫자 만들기
  public void getCombinations(String comb, String others) {
    if (!comb.equals("")) {
      int num = Integer.parseInt(comb);
      if (isPrime(num)) {
        nSet.add(num);
      }

    }

    for (int i = 0; i < others.length(); i++) {
      getCombinations(comb + others.charAt(i),
          others.substring(0, i) + others.substring(i + 1));
    }
  }

}