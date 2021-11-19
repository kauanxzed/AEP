package aep;

public class BalancaRacao implements Balanca {
	private int pesoInicial;
	private int pesoAtual;
	
	public void pesarRacao(int pesoKg) {
		this.pesoAtual = pesoKg;
	}
	
	public int racaoGasta() {
		return pesoInicial - pesoAtual;
	}
	
	public void setPesoInicial(int pesoInicial) {
		this.pesoInicial = pesoInicial;
	}
	
	@Override
	public int getPesoKg() {
		return pesoAtual;
	}
	
	@Override
	public String getTipo() {
		return "BalancaRacao";
	}
}
