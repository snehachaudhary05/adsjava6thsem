

import java.util.*;
public class LargestSubwithzero {
    int maxLen(int arr[]) {
        // code here
        int maximumLen=0;
        int sum=0;
        HashMap<Integer,Integer> SIM=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maximumLen=i+1;
                
            }
            if(SIM.containsKey(sum)){
                maximumLen=Math.max(maximumLen,i-SIM.get(sum));
            }
            else{
                SIM.put(sum,i);
            }
        }
        return maximumLen;
    }
}