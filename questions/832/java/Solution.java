class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int[] item : A){
            int start = 0;
            int end = item.length -1;
            while(start <= end){
                int temp;
                temp = item[start];
                item[start] = item[end]==0 ? 1: 0;
                item[end] = temp ==0? 1 :0;
                start++;
                end--;
            }
        }
        return A;
    }
}