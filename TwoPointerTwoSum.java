import java.util.*;
public class TwoPointerTwoSum {
    public static void main(String[] args){
        int a[]={1,2,0,3,4,5,10};
        int tar=3;
        int l=0;
        int r=a.length-1;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        while(l<r){
            int sum=a[l]+a[r];
            if(sum == tar){
                System.out.println(l+ " "+ r);
                break;
            }
            else if(sum<tar){
                l++;
            }
            else {
                r--;
            }
        }
    }
}
