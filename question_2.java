import java.util.HashSet;

public class question_2 {
    public static int lengthOfLongestSubstring(String s) {
        // Set to store characters in current window
        HashSet<Character> set = new HashSet<>();

        int left = 0; // Start of window
        int maxLength = 0;

        // Right pointer moves across the string
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If character is already in set, remove from left until it's gone
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;  // Shrink window from left
            }

            // Add the current character and update max length
            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Output: 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // Output: 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // Output: 3
    }
}
