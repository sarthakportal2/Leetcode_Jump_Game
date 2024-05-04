class Solution:
    def canJump(self, nums: List[int]) -> bool:
        #T(C(N=O(N)) and S(C(N)==O(1) as it requires non memory space allocation iteratively   
        longjump=0
        for i in range(len(nums)):#Iterating though array's Length
            if i>longjump:return False#Printing False to the Initally pre assigned jump
            longjump=max(longjump,nums[i]+i)#calculating Maximum Jump
        
        return True#Printing True to Max(Jump)
