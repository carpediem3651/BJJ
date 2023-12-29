package backjoon.IF;

import java.util.Scanner;

public class no25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int num = sc.nextInt();

        int totalSum = 0;

        for(int i=0; i<num; i++) {
            int price = sc.nextInt();
            int stuffNum = sc.nextInt();
            totalSum += price*stuffNum;
        }


        sc.close();

        if(total==totalSum)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
