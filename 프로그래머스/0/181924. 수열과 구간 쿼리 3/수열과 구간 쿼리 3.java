class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int i=0; i<queries.length; i++){
            int idx = queries[i][0];
            int idx2 = queries[i][1];
            
            int temp = arr[idx];
            arr[idx] = arr[idx2];
            arr[idx2] = temp;
        }
        return arr;
    }
}