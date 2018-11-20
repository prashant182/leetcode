class Solution(object):
    def uniqueMorseRepresentations(self, words):
        """
        :type words: List[str]
        :rtype: int
        """
        morseMap = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        morseSet = set()
        for word in words:
            morseCode = []
            for c in word:
                morseCode.append(morseMap[ord(c)-97])
            morseSet.add(''.join(morseCode))
        return len(morseSet)