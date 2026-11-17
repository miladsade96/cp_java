package site.miladsadeghi.codeforces;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int numberOfProblems = scanner.nextInt();

        for (int i = 0; i < numberOfProblems; i++) {
            int p1 = scanner.nextInt();
            int p2 = scanner.nextInt();
            int p3 = scanner.nextInt();

            if (p1 + p2 + p3 >= 2) count++;
        }

        System.out.println(count);
    }
}
