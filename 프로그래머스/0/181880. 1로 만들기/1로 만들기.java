class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int num = 0;
        boolean one = false;
        for(int x : num_list){
            while(x > 1){
                if(x%2==0){
                    x = x/2;
                    answer++;
                }else if(x%2!=0){
                    x = (x-1)/2;
                    answer++;
                }
            }

        }
        return answer;
    }
}