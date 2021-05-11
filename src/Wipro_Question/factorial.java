package Wipro_Question;

//factorial without using loop
public class factorial {
    public static int fact(int n){
        if(n==1){
            return 1 ;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        int n=6;
        int m=fact(n);
        System.out.println(m);
    }
}
class animal{
     static class dog{
        public void shout(){
            System.out.println("BOU BOU");
        }
    }
    static class Horse{
        public void shout(){
            System.out.println("eeeehhheee");
        }
    }
    static class cat{
        public void shout(){
            System.out.println("Meaow");
        }
    }

    public static void main(String[] args) {
        animal obj= new animal();
        animal.dog obj1=new dog();
        obj1.shout();
        animal.cat obj2=new cat();
        obj2.shout();
        animal.Horse obj3=new Horse();
        obj3.shout();
    }
}