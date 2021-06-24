package College_lab.Assignment;
import java.util.Scanner;

public class Binarry_search {

    public static int binarrySearch(int a[],int start,int end,int ele){

        if (start<=end){
            int mid=start+(end-start)/2;

            if(a[mid]==ele){
                return a[mid];
            }
            if(a[mid]>ele){
               return binarrySearch(a,start,mid-1,ele);
            }

              return   binarrySearch(a,mid+1,end,ele);


        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(binarrySearch(a,0,n,5));
    }

}
