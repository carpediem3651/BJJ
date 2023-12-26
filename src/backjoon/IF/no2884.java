package backjoon.IF;

import java.util.Scanner;

public class no2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

//        Case1 min이 45분 보다 적다면...
        if (min < 45) {
            System.out.println(hour + " " + (min - 45));
//        Case2 min이 45분 보다 많다면....
        } else {
            // Case2-1 hour가 0시라면...
            if(hour == 0) {
                System.out.println(23 + " " +(60 - (min - 45)));
            } else {
                System.out.println((hour-1) + " " +(60- (min - 45)));
            }
        }
    }
}
