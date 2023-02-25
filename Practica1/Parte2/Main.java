package Practica1.Parte2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> input1 = new ArrayList<Integer>();
        ArrayList<Integer> input2 = new ArrayList<Integer>();

        ArrayList<Integer> output = new ArrayList<Integer>();
        ArrayList<Long> times = new ArrayList<Long>();
        int num = 377;
        int num2 = 610;

        for (int j=0; j<32; j++) {
            var start = System.nanoTime();

            int num_max = num;
            int num_max2 = num2;

            ArrayList<Integer> facts1 = new ArrayList<Integer>();
            ArrayList<Integer> facts2 = new ArrayList<Integer>();

            facts1.add(1);
            facts2.add(1);
            facts1.add(num);
            facts2.add(num2);

            input1.add(num);
            input2.add(num2);

            // BUCLE ARRAY 1
            var div = 2;
            var stop = true;
            while (stop) { // 1  + n (13)
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
            stop = true;
            while (stop){
                if (num_max2 / 2 <= div) {    // Se ha llegado a la mitad del numero entrada
                    stop = false;
                } else if (num2 % div == 0) {
                    facts2.add(div);
                    num2 = num2 / div;
                } else if (num2 % div != 0) {
                    div++;
                }
            }

            ArrayList<Integer> common = new ArrayList<Integer>();


            stop = true;
            var i = 0;
            var numResult = 1;
            while (stop) {  // 1 + n(13)
                var x = facts1.get(i);
                if (facts2.contains(x)) {
                    numResult *= x;
                    common.add(x);
                    facts1.remove(i);
                    facts2.remove((Integer) x);
                } else {
                    i++;
                }
                if (i == facts1.size()) {
                    stop = false;
                }
            }

            output.add(numResult);


            int sum = num_max + num_max2;
            num = num_max2;
            num2 = sum;

            var end = System.nanoTime();
            var result = end - start;
            times.add(result);

        }
        System.out.println("El tiempo ha sido: \n" + times + "ns de: \n" + input1 + " \n" + input2);
    }
}
