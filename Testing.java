public class Testing {

    static void dfs(int ind,String str,int n,String s){
        if(ind==n){
            System.out.println(str);
            return;
        }
        dfs(ind+1,str,n,s);
        dfs(ind+1,str+s.charAt(ind),n,s);
    }

    public static void main(String args[]){
        int i=20;
        String s1 = String.valueOf(i);
        //String str1 = "Tevez";
        //int i1 = String.valueOf(str1);
        String pr1 = "My man won ";
        pr1 +=s1;
        System.out.println(pr1);

        String sr1 = "569";
        int i2 = Integer.parseInt(sr1);
        System.out.println(i2+7);
        String sr2 = "1011";
        int g = Integer.parseInt(sr2,2);
        System.out.println(g);
        int i3 = 103;
        String si3 = String.valueOf(i3);
        System.out.println(si3);

        long t1 = (long)1e9;
        System.out.println(t1);
        String str="",st="Richard";
        dfs(0,str,st.length(),st);

        int arr[] = {4,6,5,3,23};
        System.out.println(arr.length);

    }
}
