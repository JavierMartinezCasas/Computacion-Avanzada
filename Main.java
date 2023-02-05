import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String num_str = "7777777777888888888888888888";

        BigInteger num = new BigInteger(num_str);
        boolean isPrime = true;

        BigInteger limit = num.divide(BigInteger.valueOf(2));
        for(BigInteger i = BigInteger.TWO; i.compareTo(limit) <= 0; i = i.add(BigInteger.ONE)) {
            if(num.mod(i).equals(BigInteger.ZERO)) {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println(num + " es un número primo");
        else
            System.out.println(num + " es un número compuesto");
        long end = System.currentTimeMillis();
        long result = end - start;
        System.out.println("El tiempo ha sido: " + result + "ms");
    }
}
