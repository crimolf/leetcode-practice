package leetcode.editor.en.p242;

//Given two strings s and t, return true if t is an anagram of s, and false 
//otherwise. 
//
// 
// Example 1: 
//
// 
// Input: s = "anagram", t = "nagaram" 
// 
//
// Output: true 
//
// Example 2: 
//
// 
// Input: s = "rat", t = "car" 
// 
//
// Output: false 
//
// 
// Constraints: 
//
// 
// 1 <= s.length, t.length <= 5 * 10⁴ 
// s and t consist of lowercase English letters. 
// 
//
// 
// Follow up: What if the inputs contain Unicode characters? How would you 
//adapt your solution to such a case? 
//
// Related Topics Hash Table String Sorting 👍 14372 👎 480


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {

        char[]a=s.toCharArray();
        char[]b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);


    }
}
//leetcode submit region end(Prohibit modification and deletion)
