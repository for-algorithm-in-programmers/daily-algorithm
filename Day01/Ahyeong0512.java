
package Day01;

import java.util.HashMap;

public class Ahyeong0512 {

    public static void main(String[] args) {
        
        String[] particString = {"Leo", "Mini", "Seo"};
        String[] completion = {"Leo", "Seo"};

        String answer = new Ahyeong0512().solution(particString, completion);
        System.out.println(answer);
    }

    //getOrDefault : 찾는 key가 존재한다면 찾는 key의 value를 반환하고 없거나 null이면 default 값을 반환한다.
    public String solution(String[] participant, String[] completion) {
        String answer ="";
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자 hashmap에 입력 
        // getOrDefault 메서드를 활용하여 같은 이름(key)가 존재할 때 
        // ex { "A" , "B", "C", "A" } => {["A", 1], ["B", 1], ["C", 1], ["A", 2]} 
        for(String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        // 완주자 제거
        // ex completion={"A","B","C"} => {["A",0],["B",0],["C",0],["A",1]}
        for(String c : completion) { 
            map.put(c, map.get(c) - 1);
        }
                
        for(String key : map.keySet()) {
            if(map.get(key) != 0) answer = key;
        }

        return answer;
    }
}