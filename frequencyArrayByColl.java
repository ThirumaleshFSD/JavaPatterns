import java.util.HashMap;
public class frequencyArrayByColl {
    public static void main(String[] args) {
        int a[]={1,2,4,3,6,9,7,9,3,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:a){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);

    }
}
