class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0)return 0;
        HashSet<Integer> uq = new HashSet<>();
        int len=1, maxl = 1;
       

        for(int n:nums)
        {uq.add(n);}

        int[] arr =  uq.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);


        for(int i=1;i<arr.length;i++){
            if (arr[i]==arr[i-1]+1)
            {
               len++;
            }
            else{
                len=1;
            }
            maxl = Math.max(maxl, len);

        }

        return maxl;
        

    }
}
