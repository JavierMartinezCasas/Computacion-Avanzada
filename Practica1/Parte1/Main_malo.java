package Practica1.Parte1;

public class Main_malo {
    public static void main(String[] args) {
        var start = System.currentTimeMillis();
        var num_str = "7777777777";

        int num = Integer.parseInt(num_str);
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
            System.out.println(num + " es un número compuesto");
        var end = System.currentTimeMillis();
        var result = end - start;
        System.out.println("El tiempo ha sido: " + result + "ms");
    }
}