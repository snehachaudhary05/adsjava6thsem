package advancedsa;
public class ValidSplits{
    public static void main(String[] args) {
        int[] arr={10,4,-8,7};
        int result=ValidSplits.validsplits(arr);
        System.out.println("Number of valid splits:"+result);
    }
    public static int validsplits(int[] arr){
        int totalSum=0;
        for(int num:arr){
            totalSum+=num;
        }
        int leftSum=0;
        int validsplit=0;
        for(int i=0;i<arr.length-1;i++){
            leftSum+=arr[i];
            int rightSum=totalSum-leftSum;
            if(leftSum>=rightSum){
                validsplit++;
            }
        }
        return validsplit;
    }
}