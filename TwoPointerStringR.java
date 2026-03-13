public class TwoPointerStringR {
    public static void main(String[] args){
        String s="Javadeveloper";
        char ch[]=s.toCharArray();
        int l=ch.length/2;
        int r=ch.length-1;
        while(l<r){
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
        System.out.println(ch);
    }
}
