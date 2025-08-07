class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        setim = set()
        for i in nums:
            if(i in setim):
                return True
            setim.add(i)
        return False
