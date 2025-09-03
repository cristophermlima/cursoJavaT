// Pacote onde está o programa principal
package application;

// Importa classes necessárias
import java.util.ArrayList; // Lista dinâmica (pode crescer conforme necessário)
import java.util.Scanner;   // Para ler dados digitados pelo usuário

// Importa as classes criadas por você
import entities.JogadoresVo; // Classe que representa um jogador
import entities.TimesVo;     // Classe que representa um time

/* Objetivo:
 * Criar um menu com as seguintes opções:
 * 1 - Inserir time
 * 2 - Deletar time
 * 3 - Listar times
 * 4 - Sair
 * 5 - Adicionar jogadores ao time
 */
public class ProgramTimes {
	public static void main(String[] args) {

		System.out.println("Olá !");

		// Scanner para ler entradas do usuário pelo teclado
		Scanner sc = new Scanner(System.in);

		// Lista que armazena os times cadastrados
		ArrayList<TimesVo> times = new ArrayList<TimesVo>();

		// Variável que vai armazenar a opção digitada pelo usuário
		int opcaoLida = 0;

		// Enquanto a opção não for "4" (sair), o programa continua rodando
		while (opcaoLida != 4) {

			// Exibe o menu de opções
			System.out.println("digite a opcao desejada");
			System.out.println("1-Inserir");
			System.out.println("2-Deletar");
			System.out.println("3-Listar");
			System.out.println("4-Sair");
			System.out.println("5-Adicionar jogadores");

			// Lê a opção do usuário
			opcaoLida = sc.nextInt();
			sc.nextLine(); // Limpa o buffer (evita pular entradas com nextLine)

			// Opção 1 - Inserir novo time
			if (opcaoLida == 1) {
				System.out.println("Digite o nome do time que deseja inserir: ");
				String nome = sc.next(); // Lê o nome do time (sem espaços)
				sc.nextLine(); // Limpa o ENTER pendente

				System.out.println("Digite o ano do time que deseja inserir: ");
				int ano = sc.nextInt(); // Lê o ano do time
				sc.nextLine(); // Limpa o ENTER pendente

				// Cria um novo objeto Time com os dados lidos
				TimesVo novoTime = new TimesVo(nome, ano);

				// Adiciona o time à lista
				times.add(novoTime);

				System.out.println("Novo time adicionado!");
			}

			// Opção 2 - Deletar time pelo nome
			else if (opcaoLida == 2) {
				System.out.print("Digite o nome do time a ser removido: ");
				sc.nextLine(); // Limpa o ENTER pendente
				String nome = sc.nextLine(); // Lê o nome completo do time

				boolean encontrado = false;

				// Procura o time na lista
				for (int i = 0; i < times.size(); i++) {
					if (times.get(i).getNome().equalsIgnoreCase(nome)) {
						// Remove o time da lista
						times.remove(i);
						System.out.println("Time removido com sucesso.");
						encontrado = true;
						break;
					}
				}

				// Se não encontrou nenhum time com o nome digitado
				if (!encontrado) {
					System.out.println("Time com esse nome não foi encontrado.");
				}
			}

			// Opção 3 - Listar todos os times cadastrados
			if (opcaoLida == 3) {
				System.out.println("Times cadastrados: ");
				for (TimesVo time : times) {
					// Exibe nome e ano de cada time
					System.out.println("Nome: " + time.getNome() + " | Ano: " + time.getAno());
				}
			}

			/*
			 * Opção 5 - Adicionar jogadores
			 * Aqui o usuário informa o nome do time, e se ele existir,
			 * será possível adicionar um jogador com nome e idade
			 */
			if (opcaoLida == 5) {
				boolean encontrado = false;

				System.out.print("Digite o nome do time ao qual deseja adicionar um jogador: ");
				String nomeDoTime = sc.nextLine(); // Lê o nome completo do time

				// Procura o time pelo nome
				for (TimesVo times1 : times) {
					if (times1.getNome().equalsIgnoreCase(nomeDoTime)) {
						encontrado = true;

						// Lê os dados do jogador
						System.out.print("Digite o nome do jogador: ");
						String nomeJogador = sc.nextLine();

						System.out.print("Digite a idade do jogador: ");
						int idade = sc.nextInt();
						sc.nextLine(); // Limpa o ENTER pendente

						// Cria o jogador e adiciona ao time
						JogadoresVo jogador = new JogadoresVo(nomeJogador, idade);
						times1.adicionarJogador(jogador);

						System.out.println("Jogador adicionado com sucesso!");
						break;
					}
				}

				// Se o time não foi encontrado
				if (!encontrado) {
					System.out.println("Time não encontrado.");
				}
			}
		}

		// Fecha o scanner ao final do programa
		sc.close();
	}
}
