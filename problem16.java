import java.util.*;
public class problem16 {
    static int SumOfThree(int[] nums,int target){
         Arrays.sort(nums);
         int closestsum = Integer.MAX_VALUE;
         for(int i =0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length -1 ;
            while(left < right)
            {
                int currentsum = nums[i]+nums[left]+nums[right];
                if(Math.abs(target - currentsum) < Math.abs(target - closestsum)){
                    closestsum = currentsum;

                }
                if(currentsum <target){
                    left++;
                }

                else if(currentsum > target){
                    right--;
                }
                else{
                    return currentsum;
                }
            }
         }
         return closestsum;
    }
    public static void main(String[] args){
        int nums1[] = {-1,2,1,-4};
        int target1 = 1;
        int nums2[] = {0,0,0};
        int target2 = 1;
        System.out.println("closest sum " + target1 +"is"+ SumOfThree(nums1,target1));
        System.out.println("closest sum of" + target2 + "is" + SumOfThree(nums2,target2) ) ;
    }
    
}