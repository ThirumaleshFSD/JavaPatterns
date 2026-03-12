import java.util.*;

public class TwoPointerThreeSum {
    public static void main(String[] args){
        int a[]={1,-1,2,-1,0,3,-2,-3,0};
        int tar=0;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            int left=i+1;
            int right=a.length-1;
           int sum=a[i]+a[left]+a[right];
            while(left<right){
                 
                if(sum==tar){
                System.out.println(a[i]+" "+a[left]+" "+a[right]);
                // left++;
                // right--;
                return;
                
                
                
            }
            else if(sum<tar){
                left++;
                
            }
            else{
                right--;
            }

            }
            
        }
    }
}
