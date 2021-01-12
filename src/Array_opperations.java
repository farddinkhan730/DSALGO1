import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

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