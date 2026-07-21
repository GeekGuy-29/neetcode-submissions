class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorStr = new String(chars);
            if(map.containsKey(sorStr))
            {
                map.get(sorStr).add(strs[i]);
            }
            else
            {
                map.put(sorStr, new ArrayList<>());
                map.get(sorStr).add(strs[i]);
            }
        }
        List<List<String>> list = new ArrayList<>();
        for(List<String> elements : map.values())
        {
            list.add(elements);
        }
        return list;
    }
}
