public class Solution1{
     public int numJewelsInStones(String J, String S) {
        if (J.length()==0 || S.length()==0){
            return 0;
        }
        char[] jewelArray = J.toCharArray();
        Set<Character> jewelMap = new HashSet<>();
        for (char c:jewelArray){
            jewelMap.add(c);
        }
        
        int counter = 0;
        char[] stoneArray = S.toCharArray();
        for (char c: stoneArray){
            if (jewelMap.contains(c)){
                counter++;
            }   
        }
        return counter;
    }
}