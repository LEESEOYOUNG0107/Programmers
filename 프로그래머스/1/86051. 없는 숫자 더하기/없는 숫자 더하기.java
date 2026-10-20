class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean found = false;
        
        for(int i=0; i<10; i++){
            found = false;
            for(int j=0; j<numbers.length; j++){
                if(numbers[j] == i){
                    found = true;
                }
            }
            
            if(found == false){
                answer+=i;
            }
        }
        return answer;
    }
}