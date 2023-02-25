package Practica2.Hito1.AKS_SourceCode;

import java.math.BigInteger;
import java.security.SecureRandom;


public class Scratch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger n = new BigInteger("98982601");
		System.out.println(n);
		AKS.verbose = true;

		new AKS(n).isPrime();
	}

}
