package application;

import java.util.ArrayList;
import java.util.Scanner;

import com.locadora.FilmesVO;

import entities.JogadoresVo;
import entities.TimesVo;

/*criar um menu

1-inserir time
2-deletar time
3-listar times */

public class ProgramTimes {
	public static void main(String[] args) {

		System.out.println("Olá !");

		Scanner sc = new Scanner(System.in);
		ArrayList<TimesVo> times = new ArrayList<TimesVo>();

		int opcaoLida = 0;

		while (opcaoLida != 4) {

			System.out.println("digite a opcao desejada");
			System.out.println("1-Inserir");
			System.out.println("2-Deletar");
			System.out.println("3-Listar");
			System.out.println("4-Sair");
			System.out.println("5-Adicionar jogadores");

			opcaoLida = sc.nextInt();

			if (opcaoLida == 1) {
				System.out.println("Digite o nome do time que deseja inserir: ");
				sc.nextLine();
				String nome = sc.next();

				System.out.println("Digite o ano do time que deseja inserir: ");
				int ano = sc.nextInt();

				TimesVo novoTime = new TimesVo(nome, ano);
				times.add(novoTime);

				System.out.println("Novo time adicionado!");
			}

			else if (opcaoLida == 2) {
				System.out.print("Digite o nome do time a ser removido: ");
				sc.nextLine();

				String nome = sc.nextLine();

				boolean encontrado = false;

				for (int i = 0; i < times.size(); i++) {

					if (times.get(i).getNome().equalsIgnoreCase(nome)) {
						times.remove(i);
						System.out.println("Time removido com sucesso.");
						encontrado = true;
						break;
					}
				}
				if (!encontrado) {
					System.out.println("Time com esse nome não foi encontrado.");
				}

			}

			if (opcaoLida == 3) {
				System.out.println("Times cadastrados: ");
				for (TimesVo time : times) {
					System.out.println("Nome: " + time.getNome() + " | Ano: " + time.getAno());
				}

			}
			/*
			 * 5-inserir jogadores ---dai pede o nome do jogador, idade, e o nome do time
			 * que ele vai ser adicionado (dai quando começar essa segunda parte dentro de
			 * TimesVO terá um ArrayList<JogadoresVO> jogadores;
			 */

			if (opcaoLida == 5) {
			    boolean encontrado = false;

			    System.out.print("Digite o nome do time ao qual deseja adicionar um jogador: ");
			    String nomeDoTime = sc.nextLine(); 
			    for (TimesVo times1 : times) {
			        if (times1.getNome().equalsIgnoreCase(nomeDoTime)) {
			            encontrado = true;

			            System.out.print("Digite o nome do jogador: ");
			            String nomeJogador = sc.nextLine(); 

			            System.out.print("Digite a idade do jogador: ");
			            int idade = sc.nextInt();
			            sc.nextLine(); 

			            JogadoresVo jogador = new JogadoresVo(nomeJogador, idade);
			            times1.adicionarJogador(jogador);

			            System.out.println("Jogador adicionado com sucesso!");
			            break;
			        }
			    }

			    if (!encontrado) {
			        System.out.println("Time não encontrado.");
			    }
			}


		}
		sc.close();
	}

}
