package PrimeNumbers;

import java.util.List;

public class MainPrime {

    public static void main(String[] args) {
        PrimeCalc primeCalc = new PrimeCalc();
        System.out.println(primeCalc.isPrime(5));
        System.out.println(primeCalc.isPrime(8));

        List<Integer> list = primeCalc.getPrimeNumbers(99);
        for (int i : list)
        System.out.print(i + " ");
    }
}
