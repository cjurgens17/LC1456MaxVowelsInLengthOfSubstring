public class LC1456 {

    public static void main(String[] args) {
        System.out.println(LC1456.maxVowelSubarray("abciiidef", 3));
        System.out.println(LC1456.maxVowelSubarray("aeiou", 2));
        System.out.println(LC1456.maxVowelSubarray("leetcode", 3));
    }

    //Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
    //
    //Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
    //
    //
    //
    //Example 1:
    //
    //Input: s = "abciiidef", k = 3
    //Output: 3
    //Explanation: The substring "iii" contains 3 vowel letters.
    //Example 2:
    //
    //Input: s = "aeiou", k = 2
    //Output: 2
    //Explanation: Any substring of length 2 contains 2 vowels.
    //Example 3:
    //
    //Input: s = "leetcode", k = 3
    //Output: 2
    //Explanation: "lee", "eet" and "ode" contain 2 vowels.
    //
    //
    //Constraints:
    //
    //1 <= s.length <= 105
    //s consists of lowercase English letters.
    //1 <= k <= s.length

    public static int maxVowelSubarray(String s, int k){
        int max = 0;
        int curr = 0;
        int left = 0;
        int right = 0;

        while(right<k){
            if(isVowel(s.charAt(right))) curr++;
            right++;
        }

        max = curr;

        while(right < s.length()){
            if(isVowel(s.charAt(right))) curr++;
            if(isVowel(s.charAt(left))) curr--;

            max = Math.max(curr, max);
            left++;
            right++;
        }

        return max;
    }

    public static boolean isVowel(Character ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
