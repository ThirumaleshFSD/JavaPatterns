import java.util.*;
public class TwoPointerZeros {
    public static void main(String[]args){
        int a[]={1,0,2,0,3,0,4,0};
        int l=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[l];
                a[l]=temp;
                l++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
