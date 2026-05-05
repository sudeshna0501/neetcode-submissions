class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        int target,j,k;
        for(int i=0;i<nums.length-2;i++)
        {
             if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            j=i+1;
            k=nums.length-1;
            while(j<k)
            {
                target = nums[i]+nums[j]+nums[k];
                
                if(target==0) 
                {arr.add(Arrays.asList(nums[i], nums[j], nums[k]));
                j++; k--;
                
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
                else if(target>0) k--;
                else if(target<0) j++;
            }



        }
        return arr;
    }
}
