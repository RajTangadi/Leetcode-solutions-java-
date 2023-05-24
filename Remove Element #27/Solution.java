
/* 

 Explanations:- 

Take a variable count. This will count the number of elements except val.

Scan the array left to right.

If the current element is not equal to val, we will add that element to the place of count.
 
*/

public class Solution {
    public static void main(String[] args) {
        int nums[] = { 21, 21, 23, 21, 54, 32, 21 };
        int val = 21;
        System.out.println(removeElement(nums, val));
    }

    static int removeElement(int nums[], int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}