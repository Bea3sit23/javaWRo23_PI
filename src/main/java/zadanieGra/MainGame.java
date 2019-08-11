package zadanieGra;

import java.util.Scanner;

public class MainGame {

    private static final int upperBound = 100;

    public static void main(String[] args) {

        RandomNumber randomNumber = new RandomNumber();
        int number = randomNumber.nextInt(upperBound);

        for (int i = 0; i < 7; i++) {

            Scanner reader = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = reader.nextInt();
            reader.close();

            if (number == n) {
                System.out.println("Numbers match :)");
                return;
            }
            if (n < number)
                System.out.println("Daj wiecej");
            else
                System.out.println("Daj mniej");
        }
        System.out.println(number);
    }
    }
