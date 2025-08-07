class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(s) != len(t)):
            return False
        dicti = dict()
        for i in s:
          if(i not in dicti):
            dicti[i] = 1  
          else:
            dicti[i] += 1
        for i in t:
           if(i in dicti):
            dicti[i] -= 1
        for i in dicti:
            if(dicti[i] != 0):
                return False
        return True
