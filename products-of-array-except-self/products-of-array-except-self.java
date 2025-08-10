class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int sayi = nums.length;
        int[] sayilar = new int [sayi];
        
        for(int i = 0; i < nums.length; i++) {
            int product = 1;
           for(int j = 0; j < nums.length; j++) {
               if(i != j){
               product *= nums[j];
           }
           }
           sayilar[i] = product;
        }
        
        return sayilar;
            
            
                
        }
}  
