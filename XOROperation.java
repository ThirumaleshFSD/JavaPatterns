public class XOROperation {
    public static void main(String[] args) {
        int n=5;
        int nums[]=new int[n];
        int result=0;
        for (int i = 0; i< n; i++) { 
         nums[i]=2*i;
         result^=nums[i];
            
        }
        System.out.println(result);
    }
    }

