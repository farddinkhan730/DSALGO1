import java.sql.SQLOutput;
import java.util.*;

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