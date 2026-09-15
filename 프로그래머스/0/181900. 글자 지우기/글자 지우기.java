class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String a = "";
        for(int i=0; i<my_string.length(); i++){
            boolean remove = false;
            
            for(int x : indices){
                if(x == i){
                    remove = true;
                }
            }
            
            if(remove == false){
                answer += my_string.charAt(i);
            }else{
                a += my_string.charAt(i);
            }
        }
        return answer;
    }
}