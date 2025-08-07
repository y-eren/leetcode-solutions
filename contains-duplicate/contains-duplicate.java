class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> list = new HashMap<Integer, Integer>();
        
        for (int i = 0; i< nums.length; i++) {
            int count = 0;
            if(!(list.containsKey(nums[i])))
            list.put(nums[i], count+1);
            else {
                list.put(nums[i], list.get(nums[i]) + 1);
            }
           
        }
       for (int list2 : list.values()) {
        if(list2 >= 2) {
            return true;
        }
       }
       return false;
    }
}
