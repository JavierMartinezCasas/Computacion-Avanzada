package Parte2;

public class Main_euclides {
    public static void main(String[] args) {

        var start = System.currentTimeMillis();

        var a = 7;
        var b = 3;

        while (b != 0) {  //  C + n(C + S) -> 1 + n(1 + 4)
            int tmp = b;
            b = a % b;
            a = tmp;
        }

        // tiempo
        var end = System.currentTimeMillis();
        long result = end - start;

        System.out.println("El factor cumún es: " + a); // 1
        System.out.println("El tiempo ha sido: " + result + "ms"); // 1
    }
}

