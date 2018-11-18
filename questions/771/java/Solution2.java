public class Solution2{
     public int numJewelsInStones(String J, String S) {
        if (J.length()==0 || S.length()==0){
            return 0;
        }
        int count=0;
        boolean[] jewels = new boolean['z'-'A'+1];
        for (int i=0;i<J.length();i++){
                jewels[J.charAt(i)-'A']=true;
        }
        
        for (int j=0;j<S.length();j++){
            if(jewels[S.charAt(j)-'A']){
                count++;
            }
        }
        return count;
    }
}