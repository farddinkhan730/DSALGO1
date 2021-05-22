package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//normal Non greedy
public class Activity_selection_problem {
    public static void select_act(int s[],int e[],int n){
        int j=0;
        System.out.println(e[j]);
        for (int i = 1; i < n; i++) {
            if(s[i]>=e[j]) {
                System.out.println(s[i] + " " + e[j]);
                j = i;
            }
        }

    }
}

// Greedy Approch
//1) Sort the activities according to their finishing time
//2) Select the first activity from the sorted array and print it.
//3) Do the following for the remaining activities in the sorted array.
//…….a) If the start time of this activity is greater than or equal to the finish time of the previously selected activity then select this activity and print it.

class sort{
    String Activity;
    int start;
    int end;
    sort(String Activity,int start,int end){
        this.Activity=Activity;
        this.start=start;
        this.end=end;
    }
}
class Activity_selction_Greedy_Approch{

    public static void select(String str[],int s[],int e[],int n){
        sort []a=new sort[n];
        for (int i = 0; i < n; i++) {
             a[i]=new sort(str[i],s[i],e[i]);
        }
        Arrays.sort(a, new Comparator<sort>() {
            @Override
            public int compare(sort o1, sort o2) {
//                System.out.println(o1.start +" " + o1.end +" o2 "+ o2.start+" " + o2.end);
                return o1.end- o2.end;
            }
        });

        int j=0;
        System.out.println(a[j].Activity);
        for (int i = 1; i < n; i++) {
            if(a[i].start>=a[j].end){
                System.out.println(a[i].Activity);
                j=i;
            }
        }
    }

    public static void main(String[] args) {
        String str[]= {"A1","A2","A3","A4","A5","A6"};
        int s[] =  {1, 3, 0, 5, 8, 5};
        int f[] =  {2, 4, 6, 7, 9,9};
        int n = s.length;

        select(str,s, f, n);
    }
}

 class Pair {

    int first;
    int second;

    Pair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
}
class Activity_select_using_priority_Queue{

    static void SelectActivities(int s[], int f[])
    {

        // Vector to store results.
        ArrayList<Pair> ans = new ArrayList<>();

        // Minimum Priority Queue to sort activities in
        // ascending order of finishing time (f[i]).
        PriorityQueue<Pair> p = new PriorityQueue<>(
                (p1, p2) -> p1.first - p2.first);

        for (int i = 0; i < s.length; i++) {
            // Pushing elements in priority queue where the
            // key is f[i]
            p.add(new Pair(f[i], s[i]));
        }

        Pair it = p.poll();
        int start = it.second;
        int end = it.first;
        ans.add(new Pair(start, end));

        while (!p.isEmpty()) {
            Pair itr = p.poll();
            if (itr.second >= end) {
                start = itr.second;
                end = itr.first;
                ans.add(new Pair(start, end));
            }
        }
        System.out.println(
                "Following Activities should be selected. \n");

        for (Pair itr : ans) {
            System.out.println(
                    "Activity started at: " + itr.first
                            + " and ends at  " + itr.second);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {

        int s[] = { 1, 3, 0, 5, 8, 5 };
        int f[] = { 2, 4, 6, 7, 9, 9 };

        // Function call
        SelectActivities(s, f);
    }
}
