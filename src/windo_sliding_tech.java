import jdk.jfr.StackTrace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import java.util.stream.Stream;

public class windo_sliding_tech {
    public static void max_sum(int arr[],int n){
        int sum=0;
        int curr_win=0;
        try {
            for (int i = 0; i < arr.length; i++) {
                sum=0;
                for (int j = i; j < n + i; j++) {
                    sum += arr[j];
                }
                if (sum > curr_win) {
                    curr_win = sum;
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        System.out.println(curr_win);
    }
    public static void main(String[] args) {
        int arr[]={1, 4, 2, 10, 23, 3, 1, 0, 20};
        int n=4;
        max_sum(arr,n);
    }
}
class prifix_sum{
    public static void sum(int arr[],int ps[]){
        ps[0]=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            ps[i]=ps[i-1]+arr[i];
        }
        for (int i = 0; i < ps.length; i++) {
            System.out.print(ps[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={10,5,20,15,25};
        int pre_sum[]=new int[arr.length];
        sum(arr,pre_sum);
    }
}
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //taking testcases
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            String str=br.readLine();
            String[] starr=str.split(" ");

            //input n and d
            int n=Integer.parseInt(starr[0]);
            int d= Integer.parseInt(starr[1]);

            int[] arr=new int[n];
            String str1=br.readLine();
            String[] starr1=str1.split(" ");

            //inserting elements in the array
            for(int j=0;j<n;j++)
            {
                arr[j]= Integer.parseInt(starr1[j]);
            }

            //calling rotateArr() function
            new Solution().rotateArr(arr, d, n);
            StringBuffer sb=new StringBuffer();

            //printing the elements of the array
            for(int t1=0;t1<n;t1++)
                sb.append(arr[t1]+" ");
            System.out.println(sb);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        for(int i=0;i<d;i++){
            leftrotate(arr,n);
        }
    }
    static void leftrotate(int a[],int n){
        int j,temp;
        temp=a[0];
        for ( j = 0; j <n-1 ; j++) {
            a[j]=a[j+1];
        }
        a[j]=temp;
    }

}


class GFG5{

    // Function to find the minimum
    // of the maximum difference of the
    // adjacent elements after removing
    // K elements from the array
    static int minimumAdjacentDifference(int a[],
                                         int n, int k)
    {
        // Intialising the
        // minimum difference
        int minDiff = Integer.MAX_VALUE;

        // Traversing over subsets
        // in iterative manner
        for (int i = 0; i < (1 << n); i++) {

            // Number of elements to
            // be taken in the subset
            // ON bits of i represent
            // elements not to be removed
            int cnt = Integer.bitCount(i);

            // If the removed
            // set is of size k
            if (cnt == n - k) {

                // Creating the new array
                // after removing elements
                Vector<Integer> temp = new Vector<Integer>();
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) != 0)
                        temp.add(a[j]);
                }

                // Maximum difference of adjacent
                // elements of remaining array
                int maxDiff = Integer.MIN_VALUE;
                for (int j = 0; j < temp.size() - 1; j++) {
                    maxDiff = Math.max(maxDiff,
                            temp.get(j + 1) - temp.get(j));
                }
                minDiff = Math.min(minDiff, maxDiff);
            }
        }
        return minDiff;
    }

    // Driver Code
    public static void main(String args[])
    {
        int n = 6;
        int k = 5;

        int a[] = {66, 31, 99, 76 ,38 ,76 };

        System.out.println(minimumAdjacentDifference(a, n, k));
    }
}
// function to remove duplicate element
class Removeduplicate_element {
    int remove_duplicate(int arr[],int n){

        if (n==0 || n==1)
            return n;

        int temp[]=new int[n];

        int j = 0;
        for (int i=0; i<n-1; i++)

            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];

        temp[j++] = arr[n-1];

        for (int i=0; i<j; i++)
            arr[i] = temp[i];

