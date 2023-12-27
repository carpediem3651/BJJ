package backjoon.IF.practice;

import java.util.Scanner;

public class no2480 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        // 만약 모든 변수가 다른 경우

            // 만약 a > b 라면

                // c > a > b 라면

                // a > (b, c)

            // b > a 라면

                // c > b > a 라면

                // b > (a, c)

        // 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우

            // 3개의 변수가 모두 같은 경우

                // a가 b혹은 c랑만 같은 경우

                // b가 c랑 같은 경우

            }
        }
    }
}
