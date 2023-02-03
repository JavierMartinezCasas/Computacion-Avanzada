public class Main {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;

        for(int i=2; i<=num/2; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println(num + " es un número primo");
        else
            System.out.println(num + " no es un número primo");
    }
}