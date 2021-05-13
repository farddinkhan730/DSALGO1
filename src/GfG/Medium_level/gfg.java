package GfG.Medium_level;

public class gfg {
}
class Solution
{

    // arr: input array
    // n: size of array
    //Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    //with O(1) extra space.
    //Input:                                     Input:
    //N = 2                                          //N = 5
    //arr[] = {1,0}                                             //arr[] = {4,0,2,1,3}
    //Output: 0 1                                            //Output: 3 4 2 0 1
    //Explanation:                                            //Explanation:
    //arr[arr[0]] = arr[1] = 0.                              //arr[arr[0]] = arr[4] = 3.
    //arr[arr[1]] = arr[0] = 1.                               //arr[arr[1]] = arr[0] = 4.
    //                                                           and so on.
    static void arrange(long arr[], int n)
    {
        // your code here
        // long []a=new long[n];
        // for(int i=0;i<n;i++){
        //     a[i]=arr[i];
        // }
        // for(int i=0;i<n;i++){
        //     int temp=a[i];
        //     arr[a[i]]=temp;
        // }
        for (int i = 0; i < n; i++){
            int temp=(int)arr[i];
            arr[i] += (arr[temp] % n) * n;
        }
        for (int i = 0; i < n; i++)
            arr[i] /= n;
    }
}
class main{
    public static void main(String[] args) {
        long arr[]={0,1};
    }
}