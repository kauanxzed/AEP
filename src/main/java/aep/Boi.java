package aep;

public class Boi {
	private int cod;
	private int pesoKg;
	private String raca;
	private Propriedade propriedade;
	private int quantRacaoIngeridaKg;
	
	public Boi(int cod, int pesoKg, String raca) {
		this.cod = cod;
		this.pesoKg = pesoKg;
		this.raca = raca;
	}
	
	public void setPesoKg(int pesoKg) {
		this.pesoKg = pesoKg;
	}
	
	public void setQuantRacaoIngeridaKg(int quantRacaoIngeridaKg) {
		this.quantRacaoIngeridaKg = quantRacaoIngeridaKg;
	}
	
	public void setPropriedade(Propriedade propriedade) {
		this.propriedade = propriedade;
	}
	
	public int getCod() {
		return cod;
	}
	
	public int getPesoKg() {
		return pesoKg;
	}

	public String getRaca() {
		return raca;
	}
	
	public Propriedade getPropriedade() {
		return propriedade;
	}
	
	public int getQuantRacaoIngeridaKg() {
		return quantRacaoIngeridaKg;
	}
	
}
