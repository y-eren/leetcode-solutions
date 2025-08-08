class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        int difference = 0;
        int array [] = new int[2];

        for(int i = 0; i< nums.length; i++) {
           difference = target - nums[i];
           if(hashmap.containsKey(difference)){
                int keyIndex = hashmap.get(difference);
                array[0] = keyIndex;
                array[1] = i;
                
           }
           else {
            hashmap.put(nums[i],i);
           }
          
            
        }
         return array;
