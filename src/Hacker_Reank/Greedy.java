package Hacker_Reank;

import java.util.*;
import java.util.stream.Stream;

public class Greedy {
}

class min_calories{
    public static long marcsCakewalk(List<Integer> calorie) {
        // Write your code here

        long minDist=0;

        Collections.sort(calorie,Collections.reverseOrder());

        System.out.println(calorie);

        for(int i=0;i<calorie.size();i++){

            minDist=(long)minDist+(long)(Math.pow(2,i)*calorie.get(i));

        }


        return (long)minDist;

    }

    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            ls.add(sc.nextInt());
        }
       long s= marcsCakewalk(ls);
        System.out.println(s);
    }

}
class grid {
    public static void gr(List<String> ls) {

        Collections.sort(ls);
        boolean f = false;
        for (int i = 0; i < ls.size() - 1; i++) {
            f = false;
            for (int j = 0; j < ls.get(0).length(); j++) {
                if (ls.get(i).charAt(j) <= ls.get(i + 1).charAt(j)) {
                    f = true;
                } else {
                    f = false;
                    break;
                }
            }
            if (!f) {
                break;
            }
        }
        if (f) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

//        sc.next();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                ls.add(sc.next());
            }
            gr(ls);
        }


    }
}
class mk{
    public static void main(String[] args) {
//        HashSet<String> hm=new HashSet<>();
//        List<List<String>> hm1=new ArrayList<>();
//        List<String> hm=new ArrayList<>();
//        hm.add("dfs");
//        hm.add("scx");
//        hm.add("bv");
//
//        hm1.add(hm);
////        hm.clear();
//        hm.add("fhg");
//        hm.add("ghj");
//        hm1.add(hm);
//        System.out.println(hm1);
        HashSet hm = new HashSet();
        hm.add(34);
        hm.add(55);
        hm.add(66);
//        ls.retainAll(hm);
//        System.out.println(ls);
//        HashMap
        HashMap<String, Integer> hs = new HashMap<>();
//        Collections.sort(hs,Collections.reverseOrder());

        Object arr[] = hs.values().toArray();
//        Arrays.copyOfRange(arr,0,arr.length);
        Object[] a = Arrays.copyOfRange(arr, 0, arr.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    Collections.frequency(hm,4);

    }}
//class Node{
//    int data;
//    Node head;
//}
//class balance_luck{
//    public static void luck(List<List<Integer>> ls, int k){
//
//        }
//    }
//}
