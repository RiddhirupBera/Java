import java.io.*;
import java.util.*;
public class cses {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner inp = new Scanner(System.in);
        //Scanner inp = new Scanner(new FileReader("/home/riddhirup/IdeaProjects/JavaPrograms/src/input.txt"));
        int n = inp.nextInt();
        int arr[] = new int[n+1];
        Arrays.fill(arr,0);
        for(int i=1;i<n;i++){
            int num = inp.nextInt();
            arr[num]=1;
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            if(arr[i]==0){
                ans=i;
                break;
            }
        }
        System.out.println(ans);

    }
}