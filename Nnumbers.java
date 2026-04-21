
import java.util.Scanner;

public class Nnumbers {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        System.out.println("enter n value :");
        int a[]=new int[n]; 
        System.out.println("enter array elements :");
        for(int i=0;i<n;i++){
            a[i]=t.nextInt();
        }
        System.out.println("The numbers in the array are:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        t.close();
    }
}
