class Solution {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c:str.toCharArray()){
            if(c>=65 && c <=90){
                c=(char)(c+32);
            }
            sb.append(c);
        }
       return sb.toString();
    }
}