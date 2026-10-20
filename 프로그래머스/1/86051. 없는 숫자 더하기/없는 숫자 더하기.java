class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int num=0;
        boolean found = false;
        for(int i=0; i<10; i++){
            found = false; //초기화
            
            for(int j=0; j<numbers.length; j++){
                if(numbers[j] == i){
                    found=true;
                }
                num++;
            }
            
            if(found==false){
                answer+=i;
            }
        }
        return answer;
    }
}