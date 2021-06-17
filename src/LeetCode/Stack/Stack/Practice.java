package LeetCode.Stack.Stack;

import javax.sql.rowset.serial.SerialStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Practice {

}
class Longest_Prifix {
    public static String longestCommonPrefix(String[] strs) {

        String prefix=strs[0];
        for (int i = 0; i < strs.length; i++) {
            if(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,coman(strs[i],prefix));
            }
        }
        return prefix;
    }
    public static int coman(String a,String b){
        int i=0;

        while (i<a.length() && i<b.length() && a.charAt(i)==b.charAt(i)){
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class merge_to_sorted_list{
    public ListNode search(ListNode l2,ListNode node ){
        ListNode temp=l2;
        if(temp==null){
            temp=node;
        }
        if(temp.val==node.val){
            ListNode t=temp.next;
            temp.next=node;
            node.next=t;
        }
        while (temp.next!=null && temp.val<=node.val){
            temp=temp.next;
        }
        ListNode tm=temp.next;
        temp.next=node;
        node.next=tm;
        return temp;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode re=new ListNode();
        ListNode head=re;
        ListNode tail=re;

        if(l1==null && l2==null) return l1;

        while(l1!=null && l2!=null){

            if(l1.val < l2.val){
                re.val=l1.val;
                l1=l1.next;
                re.next=new ListNode();
                tail=re;
                re=re.next;
            }
            else if(l1.val>l2.val){
                re.val=l2.val;
                l2=l2.next;
                re.next=new ListNode();
                tail=re;
                re=re.next;
            }
            else{
                re.val=l1.val;
                l1=l1.next;
                re.next=new ListNode();
                tail=re;
                re=re.next;

                re.val=l2.val;
                l2=l2.next;
                re.next=new ListNode();
                tail=re;
                re=re.next;
            }
        }
        while (l1!=null) {
            re.val = l1.val;
            l1 = l1.next;
            re.next = new ListNode();
            tail = re;
            re = re.next;
        }
        while (l2!=null){
            re.val=l2.val;
            l2=l2.next;
            re.next=new ListNode();
            tail=re;
            re=re.next;
        }
        tail.next=null;

        return head;

    }

    public static void main(String[] args) {

    }
}
class Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length-1;j++){
                if(nums[i]==nums[j+1]){
                    count++;
                    nums[j+1]=Integer.MAX_VALUE;

                }
                else break;
            }

        }
        Arrays.sort(nums);
        return Math.abs(nums.length-count);
    }
}
class  Implement_strStr {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        else {
            int m = haystack.indexOf(needle);
            return m;
        }
    }
}
class Maximum_Subarray {
    public static int maxsum(int a[]){
        int s=0;
        Scanner sc=new Scanner(System.in);

            s= Arrays.stream(a).sum();
        return s;
    }
    public int maxSubArray(int[] nums) {

        int sum=0;
        for(int i=0;i<nums.length;i++){
            for (int j = i; j < nums.length; j++) {
                int sub[]=null;
                sub=Arrays.copyOfRange(nums,i,j+1);
                int s=maxsum(sub);
                if(sum<s){
                    sum=s;
                }
            }
        }
        return sum;
    }
}