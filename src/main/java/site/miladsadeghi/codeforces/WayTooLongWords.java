package site.miladsadeghi.codeforces;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWords = scanner.nextInt();

        String[] strings = new String[numberOfWords];
        for (int i = 0; i < numberOfWords; i++) {
            strings[i] = scanner.next();
        }

        for (int i = 0; i < numberOfWords; i++) {
            if (strings[i].length() > 10) {
                char beginningCharacter = strings[i].charAt(0);
                char endingCharacter = strings[i].charAt(strings[i].length() - 1);
                String middleNumber = String.valueOf(strings[i].length() - 2);
                strings[i] = beginningCharacter + middleNumber + endingCharacter;
            }
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
