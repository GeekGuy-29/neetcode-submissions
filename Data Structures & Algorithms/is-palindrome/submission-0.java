class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isLetterOrDigit(s.charAt(left)))
            {
                left++;
                continue;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right)))
            {
                right--;
                continue;
            }
            else if(Character.toLowerCase(s.charAt(left)) != 
                    Character.toLowerCase(s.charAt(right)))
            {
                return false;
            }
            else
            {
                left++;
                right--;
            }
        }
        return true;
    }
}
