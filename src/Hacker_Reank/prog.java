package Hacker_Reank;
import Sorting.Heap_Sort;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class prog {
}
class kth_smallest_element{
    public static void smallest(int a[],int n,int k) {

     Arrays.sort(a);
        System.out.println(a[k-1]);
    }
    public static void main(String[] args) {
        int n=6;
        int arr[]={7,10,4,3,20,15};
        int k=3;
        smallest(arr,n,k);
    }
}

class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> ls=new ArrayList<>();
        for (int i = 0; i <queries.size(); i++) {
            if(strings.contains(queries.get(i))){
                int freq=Collections.frequency(strings,queries.get(i));
                ls.add(freq);
            }
            else {
                ls.add(0);
            }
        }
        return ls;

    }

}

class Solution65 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int str=sc.nextInt();
        List<String> s=new ArrayList<>();
        List<String > s1=new ArrayList<>();
        for (int i = 0; i <str ; i++) {
            s.add(sc.next());
        }
        int quer=sc.nextInt();
        for (int i = 0; i < quer; i++) {
            s1.add(sc.next());
        }
        List<Integer> ls=Result.matchingStrings(s,s1);
        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i));

        }
    }
}

class alise{
    public static void abd(int rank[],int player[],int a[],int k){
        int j=0,r=1;
        while(j<rank.length-1) {
            if(rank[j]==rank[j+1]){
                if(player[k]>=rank[j]){
                    a[k]=r++;
                    j=j+2;
                }
                else {
                    j=j+2;
                }
            }
            if(player[k]<rank[j]){
                a[k]=r++;
                j=j+1;
            }
            else if(player[k]==rank[j]) {
                a[k] = r++;
                j = j + 1;
            }
        }
    }
    public static void ranked(int rank[],int player[]){
//        int count=0;
//        for (int i = 0; i <rank.length-1 ; i++) {
//            if(rank[i]==rank[i+1]){
//                count++;
//            }
//        }
        Heap_Sort.sort(player,player.length);
        for (int i = 0; i <player.length ; i++){
            System.out.println(player[i]);
        }
            int a[]=new int[player.length];
        for (int i = 0; i < player.length; i++) {
            abd(rank,player,a,i);
        }

        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int a[]={100,100,50,40,40,20,10};
        int b[]={5,25,50,120};
        ranked(a,b);
    }
    public static void find_ranke(int a[],int b[]){
        ArrayList<Integer> ls=new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if(ls.contains(a[i])){
                continue;
            }
            else {
                ls.add(a[i]);
            }
        }
        Object a1[]=ls.toArray();
        for (int i = 0; i <a1.length ; i++) {
            System.out.println(a1[i]);
        }
        int r=a.length;
        int rankes[]=new int[b.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = a1.length-1; j >=0; j--) {
                if(b[i]<(int)a1[j]){
                    rankes[i]=r--;
                    break;
                }
                else if(b[i]==(int)a1[j]){
                    rankes[i]=r--;
                    break;
                }
                else{
                    rankes[i]=1;
                    break;
                }
            }
        }
        for (int i = 0; i <rankes.length ; i++) {
            System.out.println(rankes[i]);
        }

    }
}
class arralise{
    public static List<Integer>  climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        int n = ranked.size();
        int m = player.size();

        int res[] = new int[m];
        int[] rank = new int[n];

        ranked.add( 1);

        for (int i = 1; i < n; i++) {
            if (ranked.get(i) == ranked.get(i - 1)) {
                rank[i] = rank[i - 1];
            } else {
                rank[i] = rank[i - 1] + 1;
            }
        }

