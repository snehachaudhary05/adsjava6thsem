import java.util.*;

public class KadansAlgo2 {
    public static void main(String[] args){
        //steps of kadanes algo
        //initialization
        //{1,-2,3,4,-1,2,1,-5,4}
        //start:currentsum=0,maxsum=Integer.min_value
        //first ele(1):currentsum=max(1,0+1)1,maxsum=max(_In,1)1
        //second element(-2):currentsum:max(-2,1-2)=-1,maxsum=max(1,-1)=1;
        //third element(3):currentsum=max(3,-1+3),maxsum=3;
        //fourth element(4):currentsum=max(4,3+4)=7 ,maxsum=max(3,7)=7;
        //fifth element(-1):currentsum=max(-1,7-1)=6,maxsum=max(7,6)=7;
        //sixth element (2) :currentsum=max(2,6+2)=8 ,maxsum=max(7,8)=8;
        //seventh element (1):currentsum=max(1,8+1)=9 maxsum=9
        int[] nums={1,-2,3,4,-1,2,1,-5,4};
        System.out.println("Maximum subarray sum:"+maxSubArray(nums));

    }
    public static int maxSubArray(int[] nums){
        if(nums==null || nums.length==0){
            return 0;
        }
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int num:nums){
            currentSum=Math.max(num,currentSum+num);
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}
