package aep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produtor {
	private String nome;
	private List<Propriedade> propriedades = new ArrayList<>();
	private List<Boi> gado = new ArrayList<>();
	private List<Racao> racao = new ArrayList<>();
	
	public Produtor(String nome) {
		this.nome = nome;
	}
	
	public void addPropriedade(Propriedade novo) {
		this.propriedades.add(novo);
	}
	
	public void addBoi(Boi novo, Propriedade propriedade ) {
		this.gado.add(novo);
		novo.setPropriedade(propriedade);
	}
	
	public void addRacao(Racao novo, Propriedade propriedade) {
		this.racao.add(novo);
		novo.setPropriedade(propriedade);
	}
	
	public void excluirBoi(int codigoBoi) {
		for (int i = 0; i < this.gado.size(); i++) {
			if (this.gado.get(i).getCod() == codigoBoi) {
				this.gado.remove(i);
			}
		}
	}
	
	public void excluirRacao(int codigoRacao) {
		for (int i = 0; i < this.racao.size(); i++) {
			if (this.racao.get(i).getCodigo() == codigoRacao) {
				this.racao.remove(i);
			}
		}
	}
	
	public void exlcluirPropriedade(int escolha) {
		this.propriedades.remove(escolha-1);
	}
	
	public void moverBoi(int codigoBoi) {
		for (int i = 0; i < this.gado.size(); i++) {
			if (this.gado.get(i).getCod() == codigoBoi) {
				System.out.println("Para qual propriedade gostaria de mover o boi ?");
				mostrarPropriedades();
				Scanner input = new Scanner(System.in);
				int escolha;
				escolha = input.nextInt();
				String novo = propriedades.get(escolha-1).getNome();
				this.gado.get(i).setPropriedade(new Propriedade(novo));
			}
		}
	}
	
	public void editRacao(int codigoRacao) {
		for (int i = 0; i < this.racao.size(); i++) {
			if (this.racao.get(i).getCodigo() == codigoRacao) {
				System.out.println("1 - Adicionar racão");
				System.out.println("2 - Retirar racão");
				Scanner input = new Scanner(System.in);
				int escolha;
				escolha = input.nextInt();
				if (escolha == 1) {
					System.out.println("Quantos kg de racão serão adicionados ao total ?");
					int quantKg = input.nextInt();
					this.racao.get(i).addTotal(quantKg);
				}
				else if (escolha == 2) {
					System.out.println("Quantos kg de racão serão retirados do total ?");
					int quantKg = input.nextInt();
					this.racao.get(i).retirarDoTotal(quantKg);
				}
			}
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Propriedade> getPropriedades() {
		return propriedades;
	}
	
	public List<Boi> getGado() {
		return gado;
	}
	
	public int quantPropriedades() {
		return propriedades.size();
	}
	
	public String getNomePropriedade(int index) {
		return this.propriedades.get(index).getNome();
	}
	
	public void mostrarPropriedades() {
		if (propriedades.isEmpty()) {
			throw new RuntimeException("Não foi cadastrado nenhuma propriedade ainda !");
		}
		for(int x=0; x < quantPropriedades(); x++) {
			System.out.println(x + 1 + " - " + propriedades.get(x).getNome());
		}
	}
	
	public void MostrarTudo() {
		
		System.out.println("PROPRIEDADES:");
		for (Propriedade p : propriedades) {
			System.out.println(p.getNome());
		}
		System.out.println("GADO:");
		for (Boi b : gado) {
			System.out.println(b.getCod() + " - " + b.getRaca() + " - " + b.getPesoKg()); 
		}
		System.out.println("RACAO:");
		for (Racao r : racao) {
			System.out.println(r.getNome() + " - " + r.getTotalKg());
		}
	}
	
}
