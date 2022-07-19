package src;

import java.util.Scanner;

public class Construction_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i <x; i++) {
            int a = sc.nextInt();
            int b = 750;
            if (a>b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
