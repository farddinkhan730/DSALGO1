import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.IntStream;

public class Array_opperations {
    static int Insertion(int a[],int start,int n,int key){
        int end=n;
        if(end<=start){
            return -1;
        }
        int mid=end-(end-start)/2;
        if(a[mid]<key){
            return Insertion(a,mid+1,n,key);
        }
        else if(a[mid]>key){
            return Insertion(a,0,mid-1,key);
        }
        else{
            return mid;
        }
    }

    public static void main(String[] args) {
        int a[]={45,1,2,87,532,8,74,65};
        int n=a.length;
        Arrays.sort(a);
        int key=74;
        int ans=Insertion(a,0,n,key);
        if(ans==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println(ans);
        }
    }
}
class Insert{
    static int ins(int a[],int n,int key){
        int i;
        for (i = n-1; (i>=0 && a[i]>key) ; i--) {
            a[i+1]=a[i];
        }
        a[i+1]=key;
        return n+1;
    }

    public static void main(String[] args) {
        int a[]=new int[20];
        a[0]=0;
        a[1]=1;
        a[2]=2;
        a[3]=3;
        a[4]=54;
        a[5]=56;
        a[6]=58;
        a[7]=59;
        int n=8;
        int key=55;
        int ans=ins(a,n,key);
        for (int i = 0; i < ans; i++) {
            System.out.println(a[i]);
        }
    }
}
class Main {
    // binary search
    static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }

    /* Function to delete an element */
    static int deleteElement(int arr[], int n, int key)
    {
        // Find position of element to be deleted
        int pos = binarySearch(arr, 0, n - 1, key);

        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }

        // Deleting element
        int i;
        for (i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];

        return n - 1;
    }

    /* Driver Code */
    public static void main(String[] args)
    {

        int i;
        int arr[] = { 10, 20, 30, 40, 50 };

        int n = arr.length;
        int key = 30;

        System.out.print("Array before deletion:\n");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        n = deleteElement(arr, n, key);

        System.out.print("\n\nArray after deletion:\n");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
class GFG456 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> v1 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                v1.add(sc.nextInt());
            }
            int m = sc.nextInt();
            ArrayList<Integer> v2 = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                v2.add(sc.nextInt());
            }
            ArrayList<Integer> ans = common_element(v1, v2);
            System.out.println();
            for (int i : ans)
                System.out.print(i + " ");

            System.out.println();
        }
    }
    public static ArrayList<Integer> common_element(ArrayList<Integer> v1, ArrayList<Integer> v2) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.sort(v1);
        Collections.sort(v2);
        int i = 0, j = 0;
        while (i < v1.size() && j < v2.size()) {
            if (v1.get(i) < v2.get(j)) i++;
            else if (v1.get(i) > v2.get(j)) j++;
            else if(v1.get(i)==v2.get(j)){
                ans.add(v1.get(i));
                i++;
                j++;
            }
        }
        return ans;
    }
}

class find_an_element_in_sorted_array_of_infinite_size{
    static int  binarysearch(int a[],int l,int n,int key){
        int s=n;
        if(l>=s) return n;
        int mid=l+(s-l)/2;
        if(a[mid]==key) return mid;
        else if(a[mid]>key) return binarysearch(a,0,mid-1,key);
        else return binarysearch(a,mid+1,n,key);
    }
    static int find_pos(int a[],int key){
        int l=0;int h=1;
        int val=a[0];
            while (a[h]<key){
                l=h;
                h=2*h;
//                val=a[h];
            }
            return binarysearch(a,0,h,key);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int ans = find_pos(arr,140);

        if (ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);
}
}
//method 1
class find_repetative_element_in_array{
    public static void main(String[] args) {
        int a[]={1,2,3,5,1};
        int n=a.length;
        System.out.println(repetative(a,n));
    }
    static int repetative(int a[],int n){
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=a[i];
        }
        return sum-(((n-1)*n)/2);
    }
}
// method 2
class find_repitative{
    static int repetative(int a[],int n){
        HashSet<Integer> h=new HashSet<>();
        for (int i = 0; i <n ; i++) {
            if (h.contains(a[i])) {
                return a[i];
            }
            h.add(a[i]);
        }
        return 0;
    }
    public static void main(String[] args) {

        int a[]={9, 8, 2, 6, 1, 8, 5, 3, 4, 7 ,25};
        System.out.println(repetative(a,a.length));
    }
}
//method 3
// Java program to find the only repeating
// element in an array where elements are
// from 1 to n-1.
class GFG741
{

