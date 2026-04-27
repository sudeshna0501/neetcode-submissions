class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        res={}
        for i in nums:
            res[i]= res.get(i,0)+1
        
        sorted_dict = dict(sorted(res.items(), key=lambda item: item[1], reverse=True))
        return list(sorted_dict.keys())[:k]
        