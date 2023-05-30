package Exercicio;

import java.util.Scanner;

public class Programa {

	public static boolean is4digits(String pin) {
		if (pin.length() != 4) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("Digite um numero de 4 digitos: ");
		String PIN = scn.nextLine();

		if (is4digits(PIN) == true) {
			System.out.println("Pin valido!");
		} else {
			System.out.println("Pin recusado!");
		}
	}
	scn.close();
}
