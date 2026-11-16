package site.miladsadeghi;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            IO.println("I is " + i);
            if (i % 2 == 0) IO.println(i + " is divisible by 2");
            if (i % 3 == 0) IO.println(i + " is divisible by 3");
            if (i % 5 == 0) IO.println(i + " is divisible by 5");
            if (i % 7 == 0) IO.println(i + " is divisible by 7");

            Thread.sleep(500);
        }
    }
}
