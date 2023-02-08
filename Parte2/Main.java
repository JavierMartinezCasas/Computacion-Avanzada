package Parte2;
import java.util.ArrayList;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        var start = System.currentTimeMillis();

        int num = 90;
        int num_max = num;

        int num2 = 900;
        int num_max2 = num2;

        ArrayList<Integer> facts1 = new ArrayList<Integer>();
        ArrayList<Integer> facts2 = new ArrayList<Integer>();

        // BUCLE ARRAY 1
        var div = 2;
        var stop = true;
        while (stop) {
            if (num_max / 2 <= div) {    // Se ha llegado a la mitad del numero entrada
                stop = false;
            } else if (num % div == 0) {
                facts1.add(div);
                num = num / div;
            } else if (num % div != 0) {
                div++;
            }
        }

        // BUCLE ARRAY 2
        div = 2;
        stop = false;
        while (stop) {
            if (num_max2 / 2 <= div) {    // Se ha llegado a la mitad del numero entrada
                stop = false;
            } else if (num2 % div == 0) {
                facts2.add(div);
                num2 = num2 / div;
            } else if (num2 % div != 0) {
                div++;
            }
        }

        System.out.println("La lista de divisores del primer numero es: " + facts1);
        System.out.println("La lista de divisores del segundo  numero es: " + facts2);

        ArrayList<Integer> common = new ArrayList<Integer>();
        stop = false;
        var i = 0;
        while (stop){
             var x = facts1.get(i);
             if (facts2.contains(x)) {
                 common.add(x);
                 facts1.remove(i);
                 facts2.remove((Integer) x);
             } else {
                 i++;
             }
             if (i==facts1.size()) {
                 stop = false;
             }
        }

        var numResult = 1;
        for (i=0; i<common.size(); i++) {
            numResult *= common.get(i);
        }

        var end = System.currentTimeMillis();
        var result = end - start;

        System.out.println("La lista resultado es: " + common);
        System.out.println("El mcd es: " + numResult);
        System.out.println("El tiempo ha sido: " + result + "ms");
    }
}
