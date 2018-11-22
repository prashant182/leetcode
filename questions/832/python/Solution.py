class Solution(object):
    def flipAndInvertImage(self, A):
        """
        :type A: List[List[int]]
        :rtype: List[List[int]]
        """
        for item in A:
            start = 0;
            end = len(item) - 1;
            while (start <=end):
                temp = item[start];
                item[start]= 1 if item[end]==0 else 0
                item[end]= 1 if temp ==0 else 0
                start +=1
                end -=1
        return A