package aep;

import java.util.Scanner;

public class AppAEP {
	
	public static void menu() {
		
		System.out.println("Opcões do Proprietario:");
		System.out.println("1 - Manter gado");
		System.out.println("2 - Manter racão");
		System.out.println("3 - Manter propriedade");
		System.out.println("4 - Ver Bens");
		System.out.println("0 - Encerrar");
	}
	
	public static void manterGado() {
		System.out.println("1 - Adicionar Gado");
		System.out.println("2 - Excluir Gado");
		System.out.println("3 - Mover Gado");
	}
	
	public static void manterRacao() {
		System.out.println("1 - Adicionar Racão");
		System.out.println("2 - Excluir Racão");
		System.out.println("3 - Editar Racão");
	}
	
	public static void manterPropriedade() {
		System.out.println("1 - Adicionar Propriedade");
		System.out.println("2 - Excluir Propriedade");
	}
	
	public static void gerarRelatório() {
		
	}
	
	public static void main(String[] args) {
		
		Produtor produtor = new Produtor("Kauan");
		int escolha = 0;
		boolean run = true;
		Scanner input = new Scanner(System.in); 
		
		while (run ==  true) {
			menu();
			escolha  = input.nextInt();
			switch(escolha) {
			case 0:
				run = false;
				break;
			case 1:
				manterGado();
				escolha  = input.nextInt();
				if (escolha == 1) { // ADICIONAR BOI
					System.out.println("Em qual propriedade gostaria de adicionar o boi ?");
					produtor.mostrarPropriedades();
					escolha = input.nextInt();
					int cod, peso;
					String raca;
					System.out.println("Qual o codigo do boi ?");
					cod = input.nextInt();
					System.out.println("Qual o peso do boi ?");
					peso = input.nextInt();
					System.out.println("Qual a raca do boi ?");
					input.nextLine();
					raca = input.nextLine();
					produtor.addBoi(new Boi(cod, peso, raca), new Propriedade(produtor.getNomePropriedade(escolha-1)));
					break;
				}
				
				else if (escolha == 2) { // EXCLUIR BOI
					System.out.println("Qual o código do boi que deseja excluir ?");
					int cod = input.nextInt();
					produtor.excluirBoi(cod);
					break;
				}
				
				else if (escolha == 3) { // EDITAR BOI
					System.out.println("Qual o código do boi que deseja mover ?");
					int cod = input.nextInt();
					produtor.moverBoi(cod);
					break;
				}
				
			case 2:
				manterRacao();
				escolha = input.nextInt();
				if (escolha == 1) { // ADICIONAR RACAO
					System.out.println("Qual propriedade gostaria de adicionar racão ?");
					produtor.mostrarPropriedades();
					escolha = input.nextInt();
					System.out.println("Qual o nome da racão que deseja adicionar ?");
					input.nextLine();
					String nome = input.nextLine();
					System.out.println("Quantos quilos dessa racão serão adicionados ?");
					int quantRacaoEmQuilos = input.nextInt();
					System.out.println("Qual o codigo dessa racao ?");
					int cod = input.nextInt();
					produtor.addRacao(new Racao(nome,quantRacaoEmQuilos,cod), new Propriedade(produtor.getNomePropriedade(escolha-1)));
					break;
				}
				
				if (escolha == 2) { // EXCLUIR RACAO
					System.out.println("Qual o codigo da racão que deseja excluir ?");
					int cod = input.nextInt();
					produtor.excluirRacao(cod);
					break;
				}
				
				if (escolha == 3) { // EDITAR RACAO
					System.out.println("Qual o codigo da racão que deseja editar ?");
					int cod = input.nextInt();
					produtor.editRacao(cod);
					break;
				}
					
			case 3: 
				manterPropriedade();
				escolha = input.nextInt();
				
				if (escolha == 1) { // ADICIONAR PROPRIEDADE
					System.out.println("Qual o nome da propriedade que gostaria de adicionar ?");
					input.nextLine();
					produtor.addPropriedade(new Propriedade(input.nextLine()));
					break;
				}
				
				if (escolha == 2) { // EXCLUIR PROPRIEDADE
					produtor.mostrarPropriedades();
					System.out.println("Qual das propriedades gostaria de remover ?");
					int i = input.nextInt();
					produtor.exlcluirPropriedade(i);
					break;
				}
			case 4:
				produtor.MostrarTudo();
				break;
			}
		}
		
	}
}
