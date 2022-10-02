import java.io.*;
import java.util.*;
public class Codeforces {
    public static void main(String args[]) throws FileNotFoundException {
        //Scanner inp = new Scanner(System.in);
        Scanner inp = new Scanner(new FileReader("/home/riddhirup/IdeaProjects/JavaPrograms/src/input.txt"));
        int t;
        t = inp.nextInt();
        for(int ty1=0;ty1<t;ty1++){
             int n = inp.nextInt();
             int m = inp.nextInt();
             int arr[][] = new int[n][m];
             int i,j,x=1,y=1;
             for(i=0;i<n;i++){
                 for(j=0;j<m;j++){
                     if((i-2>=0 || i+2<m) && (j-1>=0 || j+1<n)){
                         x=i+1;
                         y=j+1;
                         break;
                     }
                     else if((j-2>=0 || j+2<n) && (i-1>=0 || i+1<m)){
                         x=i+1;
                         y=j+1;
                         break;
                     }

                 }
             }
             System.out.println(x+" "+y);

        }
    }
}
/*
1 2 3 4 5 6 7


 */