class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        if (words.length>100){
            return 0;
        }
        String[] morseDict = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> morseSet = new HashSet<String>();
        for(String word : words){
            if (word.length() >12){
                return 0;
            }
            StringBuilder sb = new StringBuilder();
            for (char c: word.toCharArray()){
                sb.append(morseDict[c-'a']);
            }
            morseSet.add(sb.toString());
        }
        return morseSet.size();
    }
}