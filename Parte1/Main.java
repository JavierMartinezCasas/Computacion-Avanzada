package Parte1;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // 1
        String num_str = "3045006047"; // 1

        BigInteger num = new BigInteger(num_str); // 1
        boolean isPrime = true; // 1

        BigInteger limit = num.divide(BigInteger.valueOf(2));
        for(BigInteger i = BigInteger.TWO; i.compareTo(limit) <= 0; i = i.add(BigInteger.ONE)) {  // 1 + 1 + N (1 + 2 + 3)
            if(num.mod(i).equals(BigInteger.ZERO)) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) // 1
            System.out.println(num + " es un número primo"); // 1
        else // 1
            System.out.println(num + " es un número compuesto"); // 1
        long end = System.currentTimeMillis(); // 1
        long result = end - start; // 2
        System.out.println("El tiempo ha sido: " + result + "ms"); // 1
    }
}
