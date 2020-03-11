import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hw6_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.next());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            arr.add(Integer.parseInt(scan.next()));
        }
        //collections.sort is a merge sort, ie divide and conquer
        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-1));

    }
}


