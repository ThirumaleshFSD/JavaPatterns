public class PrefixEqual {
    public static void main(String[] args) {
        String s1[]={"flower","flow","flight"};
        String s2=s1[0];
        for(int i=1;i<s1.length;i++){
            while(s1[i].indexOf(s2)!=0){
                s2=s2.substring(0,s2.length()-1);
            }
        }
        System.out.println(s2);

    }
}
