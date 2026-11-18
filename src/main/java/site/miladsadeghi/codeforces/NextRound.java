package site.miladsadeghi.codeforces;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String[] firstLineArr = firstLine.split(" ");
        int n = Integer.parseInt(firstLineArr[0]);
        int k = Integer.parseInt(firstLineArr[1]);

        String scores = scanner.nextLine();
        String[] scoresArr = scores.split(" ");

        int kthScore = Integer.parseInt(scoresArr[k - 1]);

        int toNextRound = 0;
        for (int i = 0; i < n; i++) {
            int currentScore = Integer.parseInt(scoresArr[i]);

            if (currentScore >= kthScore && currentScore > 0) {
                toNextRound++;
            }
        }

        System.out.println(toNextRound);
    }
}
