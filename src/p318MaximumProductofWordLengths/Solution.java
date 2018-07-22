package p318MaximumProductofWordLengths;

/**
 * Description:Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.

 Example 1:

 Input: ["abcw","baz","foo","bar","xtfn","abcdef"]
 Output: 16
 Explanation: The two words can be "abcw", "xtfn".
 Tip:tmp[i] |= 1 << (current.charAt(j) - 'a');代码中关键的一个地方是这段，一个int有32位，这边取int的低26位来代表当前的word所包含的字母
 假设一个word是abcd，则tmp的值为0000000....1111(一共32位)，得到每一个word的tmp值后，就可以而根据tmp值的&是否等于1来判断这两个字符串有没有重叠的字母。
 时间复杂度O(n * n)
 */
public class Solution {
    public int maxProduct(String[] words) {
        if (words == null || words.length == 1)
            return 0;
        int[] tmp = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            String current = words[i];
            for (int j = 0; j < current.length(); j++) {
                tmp[i] |= 1 << (current.charAt(j) - 'a');
            }
        }
        int maxProduct = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((tmp[i] & tmp[j]) == 0 && words[i].length() * words[j].length() > maxProduct)
                    maxProduct = words[i].length() * words[j].length();
            }
        }
        return maxProduct;
    }
}
