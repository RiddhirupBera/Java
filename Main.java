import javax.swing.plaf.synth.SynthStyleFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int i1 = 'd';
        int i0 = 'a';
        System.out.println(i1);

        String a = "SacHin";
        String b = new String("Sachin");
        if(a.equalsIgnoreCase(b)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println(a.substring(1,4));

        char a00 = 13;
        System.out.println(a00);

        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        m.put(13,2);
        m.put(14,6);
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            if(e.getValue()==2){
                System.out.println("Yep");
            }
            System.out.print(e.getKey()+" "+e.getValue()+"\n");
        }
        int arr[] = {4,3,5,4,2,2,4,5,1};
        Map<Integer,Integer> m1 = new HashMap<Integer,Integer>();
        int ctr=0;
        for(int i=0;i<arr.length;i++){
            if(m1.get(arr[i])==null){
                ctr=0;
            }
            else{
                ctr=m1.get(arr[i]);
            }
            m1.put(arr[i],ctr+1);
        }
        for(Map.Entry<Integer,Integer> e:m1.entrySet()){
            System.out.print(e.getKey()+" "+e.getValue()+"\n");
        }

    }
}