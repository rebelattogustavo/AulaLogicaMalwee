package br.com.senai;

import java.util.Scanner;

public class JohnatanLindo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String opcao = "s";
		int opcaoDoMenu;

		do {
			System.out.println("---MENU---");
			System.out.println("1 - Verificar sexo e idade");
			System.out.println("2 - Contagem de valores");
			System.out.println("3 - Tabuada");
			System.out.println("4 - Cadastrar cursos");
			System.out.println("------------");
			System.out.print("Informe a op��o desejada: ");
			opcaoDoMenu = tec.nextInt();
			switch (opcaoDoMenu) {
			case 1:
				System.out.println("---VERIFICADOR SEXO E IDADE---");
				System.out.print("Informe seu nome: ");
				String Nome = tec.next();
				System.out.print("Informe seu ano de nascimento: ");
				int anoDeNascimento = tec.nextInt();
				System.out.print("Informe seu sexo [M/F]: ");
				String sexo = tec.next();
				if (sexo.equals("m")) {
					System.out.println("Seu sexo � masculino");
				} else if (sexo.equals("f")) {
					System.out.println("Seu sexo � feminino");
				} else {
					System.out.println("Op��o inv�lida");
				}
				int idade = (2021 - anoDeNascimento);
				System.out.println("Voc� tem " + idade + " anos de idade");
				if (idade < 12) {
					System.out.println("Voc� � ciran�a");
				} else if (idade >= 12 && idade < 18) {
					System.out.println("Voc� � jovem");
				} else if (idade >= 18 && idade <= 65) {
					System.out.println("Voc� � adulto");
				} else if (idade > 65) {
					System.out.println("Voc� � idoso");
				} else if (idade < 16) {
					System.out.println("Voc� n�o pode votar");
				} else if (idade >= 16 && idade < 18 && idade >= 70) {
					System.out.println("Seu voto � opcional");
				} else if (idade >= 18 && idade < 70) {
					System.out.println("Seu voto � obrigat�rio");
				}

				if (idade < 18) {
					System.out.println("Voc� ainda n�o pode tirar a habilita��o ");
				} else {
					System.out.println("Voc� j� pode tirar habilita��o");
				}
				System.out.print("Deseja realizar outra opera��o?[S/N]: ");
				opcao = tec.next();
				break;
			case 2:
				System.out.println("---CONTAGEM DE VALORES---");
				System.out.print("Informe o primeiro valor inteiro: ");
				int primeiroValor = tec.nextInt();
				System.out.print("Informe o segundo valor inteiro: ");
				int segundoValor = tec.nextInt();

				if (primeiroValor < segundoValor) {
					while (primeiroValor <= segundoValor) {
						System.out.println(primeiroValor);
						primeiroValor = primeiroValor + 1;
					}
				} else if (segundoValor < primeiroValor) {
					while (segundoValor <= primeiroValor) {
						System.out.println(segundoValor);
						segundoValor = segundoValor + 1;
					}
				} else {
					System.out.println("Valores iguais, tente novamente!!");
				}

				System.out.print("Deseja realizar outra opera��o?[S/N]: ");
				opcao = tec.next();

				break;
			case 3:
				System.out.println("---Tabuada---");
				int valor;
				int multiplicador = 0;
				System.out.print("Informe um valor inteiro: ");
				valor = tec.nextInt();

				do {
					System.out.println(valor + " x " + multiplicador + " = " + (valor * multiplicador));
					multiplicador++;
				} while (multiplicador <= 10);

				System.out.print("Deseja realizar outra opera��o?[S/N]: ");
				opcao = tec.next();

				break;

			case 4:
				String[] cursos = new String[5];
				String inserirCurso = "s";
				int aux = 0;
				System.out.println("4 - Cadastrar cursos");
				System.out.println(" ");
				while (inserirCurso.equalsIgnoreCase("s") && aux < 5) {
					System.out.print("Informe o curso: ");
					cursos[aux] = tec.next();
					aux++;
					if (aux < 5) {

						System.out.print("Deseja inseir outro curso? [S/N]: ");
						inserirCurso = tec.next();
					}
					else {}
				}
				System.out.print("CURSOS:");
				System.out.println(
						cursos[0] + "," + cursos[1] + "," + cursos[2] + "," + cursos[3] + "," + cursos[4] + ".");

				System.out.println("------");
				System.out.print("Deseja realizar outra opera��o?[S/N]: ");
				opcao = tec.next();

				break;

			default:
				System.out.println("Op��o inv�lida. ");

				break;
			}

		} while (opcao.equalsIgnoreCase("s"));

		System.out.println("Sistema finalizado.");

	}

}
