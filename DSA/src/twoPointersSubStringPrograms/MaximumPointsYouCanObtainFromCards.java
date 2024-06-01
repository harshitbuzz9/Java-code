package twoPointersSubStringPrograms;

import java.util.*;

//don't pick the element from contiguous middle mid
public class MaximumPointsYouCanObtainFromCards {
    public static int maximumPointsYouCanObtainFromCards(int[] arr, int k) {
        int i = 0, j = (arr.length - 1), sum = 0;
        while (i < k) {
            sum += arr[i];
            i++;
        }
        i--;
        int max_sum = sum;
        while (i > -1) {
            sum = (sum - arr[i]) + arr[j];
            max_sum = Math.max(sum, max_sum);
            i--;
            j--;
        }
        return max_sum;
    }

    public static List<Map<String, Integer>> MaximumPointsYouCanObtainFromCardsRange() {
        return null;
    }
}
