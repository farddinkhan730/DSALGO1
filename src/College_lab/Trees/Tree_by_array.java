package College_lab.Trees;

public class Tree_by_array {
    int arr[];
    int LastIndex;
    Tree_by_array(int size){
        arr=new int[size+1];
        LastIndex=0;
    }
    public void insert(int v){
        if(arr.length-1==LastIndex){
            System.out.println("List is full");
            return;
        }
        arr[++LastIndex]=v;
    }
    public void pre_order_travers(int index){
        if(index>LastIndex){
            return;
        }
        System.out.print(arr[index]+" ");
        pre_order_travers(index*2);
        pre_order_travers(index*2+1);
    }
    public void post_order_traverse(int index){
        if(index>LastIndex){
            return;
        }
        pre_order_travers(index*2);
        pre_order_travers(index*2+1);
        System.out.print(arr[index]+" ");
    }
    public void in_order(int index){
        if(index>LastIndex){
            return;
        }
        in_order(index*2);
        System.out.print(arr[index]+" ");
        in_order(index*2+1);
    }
    public void level_order_traversal(){
        for (int i = 1; i <= LastIndex; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public int search(int value){
        for (int i = 1; i <=LastIndex; i++) {
            if(arr[i]==value){
                System.out.println("Value found" );
                return i;
            }
        }
        System.out.println("value is not available");
        return -1;
    }
    public void deletion(int value){
        int n=search(value);
        if(n==-1) return;

        arr[n]=arr[LastIndex--];
    }
}
class main{
    public static void main(String[] args) {
        Tree_by_array obj=new Tree_by_array(10);
        obj.insert(5);
        obj.insert(10);
        obj.insert(5);
        obj.insert(10);
        obj.insert(15);
        obj.insert(20);
        obj.insert(25);
        obj.insert(30);
        obj.insert(35);
        obj.insert(40);
//        obj.deletion(25);
        System.out.println("levelorder Traversal");
        obj.level_order_traversal();
        System.out.println();
        System.out.println("inorder Traversal");
        obj.in_order(1);
        System.out.println();
        System.out.println("postorder Traversal");
        obj.post_order_traverse(1);
        System.out.println();
        System.out.println("preorder Traversal");
        obj.pre_order_travers(1);


    }
}
