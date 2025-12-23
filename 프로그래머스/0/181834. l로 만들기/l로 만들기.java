class Solution {
    public String solution(String myStringg) {
        String answer = "";
        char[] myString = myStringg.toCharArray();
        for(int i=0; i<myString.length; i++){
            if(myString[i] <= 'l'){
                myString[i] = 'l';
            }
        }
        return new String(myString);
    }
}