        return j;

    }
}
class reverse_arr_in_group{
    public static void main(String[] args) {
        int n=10;
        int k=5;
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        System.out.println(arr);
        solutionn obj=new solutionn();
        obj.reverseInGroup(arr,n,k);
        StringBuffer str=new StringBuffer();
        for (int i = 0; i <n ; i++) {
            str.append(arr.get(i)+" ");
        }
        System.out.println(str);
    }
}
class solutionn{
    public void reverseInGroup(ArrayList<Integer> a,int n,int k){

        reverse(a,n,k);
//        remain_reverse(a,k,n-1);

    }
    static void reverse(ArrayList<Integer> a,int n,int k){
        int n1=0;
        int start1=k;
        int end1=n;
        for(int i=start1;i<end1/2;i++){
            int temp=a.get(i);
            a.set(i,a.get(end1-n1));
            a.set(end1-n1,temp);
            n1++;
        }
        int start=0;
        int end=k-1;
         for (int i = start; i <end/2 ; i++) {
            int temp=a.get(i);
            a.set(i,a.get(end-i));
            a.set(end-i,temp);
        }

    }
//    static void remain_reverse(ArrayList<Integer> a,int start,int end){
//        int n=0;
//        for(int i=start;i<end/2;i++){
//            int temp=a.get(i);
//            a.set(i,a.get(end-n));
//            a.set(end-n,temp);
//            n++;
//        }
//    }
}
class Majority
{
    public int majorityWins(int arr[],int n,int x,int y)
    {
        // code here

        int countx=0;
        int county=0;
        int a=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                countx++;
            }
            else if(arr[i]==y){
                county++;
            }
        }
        if(countx>county) return countx;
        else if(countx<county) return county;
        else    a=Math.min(x,y);

        return a;
    }

}
// Java program to find equilibrium
// index of an array

class EquilibriumIndex {
    int equilibrium(int arr[], int n)
    {
        int sum = 0; // initialize sum of whole array
        int leftsum = 0; // initialize leftsum

        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i)
            sum += arr[i];

        for (int i = 0; i < n; ++i) {
            sum -= arr[i]; // sum is now right sum for index i

            if (leftsum == sum)
                return i;

            leftsum += arr[i];
        }

        /* If no equilibrium index found, then return 0 */
        return -1;
    }

    // Driver code
    public static void main(String[] args)
    {
        EquilibriumIndex equi = new EquilibriumIndex();
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        int arr_size = arr.length;
        System.out.println("First equilibrium index is " +
                equi.equilibrium(arr, arr_size));
    }
}
// Leader of an array
// Given an array A of positive integers. Your task is to find the leaders in the array.
// An element of array is leader if it is greater than or equal to all the elements to its right side.
// The rightmost element is always a leader.

class Leader{
    static ArrayList<Integer> leaders(int arr[], int size){
        // Your code here
        ArrayList<Integer> a=new ArrayList<>();
        int max_from_right =  arr[size-1];
        a.add(max_from_right);

        for (int i = size-2; i >= 0; i--)
        {
            if (max_from_right <= arr[i])
            {
                max_from_right = arr[i];
                a.add(max_from_right);
            }
        }


        return a;
    }
}

class SquareRoot
{
    long floorSqrt(long x)
    { if (x == 0 || x == 1)
        return x;


        int i = 1, result = 1;

        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;

    }
}
class Insertion_sort{
    static void sort(int arr[],int n){
        for (int i = 1; i <n ; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;

//        int i, key, j;
//        for (i = 1; i < n; i++)
//        {
//            key = arr[i];
//        j = i-1;
//
//       /* Move elements of arr[0..i-1], that are
//          greater than key, to one position ahead
//          of their current position */
//        while (j >= 0 && arr[j] > key)
//        {
//            arr[j+1] = arr[j];
//            j = j-1;
//        }
//        arr[j+1] = key;
    }
        for ( int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int []a={45,7,15,6};
        int n=a.length;
        sort(a,n);
    }
}

class Sorting
{
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    /* The main function that implements QuickSort()
       arr[] --> Array to be sorted,
       low  --> Starting index,
       high  --> Ending index */
    static void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {

            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = new QuickSort().partition(arr, low, high);
            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    // Driver program
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();


            quickSort(arr,0,n-1);
            printArray(arr);
            T--;
        }
    } }// } Driver Code Ends




class QuickSort
{
    static int partition(int arr[], int low, int high)
    {
        // your code here
        System.out.println(low+" "+high);
        int pivot=arr[high];
        System.out.println(pivot);
        int temp;
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }

}
class Min_swap{
    public int min(int arr[],int n){
        int ans=0;
        int temp[]=Arrays.copyOfRange(arr,0,n);
        Arrays.sort(temp);
        HashMap<Integer,Integer> h=new HashMap<>();
        for (int i = 0; i < n; i++) {
            h.put(temp[i],i);
        }
        for (int i = 0; i <n ; i++) {
            if(arr[i]!=temp[i]){
                int inti=arr[i];
                ans++;
                swap(arr,i,h.get(temp[i]));
                h.put(inti,h.get(temp[i]));
                h.put(temp[i],i);
            }
        }
        return ans;
    }
    public void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
//    public int indexof(int a[],int ele){
//        for (int i = 0; i <a.length ; i++) {
//            if(a[i]==ele){
//                return i;
//            }
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        int a[]={2,1,3,4,5};
        int n=a.length;
        System.out.println(new Min_swap().min(a,n));
    }
}

