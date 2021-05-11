import java.util.*;
import java.util.function.BinaryOperator;

public class find_duplicate_in_Array {
    public static void duplicate(int a[],int len){
        HashSet<Integer> hs=new HashSet<>();
        ArrayList<Integer> ls=new ArrayList<>();
        hs.add(a[0]) ;
        for (int i = 1; i < a.length; i++) {
            if(hs.contains(a[i])){
                if(!ls.contains(a[i])) {
                    ls.add(a[i]);
                }
            }
            else {
                hs.add(a[i]);
            }
        }
        if(ls.isEmpty()){
            System.out.println(-1);
        }
        else
        System.out.println(ls);
    }
    public static void main(String[] args) {
        int a[]={5, 40, 1, 40, 100000, 1, 5, 1};
        duplicate(a,a.length);

    }
}

class smallest_windo_contains_all_string{
//    public static void window(String s){
//        HashSet hs=new HashSet();
//        String str="";
//        for(char i:s.toCharArray()){
//           if(hs.contains(i)){
//               continue;
//           }
//           else {
//               hs.add(i);
//                str+=i;
//           }
//        }
//        System.out.println(str);
//        System.out.println(hs.size());
//    }
    public static String Duplicates(String str){
        HashMap<Character,Integer> hm=new HashMap<>();
        int distinct_count=0;
        for (char i:str.toCharArray()
             ) {
            if(hm.containsKey(i)){
                Integer a= hm.get(i);
                hm.put(i,a+1);
            }
            else hm.put(i,1);
        }
        distinct_count=hm.size();  //4
        int size=Integer.MAX_VALUE;  //100000    {a,b,c,d}
        String res="";
        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            int visi[]=new int[256];  // {1,,1,1,0,0,0,0,0,0,0,.........}
            for (int j = 0; j < 256; j++) {
                visi[j]=0;
            }
            String sub_str=""; //aabcbcd
            for (int j = i; j < str.length(); j++) {
                if(visi[str.charAt(j)]==0){
                    count++;   //4
                    visi[j]=1;
                }
                sub_str+=str.charAt(j);
                if(count==distinct_count){
                    break;
                }
            }
            if(sub_str.length()<size && count==distinct_count){
                res=sub_str;
                distinct_count=res.length();
            }
        }
        return res;
    }
    static final int MAX_CHARS = 256;
    static String findSubString(String str)
    {
        int n = str.length();

        // Count all distinct characters.
        int dist_count = 0;

        boolean[] visited = new boolean[MAX_CHARS];
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (visited[str.charAt(i)] == false) {
                visited[str.charAt(i)] = true;
                dist_count++;
            }
        }

        // Now follow the algorithm discussed in below
        // post. We basically maintain a window of characters
        // that contains all characters of given string.
        int start = 0, start_index = -1;
        int min_len = Integer.MAX_VALUE;

        int count = 0;
        int[] curr_count = new int[MAX_CHARS];
        for (int j = 0; j < n; j++) {
            // Count occurrence of characters of string
            curr_count[str.charAt(j)]++;

            // If any distinct character matched,
            // then increment count
            if (curr_count[str.charAt(j)] == 1)
                count++;

            // if all the characters are matched
            if (count == dist_count) {
                // Try to minimize the window i.e., check if
                // any character is occurring more no. of times
                // than its occurrence in pattern, if yes
                // then remove it from starting and also remove
                // the useless characters.
                while (curr_count[str.charAt(start)] > 1) {
                    if (curr_count[str.charAt(start)] > 1)
                        curr_count[str.charAt(start)]--;
                    start++;
                }

                // Update window size
                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
        // Return substring starting from start_index
        // and length min_len
        return str.substring(start_index, start_index + min_len);
    }
    public static void main(String[] args) {
        String s="GEEKSGEEKSFOR";
//        window(s);
        String str=Duplicates(s);
        System.out.println(str);
        System.out.println(str.length());
    }
}
class Solution {

    public static long getSum(long a[], long n)
    {
        // Your code goes here
        long mn=Arrays.stream(a).sum();
        return mn;
    }

    public static void main(String[] args) {
        long a[]={2,3,4,5,6,88};
        System.out.println(getSum(a,a.length));
    }

}
class Solution1 {
    public List<List<String>> Anagrams(String[] string_list) {

        // Your Code here
        List<List<String>> ls=new ArrayList<>();
        ArrayList <String> ls1=new ArrayList<>();
        for(int i=0;i<string_list.length;i++){
            for(int j=i+1;j<string_list.length;j++){
                boolean mn=isAnagram(string_list[i],string_list[j]);
                if(mn) {
                    ls1.add(string_list[i]);
                    ls1.add(string_list[j]);
                }
            }
        }
        ls.add(ls1);

        return ls;


    }
    public static boolean isAnagram(String str,String str1){
        ArrayList<Integer> al=new ArrayList<>();
        boolean ana=false;
        boolean check[]=new boolean[str.length()];
        if(str.length()==str1.length()){
            for(int i=0;i<str.length();i++){
                char a=str.charAt(i);
                for(int j=0;j<str1.length();j++){
                    if(str1.charAt(j)==a && check[j]){
                        ana=true;
                        check[i]=true;
                        break;
                    }
                }
                if(!ana){
                    break;
                }
            }
        }
        if(ana){
            return true;
        }
        else{
            return false;
        }

    }
}


