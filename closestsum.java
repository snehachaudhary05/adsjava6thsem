public class closestsum {
    public static int[] closestpair(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;
        int closestsum = Integer.MIN_VALUE;
        int[] result = new int[2];
        while(left < right ){
            int sum = arr[left] + arr[right];
            if(sum < target && sum > closestsum){
                closestsum = sum;
                result[0] = arr[left];
                result[1] = arr[right];
            }
            if(sum <target){
                left++;
            }else{
                right--;
            }
        }
        return result;
    }
}