class GFGbh{
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t > 0){
            String A = sc.nextLine();
            String B = sc.nextLine();
            Solution45 ob = new Solution45();
            System.out.println(ob.repeatedStringMatch(A,B));
            t--;
        }
    }
}
class Solution45
{
    static int repeatedStringMatch(String a, String b)
    {
        // Code here
        String str = "";

        if(b.length() % a.length() != 0)
            return -1;

        int count = b.length() / a.length();

        for(int i = 0; i < count; i++)
        {
            str = str + a;
        }


        if(b.matches(a))
            return count;

        return -1;


    }
}
class union{
    public static void union(int a1[],int a2[]){
        HashSet<Integer> h=new HashSet<>();
        Arrays.sort(a1);
        Arrays.sort(a2);
        int i,j;
        for ( i = 0; i <a1.length ; i++) {
            h.add(a1[i]);
        }
        int k=0;
        for (j = 0; j < a2.length; j++) {
            h.add(a2[k]);
            k++;
        }
        ArrayList<Integer> a=new ArrayList<>();
        a.addAll(0,h);
        Collections.sort(a);
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int a1[]={1,2,4,3};
        union(a,a1);
    }
}
// find pairs in array whose sum is equal to the given sum
//method 1
class Find_pair_sum_equal_given_sum{
    public static boolean pair(int a[],int n,int s){
        int sum=0;
        int i=0,j=0;
        for (i = 0; i <a.length ; i++) {
            for ( j = 0; j <a.length ; j++) {
                if((a[i]+a[j] )==s){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={5,70,60,20,15,30,13,10};
        int n=a.length;
        int s=43;
        System.out.println(pair(a,n,s));
    }
}
//method 2
class pair_sum{
    public static boolean pair(int a[],int n,int s){
        Arrays.sort(a);
        int i=0,j=n-1;
        for (int k = 0; k <n ; k++) {
            if(i==j){
                if(a[i]+a[j]==s) break;
            }
            if((a[i]+a[j])<s){
                i++;
            }
            else if((a[i]+a[j])>s){
                j--;
            }
            else {
                return true;
            }
            // or
//            while(i<j){
////                if(i==j){
////                    if(a[i]+a[j]==s) break;
////                }
//                if((a[i]+a[j])<s){
//                    i++;
//                }
//                else if((a[i]+a[j])>s){
//                    j--;
//                }
//                else {
//                    return true;
//                }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={5,30,20,70,60,13,10,15};
        int n=a.length;
        int s=43;
        System.out.println(pair(a,n,s));
    }
}
//method 3 using hasing o(n)
class find_pair_by_hashing{
    public static boolean pair(int a[],int n,int s){
        HashSet<Integer> h=new HashSet<>();
        for (int i = 0; i <n ; i++) {
            h.add(a[i]);
        }
        for (int i = 0; i <n ; i++) {
            if (h.contains((s - a[i]))) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a[]={5,30,20,70,60,13,10,15};
        int n=a.length;
        int s=45;
        System.out.println(pair(a,n,s));
    }
}
//or
class PairSum {
    static void printpairs(int arr[], int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = sum - arr[i];

            // checking for condition
            if (s.contains(temp)) {
                System.out.println(
                        "Pair with given sum "
                                + sum + " is (" + arr[i]
                                + ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int n = 16;
        printpairs(A, n);
    }
}
// find duplicated in an array
//method 1 using hashing complexity o(n)
class to_find_duplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x : nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        int a[]={1,2,1,16,3,3};
        containsDuplicate(a);
    }
}
//method 2 complexity o(nlog n)
class duplicate{
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={1,2,1,16,3,3};
        containsDuplicate(a);
    }
}
//method 3  complexity o(n*n)
class duplicate_element{
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] == nums[i]) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={1,2,1,16,3,3};
        containsDuplicate(a);
    }
}
// Java program for reversal algorithm of array rotation

class LeftRotate {
    /* Function to left rotate arr[] of size n by d */
    static void leftRotate(int arr[], int d)
    {

        if (d == 0)
            return;

        int n = arr.length;
        // in case the rotating factor is
        // greater than array length
        d = d % n;
        System.out.println(d);
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    /*Function to reverse arr[] from index start to end*/
    static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /*UTILITY FUNCTIONS*/
    /* function to print an array */
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    /* Driver program to Menu.test above functions */
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int d = 2;

        leftRotate(arr, d); // Rotate array by d
        printArray(arr);
    }
}
/*This code is contributed by Devesh Agrawal*/
class GFGl {
    public static void main(String[] args)
    {

        int[][] arr = new int[4][5];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println(arr[0].length);
    }
}
