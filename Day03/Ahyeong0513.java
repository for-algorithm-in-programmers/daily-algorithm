package Day03;

import java.util.Arrays;

public class Ahyeong0513 {

  public static void main(String[] args) {
    /**
     * "123","456","789"
     * -> true
     * "12","123","1235","567","88"
     * -> false
     */
    // String[] phone_book = { "119", "97674223", "1195524421" };
    // String[] phone_book = {"12","123","1235","567","88"};
    // String[] phone_book = {"123","456","789"}; //true
    String[] phone_book = { "12", "123", "1235", "567", "88" }; // false
    System.out.println("-------------------------------");
    System.out.println(new Ahyeong0513().solution(phone_book));
  }

  public boolean solution(String[] phone_book) {
    // 정렬
    Arrays.sort(phone_book);

    for (int i = 0; i < phone_book.length-1; i++) {
      if(phone_book[i+1].startsWith(phone_book[i])) return false;
    }

    return true;
  }
}