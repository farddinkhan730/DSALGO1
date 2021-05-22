package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Job{
    char id;
    int dead;
    int profit;

    Job(char id,int dead,int profit){
        this.id=id;
        this.dead=dead;
        this.profit=profit;
    }
}
public class Job_Sequencing_problem {

    public static  void sequencing(ArrayList<Job> arr,int time_period){

        Collections.sort(arr,(a,b)->b.profit-a.profit);

        boolean time_line[]=new boolean[time_period];
        char jobs[]=new char[time_period];
        Arrays.fill(time_line,false);
        for (int i = 0; i < arr.size(); i++) {
            for (int j = Math.min(time_period - 1, arr.get(i).dead-1); j >= 0; j--) {

                if (time_line[j] == false) {
                    time_line[j] = true;
                    jobs[j] = arr.get(i).id;
                    break;
                }
            }
        }
        for (char e:jobs
             ) {
            System.out.print(e+" ");
        }
    }

    public static void main(String[] args) {

        ArrayList<Job> arr = new ArrayList<Job>();

        arr.add(new Job('a', 2, 100));
        arr.add(new Job('b', 1, 19));
        arr.add(new Job('c', 2, 27));
        arr.add(new Job('d', 1, 25));
        arr.add(new Job('e', 3, 15));
        // Calling function
        sequencing(arr, 3);

    }

}
