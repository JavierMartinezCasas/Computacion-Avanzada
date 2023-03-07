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
		ArrayList <String> listaPrimos = new ArrayList<String>();
		/*listaPrimos.add("776159");
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
		listaPrimos.add("9999940600088209");*/
		listaPrimos.add("999999594000041207");
		listaPrimos.add("999999594000041209");
		listaPrimos.add("4611685283988009527");
		listaPrimos.add("4611685283988009529");
		listaPrimos.add("9223371593598182327");
		listaPrimos.add("9223371593598182329");

		for (int i = 0; i< listaPrimos.size() ;i++){
			long start = System.currentTimeMillis();
			BigInteger n = new BigInteger(listaPrimos.get(i));
			// BigInteger n = BigInteger.probablePrime(64, new SecureRandom());
			System.out.println(n);
			AKS.verbose = false;
			new AKS(n).isPrime();
			long end = System.currentTimeMillis();
			long time = end - start;
			try {
				FileWriter archivo = new FileWriter("pruebas.txt", true);
				archivo.write("\nEl resultado del programa total en tiempo es: " + time + " ms para el n�mero: " + n+"\n\n");
				archivo.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
