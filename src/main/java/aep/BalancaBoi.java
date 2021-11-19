package aep;

import java.util.Scanner;

public class BalancaBoi implements Balanca {
	private int pesoKg;
	
	public int pesarBoi() {
		Scanner input = new Scanner(System.in);
		this.pesoKg = input.nextInt();
		return pesoKg;
	}
	
	@Override
	public int getPesoKg() {
		return pesoKg;
	}
	
	@Override
	public String getTipo() {
		return "BalancaBoi";
	}
	
}
