class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dicti = dict()

        if(len(strs) == 1):
            return list([strs])
        for i in strs:
            if "".join(sorted(i)) not in dicti:
                dicti["".join(sorted(i))] = [i]
            else:
                dicti["".join(sorted(i))].append(i)
        return list(dicti.values())
