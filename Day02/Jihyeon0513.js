function solution(nums) {
    var answer = 0;
	
    const map = new Map();
	
  	//몬스터 배열을 맵의 키값으로 넣음
    for (let n of nums) {
        map.set(n, 0);
    }

  	//map 사이즈가 가져갈 수 있는 수보다 크면 map 리턴, 아니면 최대 수 리턴
    answer = (map.size < nums.length / 2) ? map.size : nums.length / 2;

    return answer;
}