package Practica2.Hito1.AKS_SourceCode;

import java.math.BigInteger;
import java.security.SecureRandom;


public class Scratch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//BigInteger n = BigInteger.probablePrime(24, new SecureRandom()); // 2^bitLength
		BigInteger n = BigInteger.valueOf(2); // Meter el numero ahi
		System.out.println("Numero: " + n);
		AKS.verbose = false;
		System.out.println(new AKS(n).isPrime());
	}

}
