import java.util.*;

public class SquareOfArray {
    public static void main(String[] args) {

        int a[] = {4,-1,9,3,7};
        Arrays.sort(a);

        int n = a.length;
        int a1[] = new int[n];

        int l = 0;
        int r = n - 1;
        int p = n - 1;

        while(l <= r){

            int left = a[l] * a[l];
            int right = a[r] * a[r];

            if(left > right){
                a1[p] = left;
                l++;
            } 
            else{
                a1[p] = right;
                r--;
            }

            p--;
        }

        System.out.println(Arrays.toString(a1));
    }
}