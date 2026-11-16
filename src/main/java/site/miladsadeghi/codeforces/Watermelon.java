package site.miladsadeghi.codeforces;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value > 2) {
            if (value % 2 == 0) System.out.println("YES");
            else System.out.println("NO");
        } else System.out.println("NO");
    }
}
