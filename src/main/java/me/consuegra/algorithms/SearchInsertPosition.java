package me.consuegra.algorithms;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index
 * where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (nums[middle] < target) {
                low = middle + 1;
            } else if (nums[middle] > target) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return low;
    }

    public int searchInsertRec(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        return searchInsertRec(nums, 0, nums.length - 1, target);
    }

    private int searchInsertRec(int[] nums, int start, int end, int target) {
        if (start > end) {
            return start;
        }
        int middle = (start + end) / 2;
        if (nums[middle] == target) {
            return middle;
        } else if (nums[middle] > target) {
            return searchInsertRec(nums, start, middle - 1, target);
        } else {
            return searchInsertRec(nums, middle + 1, end, target);
        }
    }

}
