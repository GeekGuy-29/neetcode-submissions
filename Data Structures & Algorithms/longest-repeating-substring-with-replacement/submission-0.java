class Solution {
    public int characterReplacement(String s, int k) {
       int[] count = new int[26];
    int left = 0;
    int maxLength = 0;
    int max_freq = 0;

    for (int right = 0; right < s.length(); right++) {
        
        // 1. Add current character
        char currChar = s.charAt(right);
        count[currChar - 'A']++;
        
        // 2. Update max_freq
        max_freq = Math.max(max_freq, count[currChar - 'A']);
        
        // 3. Check if window is invalid: (Window Length - max_freq > k)
        if ((right - left + 1) - max_freq > k) {
            
            // 4 & 5. Shrink from the left
            char leftChar = s.charAt(left);
            count[leftChar - 'A']--; 
            left++;
        }
        
        // 6. Update max length with the current valid Window Length
        maxLength = Math.max(maxLength, right - left + 1);
    }
    
    return maxLength; 
    }
}
