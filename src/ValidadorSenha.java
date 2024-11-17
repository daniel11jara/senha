
public class ValidadorSenha {
    private String senha;

    // Setter para armazenar a senha
    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Método para verificar se a senha é válida
    public boolean isSenhaValida() {
        if (senha == null || senha.length() < 10) {
            return false;
        }

        int contadorDigitos = 0;

        for (char c : senha.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false; // Contém um caractere inválido
            }
            if (Character.isDigit(c)) {
                contadorDigitos++;
            }
        }

        return contadorDigitos >= 2; // Verifica se há pelo menos dois dígitos
    }
    
}
