import java.util.*;
public class leetcode34{
    public static int lengthOfLongest(String s){
        int k=2;
        if(s==null || s.length()==0 ){
            return 0;
        }
        Map<Character,Integer> map=new HashMap<>();
        int le=0;
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.size()>k){
                char leftChar=s.charAt(le);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                le++;
            }
            maxLen=Math.max(maxLen,i-le+1);
        }
        return maxLen;
    }
    public static void main(String[] args){
           String s="eceba";
  
           System.out.println(lengthOfLongest(s));
    }
}