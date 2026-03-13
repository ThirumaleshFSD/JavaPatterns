public class LinearSearch {
    public static void main(String[] args) {
        int a[]={8,4,5,63,9};
    int tar=50;
    for(int i=0;i<a.length;i++){
        if(a[i] == tar){
            System.out.println(a[i]);
            return;
        }
       
    }
     System.out.println(-1);
    }
    
}
