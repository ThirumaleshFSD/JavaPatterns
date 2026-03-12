import java.util.*;
public class TwoPointerD {
    public static void main(String[] args) {
        int a[]={1,1,2,3,2,3,4,5,2,3};
        int m=0;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
           if(a[m]!=a[i]){
            m++;
            a[m]=a[i];
           }
        }
        for(int i=0;i<=m;i++){
            System.out.print(a[i]+ " ");
        }
    }
}
