import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		ValidadorSenha validador = new ValidadorSenha();
		
		System.out.print("Digite uma senha: ");
		String entradaSenha = scanner.nextLine();
		
		validador.setSenha(entradaSenha);
		
		if (validador.isSenhaValida()) {
			System.out.println("Senha válida");
		}else {
			System.out.println("Senha inválida!  Certifique-se de que:");
			System.out.println("- Tenha pelo menos 10 caracteres");
			System.out.println("- Contenha letras e digitos");
			System.out.println("- Tenha pelo menos 2 digitos");
		}
				
		scanner.close();

	}

}
