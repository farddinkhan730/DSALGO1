package College_lab.Trees;

import java.util.*;

class Node {
    public int data;
    public int height;
    public Node left;
    public Node right;

    public Node(int data)
    {
        this.data = data;
        height = 0;
        left = null;
        right = null;
    }
}
public class AVL_Tree {
    Node root;

    public AVL_Tree() {
        root = null;
    }

    public int max(int lhs, int rhs) {
        return lhs > rhs ? lhs : rhs;
    }

    public int height(Node node) {
        return node == null ? -1 : node.height;
    }

    public Node insert(int data, Node troot ) {
        if (troot == null) {
            troot= new Node(data);
        }
        else if (data < troot.data) {
            troot.left = insert(data,troot.left);
            if(height(troot.left)- height(troot.right)== 2)
            {
                if(data<troot.left.data)
                {
                    troot = RightRightRotation(troot);
                }
                else
                {
                    troot= doublerotationwithleftchild(troot);
                }
            }

        }
        else if (data > troot.data) {
            troot.right= insert(data, troot.right);
            if(height(troot.right)- height(troot.left)== 2)
            {
                if(data>troot.right.data)
                {
                    troot = LeftLeftRoattion(troot);
                }
                else
                {
                    troot= doubleroationwithrightchild(troot);
                }
            }
        }
        troot.height= max(height(troot.left), height(troot.right))+1;
        return troot;
    }
    private Node doubleroationwithrightchild(Node current_disabled_node) {
        current_disabled_node.right = RightRightRotation((current_disabled_node.right));
        return LeftLeftRoattion(current_disabled_node);
    }
    public Node doublerotationwithleftchild(Node current_disabled_node)
    {
        current_disabled_node.left = LeftLeftRoattion((current_disabled_node.left));
        return RightRightRotation(current_disabled_node);
    }
    public Node RightRightRotation(Node current_disabled_node)
    {
        Node newroot = current_disabled_node.left;
        current_disabled_node.left = newroot.right;
        newroot.right= current_disabled_node;
        current_disabled_node.height= max(height(current_disabled_node.left),height(current_disabled_node.right))+1;
        newroot.height= max(height(newroot.left),current_disabled_node.height)+1;
        return newroot;
    }

    public Node LeftLeftRoattion(Node current_disabled_node) {
        Node newroot = current_disabled_node.right;
        current_disabled_node.right = newroot.left;
        newroot.left= current_disabled_node;
        current_disabled_node.height= max(height(current_disabled_node.left),height(current_disabled_node.right))+1;
        newroot.height= max(height(newroot.left),current_disabled_node.height)+1;
        return newroot;
    }

    public void inordertraversal(Node troot)
    {
        if(troot != null)
        {
            inordertraversal(troot.left);
            System.out.println(troot.data);
            inordertraversal(troot.right);
        }
    }
}

class AVLMain {
    public static void main(String[] args) {
        AVL_Tree obj = new AVL_Tree();
        obj.root = obj.insert(15, obj.root);
        obj.root = obj.insert(20,obj.root);
        obj.root = obj.insert(11,obj.root);
        obj.root = obj.insert(5, obj.root);
        obj.root = obj.insert(50,obj.root);
        obj.root = obj.insert(4,obj.root);
        obj.root = obj.insert(13, obj.root);
        obj.root = obj.insert(12,obj.root);
        obj.inordertraversal(obj.root);
    }
}

