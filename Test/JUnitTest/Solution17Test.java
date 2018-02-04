package JUnitTest;

import org.junit.Test;
import p17LetterCombinationsofaPhoneNumber.Solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class Solution17Test {
    @Test
    public void letterCombinations() throws Exception {
        Solution solution = new Solution();
        assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),solution.letterCombinations("23"));
    }

}