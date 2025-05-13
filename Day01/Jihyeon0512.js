function solution(participant, completion) {
    var answer = '';
    
    const map = new Map();
    
    //참여자를 map에 [이름, 인원]로 넣음
    for (let p of participant) {
        map.set(p, (map.get(p) || 0) + 1);
    }
    
    //통과하지 못한 [이름]을 map에서 찾은 후 인원 -1
    for (let c of completion) {
        if (map.has(c)) {
            map.set(c, map.get(c) - 1);
            if (map.get(c) === 0)
                map.delete(c);
        }
    }
    
    //하나 남은 키 = 완주하지 못한 선수
    answer = Array.from(map.keys())[0];
    
    return answer;
}