class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap <>();
        char[] sorted_s;
        for (int i=0; i<strs.length; i++)
        {
            sorted_s = strs[i].toCharArray();
            Arrays.sort(sorted_s);
            String key = String.valueOf(sorted_s);
            if (!map.containsKey(key))
            {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}