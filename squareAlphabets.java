public class squareAlphabets {
    public static void main(String[] args) {
        int n=5;
        char ch='A';
        for(int i=0;i<n;i++){
            int l=0;
            int r=n-1;
            for(int j=0;j<n;j++){
             if(i==0 || i==n-1  || j==l || j==r){
             System.out.print(" "+ch );
             }
             else{
                System.out.print("  ");
                
             }
             ch++;

            }
           
        System.out.println();
        }
        
    }
}
