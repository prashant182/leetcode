class Solution(object):
    def sortArrayByParity(self, A):
        """
        :type A: List[int]
        :rtype: List[int]
        """
        if len(A) > 50000:
            return 0
        even = []
        odd = []
        for num in A:
            if num > 50000:
                return 0
            if num%2 == 0:
                even.append(num)
            else:
                odd.append(num)
        return even+odd
        