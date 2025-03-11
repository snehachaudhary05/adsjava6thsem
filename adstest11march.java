import java.util.*;
public class intersection {
    public static void main(String[] args) {
        
    
    int[] a1={1,2,3,4};
    int[] b1={5,6,7,4};
    int[] intersections=fI(a1,b1);
    for(int num:intersections){
        System.out.println(num+" ");
    }
    }
    public static int[] fI(int[] a1,int[] b1){
        Set<Integer> set1=new HashSet<>();
        Set<Integer> intersectset =new HashSet<>();
        for(int num:a1){
            set1.add(num);
        }
        for(int num:b1){
            if(set1.contains(num)){
                intersectset.add(num);
            }
        }
        int[] intersectarray=new int[intersectset.size()];
        int index=0;
        for(int num:intersectset){
            intersectarray[index++]=num;
        }
        return intersectarray;
    }
}