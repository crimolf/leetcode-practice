package leetcode.editor.en.p349;

//Given two integer arrays nums1 and nums2, return an array of their 
//intersection. Each element in the result must be unique and you may return the result in 
//any order. 
//
// 
// Example 1:
//
// 
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
// 
//
// Example 2: 
//
// 
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//Explanation: [4,9] is also accepted.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums1.length, nums2.length <= 1000 
// 0 <= nums1[i], nums2[i] <= 1000 
// 
//
// Related Topics Array Hash Table Two Pointers Binary Search Sorting 👍 6944 👎
// 2347


import java.util.*;
import java.util.stream.Collectors;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list1 = Arrays.stream(nums1).boxed().toList();
        List<Integer> list2 = Arrays.stream(nums2).boxed().toList();
        Set<Integer>set3=new HashSet<>();

        for(Integer a: list1){
            if(list2.contains(a)){
                set3.add(a);
            }
        }

        int[] nums3 = set3.stream().mapToInt(Integer::intValue).toArray();
        return nums3;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
