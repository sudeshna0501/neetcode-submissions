class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val found = HashSet<Int>();
        for (num in nums){
            if (found.contains(num)) return true;
            found.add(num);
        }
        return false;
    }
}
