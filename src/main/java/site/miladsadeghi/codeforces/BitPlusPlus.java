package site.miladsadeghi.codeforces;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = scanner.nextInt();
        int initialCount = 0;

        for (int i = 0; i < numberOfInputs; i++) {
            String value = scanner.next();
            if (value.equals("X++") || value.equals("++X")) initialCount++;
            if (value.equals("--X") || value.equals("X--")) initialCount--;
        }

        System.out.println(initialCount);
    }
}
