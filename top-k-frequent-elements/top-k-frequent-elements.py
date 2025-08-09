class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        dicti = dict()
        for num in nums:
            if num not in dicti:
                dicti[num] = 1 
            else:
                dicti[num] += 1

        listi = list()

        for i,t in sorted(dicti.items(), key = lambda x: x[1],reverse=True):
            listi.append(i)
        return listi[:k]
