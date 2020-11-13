package tela_login;

import java.util.Scanner;

public class AcessarSistema {

	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Digite o seu usuário: ");
			String login = in.nextLine();
				
			System.out.println("Digite a sua senha: ");
			String senha = in.nextLine();
			
			if (login.equals("samiracodes")&& senha.equals("admin")){
				System.out.printf("Usuário logado com sucesso.", login);
			}
			else {
				System.out.println("Usuário ou senha inválido.");
			}
		}
	}

}