    static int findRepeating(int arr[], int n)
    {

        // res is going to store value of
        // 1 ^ 2 ^ 3 .. ^ (n-1) ^ arr[0] ^
        // arr[1] ^ .... arr[n-1]
        int res = 0;
        for (int i = 0; i < n - 1; i++)
            res = res ^ (i + 1) ^ arr[i];
        res = res ^ arr[n - 1];


        return res;
    }
    public static void main(String[] args)
    {
        int arr[] = { 9, 8, 2, 6, 1, 8, 5, 3, 4, 7 };
        int n = arr.length;
        System.out.println(findRepeating(arr, n));
    }
}
//method 4
// Java program to find the only
// repeating element in an array
// where elements are from 1 to n-1.
class find_the_only_repeating_element_in_an_array
{
    // Function to find repeted element
    static int findRepeating(int arr[], int n)
    {
        int missingElement = 0;
        for (int i = 0; i < n; i++){
            int element = arr[Math.abs(arr[i])];
            System.out.println(element+" e");
            if(element < 0){
                missingElement = arr[i];
                break;
            }
            arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
        }
        return Math.abs(missingElement);
    }
    public static void main(String[] args)
    {
        int arr[] = { 5, 4, 3, 9, 8, 9, 1, 6, 2, 5};
        int n = arr.length;
        System.out.println(findRepeating(arr, n));
    }
}
// Java program to find the array
// element that appears only once
class find_the_array_element_that_appears_only_once
{
    // Return the maximum Sum of difference
    // between consecutive elements.
    static int findSingle(int ar[], int ar_size)
    {
        // Do XOR of all elements and return
        int res = ar[0];
        for (int i = 1; i < ar_size; i++)
            res = res ^ ar[i];

        return res;
    }
    public static void main (String[] args)
    {
        int ar[] = {2, 3, 5, 4, 5, 3, 4};
        int n = ar.length;
        System.out.println("Element occurring once is " +
                findSingle(ar, n) + " ");
    }
}
//method 2
class find_single_element_in_array{
    static int single_element(int a[],int n){
        HashMap<Integer,Integer> h=new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (h.containsKey(a[i])){
                h.put(a[i],h.get(a[i])+1);
            }
            else
            h.put(a[i],1);
        }
        for (int i = 0; i < a.length; i++) {
            if (h.get(a[i]) == 1) {
                int m = a[i];
                return m;
            }
        }

