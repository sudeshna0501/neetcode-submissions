class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1)>len(s2):
            return False
        
        l=0
        r=len(s1)-1
        while r<len(s2):
            substr = sorted(s2[l:r+1])
            if substr == sorted(s1):
                return True
            l+=1
            r+=1
        return False
            
        