        for (int i = 0; i < m; i++) {
            int aliceScore = player.get(i);
            if (aliceScore > ranked.get(0)) {
                res[i] = 1;
            } else if (aliceScore < ranked.get(n-1)) {
                res[i] = rank[n - 1] + 1;
            } else {
                Object mnn[]=ranked.toArray();
                int index = binarySearch(mnn, aliceScore);
                res[i] = rank[index];

            }
        }
        List<Integer> lsm=new ArrayList<>();
        for (int i = 0; i < res.length; i++) {
            lsm.add(res[i]);
        }
        return lsm;

//        ArrayList<Integer> ls=new ArrayList<>();
//        int mx=Integer.MIN_VALUE;
//        int min=Integer.MAX_VALUE;
//        for (int i = 0; i < ranked.size(); i++) {
//            if(ls.contains(ranked.get(i))){
//                continue;
//            }
//            else {
//                ls.add(ranked.get(i));
//                mx=Math.max(mx,ranked.get(i));
//                min=Math.min(min,ranked.get(i));
//            }
//        }
//        int rk=ls.size();
//        ArrayList<Integer> result=new ArrayList<>();
//        for (int i = 0; i < player.size(); i++) {
//            if(player.get(i)<min){
//                result.add(++rk);
//            }
//            if(player.get(i)>mx){
//
//                result.add(1);
//            }
//            else if(ls.contains(player.get(i))){
//                for (int j = 0; j < ls.size(); j++) {
//                    if(ls.get(j)==player.get(i)){
//                        result.add(j+1);
//
//                        break;
//                    }
//                }
//            }
//            else{
//                for (int j = 0; j < ls.size()-1; j++) {
//                    if(player.get(i)<ls.get(j) &&  player.get(i)>ls.get(j+1)){
//                        result.add(j+1+1);
//                    }
//                }
//            }
//
//        }
////        for (int i = 0; i < ranked.size(); i++) {
////            System.out.println(i + " = "+ ranked.get(i));
////        }
////        System.out.println();
//        return result;
    }


    private static int binarySearch(Object[] a, int key) {

        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if ((int) a[mid] == key) {
                return mid;
            } else if ((int)a[mid] < key && key < (int)a[mid - 1]) {
                return mid;
            } else if ((int)a[mid] > key && key >=(int) a[mid + 1]) {
                return mid + 1;
            } else if ((int)a[mid] < key) {
                hi = mid - 1;
            } else if ((int)a[mid] > key) {
                lo = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            a.add(sc.nextInt());
        }
        int m=sc.nextInt();
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }
        List<Integer> l=climbingLeaderboard(a,b);
        System.out.println(l);
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        printScores(n, scores, alice);
    }

    public static void printScores(int n, int[] scores, int[] alice){
        ArrayList<Integer> places = new ArrayList<Integer>();
        int place = 1;
        places.add(scores[0]);
        for(int i = 1; i < scores.length; i++){
            int currPlace = place-1;
            int currScore = scores[i];
            if(currScore != places.get(currPlace)){
                place++;
                places.add(currScore);
            }
        }

        int currPlace = places.size() + 1;
        for(int i = 0; i < alice.length; i++){
            currPlace = getPlace(currPlace, alice[i], places);
            System.out.println(currPlace);
        }

    }

    public static int getPlace(int currPlace, int currScore, ArrayList<Integer> places){
        for(int i = currPlace - 1; i > 0; i--){
            int index = i - 1;
            if(currScore < places.get(index)){
                return i + 1;
            }
        }
        return 1;
    }
}

class ClimbingTheLeaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int n = scores.length;
        int m = alice.length;

        int res[] = new int[m];
        int[] rank = new int[n];

        rank[0] = 1;

        for (int i = 1; i < n; i++) {
            if (scores[i] == scores[i - 1]) {
                rank[i] = rank[i - 1];
            } else {
                rank[i] = rank[i - 1] + 1;
            }
        }

        for (int i = 0; i < m; i++) {
            int aliceScore = alice[i];
            if (aliceScore > scores[0]) {
                res[i] = 1;
            } else if (aliceScore < scores[n - 1]) {
                res[i] = rank[n - 1] + 1;
            } else {
                int index = binarySearch(scores, aliceScore);
                res[i] = rank[index];
            }
        }
        return res;
    }
    private static int binarySearch(int[] a, int key) {

        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key && key < a[mid - 1]) {
                return mid;
            } else if (a[mid] > key && key >= a[mid + 1]) {
                return mid + 1;
            } else if (a[mid] < key) {
                hi = mid - 1;
            } else if (a[mid] > key) {
                lo = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for (int i = 0; i < m; i++) {
            alice[i] = in.nextInt();
        }
        int result[] = climbingLeaderboard(scores, alice);
        System.out.println(Arrays.toString(result));
    }

}