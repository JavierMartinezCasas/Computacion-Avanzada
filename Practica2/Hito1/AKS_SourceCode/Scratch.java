package Practica2.Hito1.AKS_SourceCode;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.math.BigInteger;
import java.security.SecureRandom;



public class Scratch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList <String> listaPrimos = new ArrayList<String>();
		listaPrimos.add("776159");
		listaPrimos.add("776161");
		listaPrimos.add("98982599");
		listaPrimos.add("98982601");
		listaPrimos.add("9984605927");
		listaPrimos.add("9984605929");
		listaPrimos.add("999498062999");
		listaPrimos.add("999498063001");
		listaPrimos.add("99996460031327");
		listaPrimos.add("99996460031329");
		listaPrimos.add("9999940600088207");
		listaPrimos.add("9999940600088209");
		listaPrimos.add("999999594000041207");
		listaPrimos.add("999999594000041209");
		listaPrimos.add("4611685283988009527");
		listaPrimos.add("4611685283988009529");
		listaPrimos.add("9223371593598182327");
		listaPrimos.add("9223371593598182329");*/
//i< listaPrimos.size()
		int digitos = 5; // poner dos de menos
		double bit_l;
		double log_2de10 = Math.log(10)/Math.log(2);

		for (int i = 0; i < 100 ;i++){
			long start = System.currentTimeMillis();
			//BigInteger n = new BigInteger(listaPrimos.get(i));
			if (i % 10 == 0) {
				digitos += 1;
			}
			bit_l = digitos * log_2de10;
			int intValue = (int) bit_l;

			BigInteger n = BigInteger.probablePrime(intValue, new SecureRandom());
			System.out.println(n);
			AKS.verbose = false;
			new AKS(n).isPrime();
			long end = System.currentTimeMillis();
			long time = end - start;
			try {
				FileWriter archivo = new FileWriter("pruebas.txt", true);
				archivo.write("\n" + n+" "+ time +"\n\n");
				archivo.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
