package Code.Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    // This was the fastest. Add elements to a set and if something already exists then return true.
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();

        // Remember to not compare length. Instead use contains.
        for (int i : nums){
            if (!set.contains(i))
                set.add(i);
            else
                return true;
        }

        return false;
    }

    // Once you sort the elements, if two adjacent elements are same then return true.
    public boolean containsDuplicate2(int[] nums) {
        // Sort the array to group duplicate elements together
        Arrays.sort(nums);
        
        // Check adjacent elements for duplicates
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true; // Found a duplicate
        }
        
        return false; // No duplicates found
    }
}
