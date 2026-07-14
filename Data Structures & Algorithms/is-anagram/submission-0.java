class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> out = new HashMap<>();
        if(s.length() != t.length())
            return false;
        for(int i=0;i<s.length();i++)
        {
            if(!out.containsKey(s.charAt(i)))
                out.put(s.charAt(i),1);
            else{
                int cf = out.get(s.charAt(i));
                out.replace(s.charAt(i),cf+1);

            }
        }
        for(int i=0;i<t.length();i++)
        {
            if(!out.containsKey(t.charAt(i)))
                return false;
            else{
                int cf = out.get(t.charAt(i));
                out.replace(t.charAt(i),cf-1);
            }
            if(out.get(t.charAt(i))<0)
                return false;
        }
        for (int frequency : out.values()) {
            if (frequency != 0) {
                return false;
            }
        }
        return true;
    }
}
