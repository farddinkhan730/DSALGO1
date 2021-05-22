package Greedy;

import java.util.Comparator;
import java.util.PriorityQueue;

class huffNode {
    int data;
    char c;

    huffNode leff;
    huffNode right;
}
class my_compare implements Comparator<huffNode>{
    @Override
    public int compare(huffNode o1, huffNode o2) {
        return o1.data-o2.data;
    }
}
public class Huffman_coding {
    public static void huff_coding(char  chr_ar[],int num_ar[],int n){


        PriorityQueue<huffNode> q=new PriorityQueue<huffNode>(n,new  my_compare());

        for (int i = 0; i < n; i++) {
            huffNode f=new huffNode();
            f.c=chr_ar[i];
            f.data=num_ar[i];
            f.leff=null;
            f.right=null;

            q.add(f);

        }
        huffNode root=null;

        while (q.size()>1) {

            huffNode f = new huffNode();

            huffNode x = q.poll();
            huffNode y = q.poll();

            f.data = x.data + y.data;

            f.c = '-';

            f.leff = x;
            f.right = y;

            root = f;

            q.add(f);
        }
            printcode(root,"");

    }
    public static void printcode(huffNode root,String s){

        if(root.leff==null && root.right==null && Character.isLetter(root.c)){

            System.out.println(root.c+" : "+ s);
    return;
        }

        printcode(root.leff,s+0);
        printcode(root.right,s+1);

    }

    public static void main(String[] args) {
        int n = 6;
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charfreq = { 5, 9, 12, 13, 16, 45 };
        huff_coding(charArray,charfreq,n);
    }

}
