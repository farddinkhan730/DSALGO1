import java.util.Scanner;

public class delete_alpg_to_make_anag {
    public static void delete(String s,String s1){
        int a[]=new int[26];
        int b[]=new int[26];
        for (int i = 0; i <s.length() ; i++) {
            a[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i <s1.length() ; i++) {
            b[s1.charAt(i) - 'a']++;
        }
//        for (int i = 0; i <26; i++) {
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();
//        for (int i = 0; i <26; i++) {
//            System.out.print(b[i]+" ");
//        }
        int res=0;
        for (int i = 0; i < 26; i++) {
            res+=Math.abs(a[i]-b[i]);
        }
        System.out.println(res);
//
    }

    public static void main(String[] args) {
        String s="bcadeh";
        String s1="hea";
        delete(s,s1);
    }

}
class find_missing_array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x,res=0;
            for (int i = 0; i < n; i++) {
                x=sc.nextInt();
                res=res^x;
                System.out.println("res "+ res);
                res=res^i;
                System.out.println("res i "+ res);
            }
            System.out.println(res^n);
        }
    }
}