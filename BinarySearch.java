import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int a[]={3,8,4,1,5,9,2};
        Arrays.sort(a);
        
        int l=0;
        int r=a.length-1;
        int tar=4;
        while(l<r){
            int mid=(l+r)/2;
            if(a[mid]==tar){
                System.out.println(a[mid]);
                return;
            }
            else if(tar<a[mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        System.out.println(-1);
    }
}
