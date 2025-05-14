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
    phone_book = Arrays.stream(phone_book)
        .mapToInt(Integer::parseInt)
        .sorted()
        .mapToObj(String::valueOf)
        .toArray(String[]::new);

    for (int i = 0; i < phone_book.length; i++) {
      String check = phone_book[i];
      int length = check.length();
      for (int j = i + 1; j < phone_book.length; j++) {
        if (check.equals(phone_book[j].substring(0, length))) return false;
      }

    }

    return true;
  }
}