class Solution(object):
    def selfDividingNumbers(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: List[int]
        """
        Ans = []
        for num in range(left,right+1):
            eligible = True
            currentNum = num;
            while(num > 0):
                digit = num % 10
                if digit == 0 or currentNum % digit > 0:
                    eligible = False
                num = num / 10
            if eligible == True:
                Ans.append(currentNum)
        return Ans