class TestClass {
    public static boolean love(String s,String s1){
        boolean c=false;
        HashSet<Character> hs=new HashSet<>();
        for(char i: s1.toCharArray()){
            hs.add(i);
        }
        for(int i=0;i<s.length();i++){
            char str=s.charAt(i);
            c=false;
            if(hs.contains(str)){
                c=true;
            }
            else{
                break;
            }
        }
        return c;
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int k = 0; k < t; k++) {
            //   sc.nex();
            String s = sc.next();
            String s1 = sc.next();
//            boolean c = false;
//            for (int i = 0; i < s.length(); i++) {
//                char ch = s.charAt(i);
//                c = false;
//                for (int j = 0; j < s1.length(); j++) {
//
//                    if ( ch == s1.charAt(j)) {
//                        c = true;
//                    }
//                }
//                if(c==false) break;
//            }
            boolean c=love(s,s1);
            if (c) {
                System.out.println("Love you too");
            } else {
                System.out.println("We are only friends");
            }
        }
    }
}
class mnc{
    static void sum(int a,int b,int c){
       int rem=0,count=0,thousand=0,hundred=0,tens=0,once=0;
        while(a!=0){
            int n=a%10;
            rem=n;
            count++;
            System.out.println(rem);
            if(count==1){

                once=rem;
            }
            if(count==2){
                tens=rem;
            }
            if(count==3) {
                hundred= rem;
            }
            if(count==4){
                thousand=rem;
            }
            a/=10;
        }
        int re1=0,count1=0;
        int hundred1=0,thousand1=0,tens1=0,once1=0;
        while(b!=0){
            int n=b%10;
            re1=n;
            count1++;
            if(count1==1){
                once1=re1;
            }
            if(count1==2){
                tens1=re1;
            }
            if(count1==3){
                hundred1=re1;
            }
            if(count==4){
                thousand1=re1;
            }
            b/=10;
        }
        int rem2=0,count2=0,tens2=0,hundred2=0,thousand2=0,once2=0;;
        while(c!=0){
            int n=c%10;
            rem2=n;
            count2++;
            if(count2==1){
                once2=rem2;
            }
            if(count2==2){
                tens=rem2;
            }
            if(count1==3){
                hundred2=rem2;
            }
            if(count==4){
                thousand2=rem2;
            }
            c/=10;
        }
        int th=Math.max(Math.max(thousand,thousand1),thousand2);
        int hun=Math.max(Math.max(hundred,hundred1),hundred2);
        int ten=Math.max(Math.max(tens,tens1),tens2);
        int on=Math.max(Math.max(once,once1),once2);
        String s=String.valueOf(th)+String.valueOf(hun)+String.valueOf(ten)+String.valueOf(on);
        System.out.println(s);
    }
    public static void main(String[] args) {
        int a=3521;
        int b=2452;
        int c=1352;
        sum(a,b,c);
    }
}
class no_of_occurence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int count=0;
        for(int i=0;i<=n;i++){

            int a=i;
            if(a>0)
            while(a!=0){
                int m=a%10;
                int rem=m;
                if(rem==2){
                    count++;
                }
                a/=10;
            }
        }
        System.out.println(count);
    }
}

 class Solution23{
    static int CountPS(char str[], int n,int d)
    {

        int dp[][] = new int[n][n];

        boolean P[][] = new boolean[n][n];


        for (int i = 0; i < n; i++)
            P[i][i] = true;


        for (int i = 0; i < n - 1; i++) {
            if (str[i] == str[i + 1]) {
                P[i][i + 1] = true;
                dp[i][i + 1] = 1;
            }
        }

        for (int gap = 2; gap < n; gap++) {

            for (int i = 0; i < n - gap; i++) {

                int j = gap + i;


                if (str[i] == str[j] && P[i + 1][j - 1])
                    P[i][j] = true;


                if (P[i][j] == true)
                    dp[i][j] = dp[i][j - 1] + dp[i + 1][j]
                            + 1 - dp[i + 1][j - 1];
                else
                    dp[i][j] = dp[i][j - 1] + dp[i + 1][j]
                            - dp[i + 1][j - 1];
            }
        }

        return dp[0][n - 1];
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int d=sc.nextInt();
        int ans=CountPS(s.toCharArray(),s.length(),d);
        System.out.println(ans);
    }
}

class Solution68786 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int l1=sc.nextInt();
            int l2=sc.nextInt();
            int b[]=new int[2];
            ArrayList<Integer> ls=new ArrayList<>();
            // int k=0;
            b[0]=l1;
            b[1]=l2;
            ls.add(l1);
            ls.add(l2);
            int l3=l1+l2;
            ls.add(l3);
            int temp=l3;

            for(int j=0;j<b.length;j++){
                temp+=b[j];
                if(temp<=n){
                    ls.add(temp);
                }
            }
            int count=ls.size();
            int last_value=ls.get(ls.size()-1);
            System.out.println(count+" "+ last_value);
        }
    }
}

class Solution5321 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String s=sc.nextLine();
        sc.nextLine();
        int k=sc.nextInt();
        for(int j=0;j<t;j++){
            int count=0;
            int plliper=0;
            char c[]=s.toCharArray();
            for(int i=0;i<c.length;i++){
                if(c[i]=='T'){
                    count++;
                    c[i]='H';
                    if(count==k){
                        plliper++;
                    }
                    if(plliper==k){
                        count=0;
                        break;
                    }
                    System.out.println(plliper);

                }
                System.out.println(plliper);
            }
            System.out.println(plliper);
        }


    }
}