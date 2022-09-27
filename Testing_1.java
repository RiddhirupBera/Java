import java.io.*;
import java.util.*;
public class Testing_1 {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<Integer>(4);
        /*
        System.out.println(arr);
        arr.add(2);
        arr.add(4);
        arr.add(5);
        System.out.println(arr.size()+" "+arr.get(2));
        */
        ArrayList<ArrayList<Integer>> arr_2 = new ArrayList<ArrayList<Integer>>();
        int i;
        for(i=1;i<=5;i++){
            arr_2.add(new ArrayList<Integer>());
            arr_2.get(arr_2.size()-1).add(i);
            arr_2.get(arr_2.size()-1).add((int)Math.pow(i,3));
        }
        System.out.println(arr_2);

    }
}