class fkhan{
    public static void main(String[] args) {
        int a=3521;
        int b=2452;
        int c=1352;
        int max=0;
        int z=a;
        while(a!=0){
            int n=a%10;
            max=Math.max(max,n);
            a/=10;
        }
        int min=100;
        while(z!=0){
            int n=z%10;
            min=Math.min(min,n);
            z/=10;
        }

    }
}
class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> as=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            as.add(sc.nextInt());
        }
        int q=sc.nextInt();

        while(q-->=0){
            sc.nextLine();
            String str=sc.nextLine();
            if(str.equals("Insert")){
//                sc.next();

                int x=sc.nextInt();
                int y=sc.nextInt();
                as.add(x,y);
                System.out.print(x);
                System.out.print(y);
                System.out.println(as);
            }
            if(str.equals("Delete")){
                int x=sc.nextInt();
                as.remove(x);
                System.out.println(as);
            }
        }
        System.out.println(as);
        Collections.sort(as);
        for(int i=0;i<as.size();i++){
            System.out.print(as.get(i)+" ");
        }

    }
}
class mn{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        sc.nextLine();
//        String aq=sc.nextLine();
//        int a2=sc.nextInt();
//        System.out.println(a);
//        System.out.println(aq);
//        System.out.println(a2);
        ArrayList ar=new ArrayList();
        ar.add(45);
        ar.add(78);
        ar.add(896);
        System.out.println(ar.get(0));
        ar.remove(0);
        System.out.println(ar.get(0));
    }
}





//5
//        12 0 1 78 12
//        2
//        Insert
//        5 23
//        Delete
//        0
//0 1 78 12 23
class String_convert{
    public static String convert(String str,int count){
        String s="";
        char cs[]=str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            cs[i]+=count;
            if(cs[i]>122){
                cs[i]='z';
            }
            if(cs[i]>=91 && cs[i]<=96){
                cs[i]='Z';
            }

            s+=cs[i];
        }
        return s;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            String str= sc.nextLine();
            char []c=str.toCharArray();
            String s=new String();
            String s1=new String();
            int count=0;
            for(int i=0;i<c.length;i++){
               if(c[i]!=' '){
                   s+=c[i];
                   count++;

               }
               else{
                    s1+=convert(s,count)+" ";
                    count=0;
                    s="";
                    continue;
                }
            }
        s1+=convert(s,count);
        System.out.println(s1);

    }
}
class ascii{
    public static void main(String[] args) {
        System.out.println( " a "+ (int)'a' + " H+4 " + (char)((int)'H'+4));
        System.out.println("Z "+ (int)'Z' + " e+4 " + (int)'e'+4);
        System.out.println("z "+ (int)'z' + " l+4 " + (int)'l'+4);
    }
}
class uncomman_Sum{
    public static void comman(int a[],int b[]){
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> hs1=new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            hs1.add(b[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if(hs.contains(b[i])){
                int temp=b[i];
                for (int j = i; j <b.length-1 ; j++) {
                    b[j]=b[j+1];
                }
                b[b.length-1]=temp;
            }


        }
        for (int i = 0; i < a.length; i++) {
            if(hs1.contains(a[i])){
                int temp=a[i];
                for (int j = i; j <a.length-1 ; j++) {
                    a[j]=a[j+1];
                }
                a[a.length-1]=temp;
            }
        }
    }
    public static int un_comman_sum(int a[],int b[]){
        int sum=0;
        boolean check=true;
        for (int i = 0; i <a.length ; i++) {
            check=true;
            for (int j = 0; j < b.length; j++) {
                if(a[i]==b[j]) {
                    check = false;
                    break;
                }
            }
            if(check){
                sum+=a[i];
            }
        }
        int sumb=0;
        boolean check1=true;
        for (int i = 0; i <b.length ; i++) {
            check1=true;
            for (int j = 0; j < a.length; j++) {
                if(b[i]==a[j]) {
                    check1 = false;
                    break;
                }
            }
            if(check1){
                sumb+=b[i];
            }
        }
        int final_sum=sum+sumb,digital_sum=0;
        while (final_sum!=0){
            int n=final_sum%10;
            digital_sum+=n;
            final_sum/=10;
            if(digital_sum>=10){
                int digital_sum1=0;
                int n1=digital_sum%10;
                digital_sum1+=n1;
                digital_sum/=10;
                digital_sum=digital_sum1;
            }
        }

        return digital_sum;
    }
    public static void main(String[] args) {
        int a[]={7,8,3,5,6};
        int b[]={7,3,1,8,5};
        int result=un_comman_sum(a,b);
        System.out.println(result);
    }
}
