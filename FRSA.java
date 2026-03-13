import java.util.*;
import java.util.ArrayList;
public class FRSA {//FIRST $ WILL REVERE AND LAST FOUR WILL ASSENDING ORDER 
    public static void main(String[] args) {
        int a[]={11,3,4,8,6,1,9,5,10};
        List<Integer> li1=new ArrayList<Integer>();

        List<Integer> li2=new ArrayList<Integer>();
          for(int i=0;i<a.length/2;i++){
            li1.add(a[i]);
            Collections.sort(li1);

          }
          for(int i=a.length/2;i<a.length;i++){
            li2.add(a[i]);
            Collections.sort(li2);
             Collections.reverse(li2);

          }
          int x=0;
          for(int i=0;i<li1.size();i++){
            a[x++]=li1.get(i);

          }
           for(int i=0;i<li2.size();i++){
            a[x++]=li2.get(i);
            
          }
          System.out.println(Arrays.toString(a));



    }
}
