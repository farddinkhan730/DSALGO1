package College_lab.Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Duplicate_in_array {

    public static void remove_duplicate(int a[],int n){
        ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i < n; i++) {

            if(hs.contains(a[i])){

                if(!al.contains(a[i]))
                    al.add(a[i]);

            }
            else {

                hs.add(a[i]);
            }

        }
        System.out.println(al);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];

        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        remove_duplicate(a,a.length);

    }
}
