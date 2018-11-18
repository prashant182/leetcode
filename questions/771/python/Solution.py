class Solution(object):
    def numJewelsInStones(self, J, S):
        """
        :type J: str
        :type S: str
        :rtype: int
        """
        if len(J)==0 or len(S)==0:
            return 0
        answer=0
        J_set = set(J)
        for char in S:
            if char in J_set:
                answer+=1
        
        return answer