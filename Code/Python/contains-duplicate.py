def containsDuplicate(self, nums):
        # Sort the array to group duplicate elements together
        nums.sort()
        
        # Check adjacent elements for duplicates
        for i in range(len(nums) - 1):
            if nums[i] == nums[i + 1]:
                return True  # Found a duplicate
        
        return False  # No duplicates found

# This is the faster. Push elements to a set and compare length of set and original list
def containsDuplicate2(self, nums: List[int]) -> bool:
        return not len(set(nums))==len(nums)