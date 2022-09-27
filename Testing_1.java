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
        arr.add(10);
        arr.add(9);
        arr_2.add(arr);

        arr.set(0,9);
        arr.set(1,9);

        arr_2.add(arr);
        System.out.println(arr_2);

    }
}
