package Day02;

import java.util.HashSet;

public class Ahyeong {
    
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        System.out.println(new Ahyeong().solution(nums));
    }

    public int solution(int[] nums) {
        int max = nums.length / 2;

        // nums의 중복제거
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }

        // set의 사이즈가 max 보다 클 때 : return max
        // 작을 때 : return set.size()
        if(set.size() > max){
            return max;
        } else {
            return set.size();
        }

    }
}
