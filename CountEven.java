
import java.util.Scanner;

public class CountEven {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        System.out.println("enter n value :");
        int a[]=new int[n]; 
        System.out.println("enter array elements :");
        for(int i=0;i<n;i++){
            a[i]=t.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                count++;
            }
        }
        System.out.println("Number of even elements in the array is: "+count);

    }
}
