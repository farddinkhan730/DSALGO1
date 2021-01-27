package College_lab;

import java.util.Scanner;

public class student {
    public Scanner sc=new Scanner(System.in);
    private int sturoll;
    private String stu_name;
//    private int sub1;
//    private int sub2;
//    private int sub3;
    int marks[]=new int[3];

    public int[] getMarks() {
        return marks;
    }

    public student(int sroll, String stu_name){
        sturoll=sroll;
        this.stu_name=stu_name;
        System.out.println("Enter the marks of three subject");
        for (int i = 0; i < 3; i++) {
            marks[i]=sc.nextInt();
        }

//        this.sub1=sub1;
//        this.sub2=sub2;
//        this.sub3=sub3;
    }
//    public void setSturoll(int sturoll) {
//        this.sturoll = sturoll;
//    }
//
//    public void setStu_name(String stu_name) {
//        this.stu_name = stu_name;
//    }
//
//    public void setSub1(int sub1) {
//        this.sub1 = sub1;
//    }
//
//    public void setSub2(int sub2) {
//        this.sub2 = sub2;
//    }
//
//    public void setSub3(int sub3) {
//        this.sub3 = sub3;
//    }

    public int getSturoll() {
        return sturoll;
    }

    public String getStu_name() {
        return stu_name;
    }

//    public int getSub1() {
//        return sub1;
//    }
//
//    public int getSub2() {
//        return sub2;
//    }
//
//    public int getSub3() {
//        return sub3;
//    }


}
class student_main{
    public static Scanner sc=new Scanner(System.in);
    public static int result(student a){
        int count=0;
        for (int i = 0; i < 2; i++) {
            count=0;
            for (int j = 0; j < 3; j++) {
                if (a.marks[j] < 40) {
                    count++;
                }
//                if (a[i].marks[j] < 40) {
//                    count++;
//                }
//                if (a[i].marks[j] < 40) {
//                    count++;
//                }
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int ans[]=new int[2];
        student a[]=new student[2];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter Roll_no Name Sub1_mark subj2_mark subj3_mark");
            a[i]=new student(sc.nextInt(),sc.next());
            ans[i]=result(a[i]);
            System.out.println(ans[i]);
        }
//        for (int i = 0; i < ans.length; i++) {
//            ans[i]=result(a);
//            System.out.println(ans[i]);
//        }

    }
}
