import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Jogador jogador01 = new Jogador("Gabriel Barbosa", 86, 100);
		Jogador jogador02 = new Jogador("Arrascaeta", 90, 72);
		Jogador jogador03 = new Jogador("Pedro", 83, 80);
		Jogador jogador04 = new Jogador("Everton Ribeiro", 84, 58);
		Jogador jogador05 = new Jogador("Santos", 81, 75);
		Jogador jogador06 = new Jogador("David Luiz", 82, 70);
		Jogador jogador07 = new Jogador("Leo Pereira", 79, 100);
		Jogador jogador08 = new Jogador("Ayrton Lucas", 78, 80);
		Jogador jogador09 = new Jogador("Rodinei", 76, 100);
		Jogador jogador10 = new Jogador("Thiago Maia", 80, 68);
		Jogador jogador11 = new Jogador("Joao Gomes", 75, 100);
		Jogador jogador12 = new Jogador("Vidal", 81, 57);
		Jogador jogador13 = new Jogador("Filipe Luis", 78, 80);
		Jogador jogador14 = new Jogador("Everton Cebolinha", 84, 50);
		Jogador jogador15 = new Jogador("Marinho", 73, 68);
		
		
		PriorityQueue<Jogador> poupado = new PriorityQueue<Jogador>();
		
		
		poupado.add(jogador01);
		poupado.add(jogador02);
		poupado.add(jogador03);
		poupado.add(jogador04);
		poupado.add(jogador05);
		poupado.add(jogador06);
		poupado.add(jogador07);
		poupado.add(jogador08);
		poupado.add(jogador09);
		poupado.add(jogador10);
		poupado.add(jogador11);
		poupado.add(jogador12);
		poupado.add(jogador13);
		poupado.add(jogador14);
		poupado.add(jogador15);
		
		
		int escolha;
		int indice = 1;
		do {
			System.out.println("Bem vindo ao sistema de analise física do Clube de Regatas do Flamengo.\nEscolha a opção desejada:\n1-Condicionamento\n2-Adicionar Jogador\n0-Sair");
			escolha = scanner.nextInt();
			switch(escolha) {
				case 1:
					System.out.println("Jogadores(menor condicao -> melhor condicao de jogo: ");
					while(!poupado.isEmpty())
					{
						System.out.println(indice + "- " + poupado.remove());
						indice++;
					}
					poupado.add(jogador01);
					poupado.add(jogador02);
					poupado.add(jogador03);
					poupado.add(jogador04);
					poupado.add(jogador05);
					poupado.add(jogador06);
					poupado.add(jogador07);
					poupado.add(jogador08);
					poupado.add(jogador09);
					poupado.add(jogador10);
					poupado.add(jogador11);
					poupado.add(jogador12);
					poupado.add(jogador13);
					poupado.add(jogador14);
					poupado.add(jogador15);
					break;
				case 2:
					System.out.println("Inscreva um novo jogador:");
					System.out.println("Nome: ");
					String nomeJogador = scanner.next();
					System.out.println("Pontuacao: ");
					Integer pont = scanner.nextInt();
					Jogador novoJogador = new Jogador(nomeJogador, pont, 100);
					poupado.add(novoJogador);
					break;
				case 0:
					break;
			     	}
	
	     	}while(escolha != 0);
		scanner.close();
	}	

}