            return 0;
    }

    public static void main(String[] args) {
        int a[]={1,2,45,2,1,2};
        int n=a.length;
        System.out.println(single_element(a,n));
    }
}
// method 1
//Maximum Subarray Sum Excluding Certain Elements
class arrya_sub{
    static boolean isPresent(int B[], int m, int x)
    {
        for (int i = 0; i < m; i++)
            if (B[i] == x)
                return true;

        return false;
    }
    static int findMaxSubarraySumUtil(int A[], int B[],
                                      int n, int m)
    {

        // set max_so_far to INT_MIN
        int max_so_far = -2147483648, curr_max = 0;

        for (int i = 0; i < n; i++)
        {

            // if the element is present in B,
            // set current max to 0 and move to
            // the next element
            if (isPresent(B, m, A[i]))
            {
                curr_max = 0;
                continue;
            }

            // Proceed as in Kadane's Algorithm
            curr_max = Math.max(A[i], curr_max + A[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }
    static void findMaxSubarraySum(int A[], int B[], int n,
                                   int m)
    {
        int maxSubarraySum
                = findMaxSubarraySumUtil(A, B, n, m);

        if (maxSubarraySum == -2147483648)
        {
            System.out.println("Maximum Subarray Sum"
                    + " "
                    + "can't be found");
        }
        else {
            System.out.println("The Maximum Subarray Sum = "
                    + maxSubarraySum);
        }
    }

    public static void main(String[] args)
    {

        int A[] = { 3, 4, 5, -4, 6 };
        int B[] = { 1, 8, 5 };

        int n = A.length;
        int m = B.length;
        findMaxSubarraySum(A, B, n, m);
    }
}
//method 2
class array_sub_sum{
    static int findMaxSubarraySumUtil(int A[], int B[],
                                      int n, int m)
    {
        int max_so_far = Integer.MIN_VALUE, curr_max = 0;

        for (int i = 0; i < n; i++)
        {
            // if the element is present in B,
            // set current max to 0 and move to
            // the next element
            if (Arrays.binarySearch(B, A[i]) >= 0)
            {
                curr_max = 0;
                continue;
            }

            // Proceed as in Kadane's Algorithm
            curr_max = Math.max(A[i], curr_max + A[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }
    static void findMaxSubarraySum(int A[], int B[], int n,
                                   int m)
    {
        Arrays.sort(B);

        int maxSubarraySum
                = findMaxSubarraySumUtil(A, B, n, m);

        // This case will occour when all elements
        // of A are present in B, thus no subarray
        // can be formed
        if (maxSubarraySum == Integer.MIN_VALUE)
        {
            System.out.println(
                    "Maximum subarray sum cant be found");
        }
        else
        {
            System.out.println("The Maximum subarray sum = "
                    + maxSubarraySum);
        }
    }
    public static void main(String[] args)
    {
        int A[] = { 3, 4, 5, -4, 6 };
        int B[] = { 1, 8, 5 };

        int n = A.length;
        int m = B.length;

        // Function call
        findMaxSubarraySum(A, B, n, m);
    }
}
//Maximum equlibrium sum in an array
//method 1
class max_equlibriub_sum{
    static int sum(int a[],int n){
        int prifixsum=0;
                int surfixsum=0;
                int sum= IntStream.of(a).sum();
                int res= Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            prifixsum+=a[i];
            if(prifixsum==sum){
                res=Math.max(res,prifixsum);
            }
            sum-=a[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = { -2, 5, 3, 1,
                2, 6, -4, 2 };
        int n = arr.length;
        System.out.print(sum(arr, n));

    }
}
class hp{
    static int majority(int a[],int n){
        HashMap<Integer,Integer> h=new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(h.containsKey(a[i])){
                int count=h.get(a[i])+1;
                h.put(a[i],count);
                if(count>n/2){
                    return a[i];
                }
            }
            h.put(a[i],1);
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            System.out.println(majority(arr, n));
        }
    }
}

class Sol
{
//    static Long maximum( long a, long b, long c){
//        return Math.max(Math.max(a,b),c);
//    }
//    static Long mini(long a, long b, long c){
//        return Math.min(Math.min(a,b),c);
//    }
static int maximum(int a, int b, int c)
{
    return Math.max(Math.max(a, b), c);
}

    // function to find minimum number
    static int minimum(int a, int b, int c)
    {
        return Math.min(Math.min(a, b), c);
    }
    public ArrayList<Long> smallestDifferenceTriplet(long a[],long b[],long c[],long n)
    {
        
        int N=(int)n;
        int arr1[]=new int[N];
        int arr2[]=new int[N];
        int arr3[]=new int[N];
        for(int i=0;i<n;i++){
            arr1[i]=(int)a[i];
            arr2[i]=(int)b[i];
            arr3[i]=(int)c[i];
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        ArrayList<Long> al=new ArrayList<Long>();

        // To store resultant three numbers
        int res_min=0, res_m=0, res_mid=0;

        // pointers to arr1, arr2, arr3
        // respectively
        int i = 0, j = 0, k = 0;

        // Loop until one array reaches to its end
        // Find the smallest difference.
        int diff = 2147483647;

        while (i < n && j < n && k < n)
        {
            int sum = arr1[i] + arr2[j] + arr3[k];

            // maximum number
            int max = maximum(arr1[i], arr2[j], arr3[k]);

            // Find minimum and increment its index.
            int min = minimum(arr1[i], arr2[j], arr3[k]);
            if (min == arr1[i])
                i++;
            else if (min == arr2[j])
                j++;
            else
                k++;

            // comparing new difference with the
            // previous one and updating accordingly
            if (diff > (max - min))
            {
                diff = max - min;
                res_m = max;
                res_mid = sum - (max + min);
                res_min = min;
            }
        }

        al.add((long)res_m);
        al.add((long)res_mid);
        al.add((long)res_min);

        return al;
//        Arrays.sort(a);
//        Arrays.sort(b);
//        Arrays.sort(c);
//        ArrayList<Long> al=new ArrayList<Long>();
//        long res_m=0l,res_min=0l,res_mid=0l;
//        int i=0;
//        int j=0;
//        int k=0;
//        long diff=2147483647l;
//        while(i<n && j<n && k<n){
//            long sum=a[i]+b[j]+c[k];
//            long max=maximum(a[i],b[j],c[k]);
//            long min=mini(a[i],b[j],c[k]);
//            if(min==a[i]) i++;
//            else if(min==b[j]) j++;
//            else    k++;
//
//
//            if(diff>(max-min)){
//                diff=max-min;
//                res_m=max;
//                res_mid=sum-(max+min);
//                res_min=min;
//            }
//
//        }
//        al.add(res_m);
//        al.add(res_mid);
//        al.add(res_min);
//
//        return al;
    }
}

class Array {

    // Driver code
    public static void main (String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int testcases = sc.nextInt();
        // looping through all testcases
        while(testcases-- > 0){
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
            }
            long b[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                b[i]=sc.nextLong();
            }
            long c[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                c[i]=sc.nextLong();
            }
            Sol ob=new Sol();
            ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            System.out.println(ans.get(0)+" "+ans.get(1)+" "+ans.get(2));
        }
    }
}
//class sortArray{
//    static int[] asort(int a[],int n,int x){
//        int ar[]=new int[n];
//        HashMap<Integer,Integer> hm=new HashMap<>();
//        ArrayList<Integer> al=new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            hm.put(i,Math.abs(x-a[i]));
//            al.add(Math.abs(x-a[i]));
//        }
//        System.out.println(hm);
//        Collections.sort(al);
//        System.out.println(al);
//        int k=0;
//        for (int i = 0; i < n-1; i++) {
//            for (int j = i+1; j < n; j++) {
//                if (al.get(i) ==hm.get(j)) {
//                    ar[k] = a[j];
//                    k++;
//                    System.out.println(a[j]+" aj "+a[k]);
//                }
//            }
//        }
//
//       return ar;
//    }
//    public static void main(String[] args) {
//        int a[]={10,5,3,9,2};
//        int x=7;
//        int b[]=asort(a,a.length,x);
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i]+" ");
//        }
//
//    }
//}
class sort_array_in_wave_form{
    static void wave(int a[],int n){
        Arrays.sort(a);
        for (int i = 0; i < n; i=i+2) {
            for (int j = i+1; j < n; j++) {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {20, 10, 8, 6, 4, 2};
        int n = arr.length;
        wave(arr, n);
    }
}
class sort_acc_to_frequency{
    public static void sort_frequency(int a[],int n){
        HashMap<Integer,Integer> hs=new HashMap<>();
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i]==a[j]){
                    count++;
                }
                hs.put(a[i],count);
            }
        }
        System.out.println(hs);
    }

    public static void main(String[] args) {
        int a[]={5,2,2,8,5,6,8,8};
        int n=a.length;
        sort_frequency(a,n);
    }
}
