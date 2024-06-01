package twoPointersSubStringPrograms;

import java.util.*;

public class MaxNonRepeatingSubstring {
    public static int maxNonRepeatingSubstring(String str) {
        Set<Character> reference = new HashSet<>();
        int i = 0, j = 0, MAX_SUB_ARR = 0;
        while (j < str.length()) {
            if (!(reference.contains(str.charAt(j)))) {
                reference.add(str.charAt(j));
                MAX_SUB_ARR = Math.max((j - i + 1), MAX_SUB_ARR);
            } else {
                while (str.charAt(i) != str.charAt(j)) {
                    reference.remove(str.charAt(i++));
                }
                reference.remove(str.charAt(i++));
                reference.add(str.charAt(j));
            }
            j++;
        }
        return MAX_SUB_ARR;
    }
}