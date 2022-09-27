import java.io.*;
import java.util.*;
public class Codeforces {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner inp = new Scanner(System.in);
        //Scanner inp = new Scanner(new FileReader("/home/riddhirup/IdeaProjects/JavaPrograms/src/input.txt"));
        int t;
        t = inp.nextInt();
        for(int ty1=0;ty1<t;ty1++){
             int n = inp.nextInt();
             int c = inp.nextInt();
             int i;
             int num[] = new int[n];
             for(i=0;i<n;i++){
                 num[i] = inp.nextInt();
             }
             Arrays.sort(num);
             /*for(int it:num){
                 System.out.print(it+" ");
             }
             System.out.println();*/

             ArrayList<Integer> arr = new ArrayList<Integer>();
             int ctr=1;
             for(i=1;i<num.length;i++){
                 if(num[i]==num[i-1]){
                     ctr++;
                 }
                 else{
                     arr.add(ctr);
                     ctr=1;
                 }
             }
             arr.add(ctr);
             //System.out.println(arr);
            int sum=0;
            for(i=0;i<arr.size();i++){
                 sum+=Math.min(arr.get(i),c);
             }
             System.out.println(sum);

        }
    }
}
