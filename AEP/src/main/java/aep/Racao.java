package aep;

public class Racao {
	private int totalKg;
	private String nome;
	private Propriedade propriedade;
	private int codigo;
	
	public Racao(String nome, int totalKg, int codigo) {
		this.nome = nome;
		this.totalKg = totalKg;
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTotalKg(int totalKg) {
		this.totalKg = totalKg;
	}
	
	public void setPropriedade(Propriedade propriedade) {
		this.propriedade = propriedade;
	}
	
	public Propriedade getPropriedade() {
		return propriedade;
	}
	
	public int getTotalKg() {
		return totalKg;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void addTotal(int racaoAdicionada) {
		this.totalKg += racaoAdicionada;
	}
	
	public void retirarDoTotal(int racaoRetirada) {
		this.totalKg -= racaoRetirada;
	}
	
}
