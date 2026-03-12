import java.util.*;
public class CountLetters {
    public static void main(String[] args){
        String s="ahu4AD736#@$%2*";
        int num=0;
        for(int i=0;i<s.length();i++){
            
            if((s.charAt(i)>='0' && s.charAt(i)<='9')){
                num+=(s.charAt(i)-'0');
                System.out.println(num);
            }
        }
    }
}