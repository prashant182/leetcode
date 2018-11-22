class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> answerList = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num = i;
            boolean isEligible = true;
            while(i>0){
                int digit =0;
                digit = i %10;
                if (digit ==0 || num % digit >0){
                    isEligible = false;
                }
                i = i/10;
            }
            i=num;
            if (isEligible){
                answerList.add(num);
            }  
        }
        return answerList; 
    }
}