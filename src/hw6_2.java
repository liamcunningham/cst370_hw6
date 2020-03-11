import javax.swing.*;
import java.util.Scanner;

public class hw6_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfItems = Integer.parseInt(scan.next());
        int maxOfItems = Integer.parseInt(scan.next());
        int [] weight = new int[numOfItems];
        int [] value = new int[numOfItems];
        for (int i = 0; i < numOfItems; i++) {
            //grab items and vals
            weight[i]=Integer.parseInt(scan.next());
            value[i]=Integer.parseInt(scan.next());
        }

    }
}
