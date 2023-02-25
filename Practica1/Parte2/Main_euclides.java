package Practica1.Parte2;

import java.util.ArrayList;

public class Main_euclides {
    public static void main(String[] args) {
        ArrayList<Integer> input1 = new ArrayList<Integer>();
        ArrayList<Integer> input2 = new ArrayList<Integer>();

        ArrayList<Integer> output = new ArrayList<Integer>();
        ArrayList<Long> times = new ArrayList<Long>();
        var a = 377;
        var b = 610;

        for (int j=0; j<32; j++) {
            var start = System.nanoTime();
            input1.add(a);
            input2.add(b);
            int num_max = a;
            int num_max2 = b;

            while (b != 0) {  //  C + n(C + S) -> 1 + n(1 + 4)
                int tmp = b;
                b = a % b;
                a = tmp;
            }

            int sum = num_max + num_max2;
            a = num_max2;
            b = sum;

            // tiempo
            var end = System.nanoTime();
            long result = end - start;
            times.add(result);
        }
        System.out.println("El tiempo ha sido: \n" + times + "ns de: \n" + input1 + " \n" + input2);
        //System.out.println("El factor cumún es: " + a); // 1
        //System.out.println("El tiempo ha sido: " + result + "ms"); // 1
    }
}
