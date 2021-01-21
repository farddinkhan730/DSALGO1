import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Two_array_of_String_find_common_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String arr1[]=new String[n];
        String arr2[]=new String[m];
        arr1= new String[]{"Article", "for", "Geeks", "for", "Geeks"};
        arr2=new String[]{"Geeks","for","Geeks"};
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        for (String i : arr1) {
            set1.add(i);
        }
        for (String i : arr2) {
            set2.add(i);
        }
        set1.retainAll(set2);
        System.out.println("Common elements- " + set1);
    }
}

