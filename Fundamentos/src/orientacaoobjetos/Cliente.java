package orientacaoobjetos;

public class Cliente implements AluguelFilme, CadastroCliente{
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        if (this.email==null) {
            return "Cliente{" + "nome=" + nome +'}';
        } else {
            return "Cliente{" + "nome=" + nome + ", email=" + email + '}';
        }
        
        
    }
    /**
     * Calcula o valor total da locação do filme
     * Regra para filmes comuns
     * @param qtdeDias
     * @return 
     */
    public double calcularlocacao(int qtdeDias){
        return qtdeDias * VALOR_FILME_SIMPLES;
    }
    public double calcularlocacao(int qtdeDias, boolean lancamento){
        return qtdeDias * VALOR_FILME_LANCAMENTO;
    }

    @Override
    public boolean validarNome(String nome) {
        if (nome.length() > 7 ) {
            System.out.println("Nxmx" + nome + "dx Clxxntx x vxlxdx");
            return true;
        } else {
            System.out.println("Nxmx" + nome + "dx Clxxntx x xnvxlxdx");
            return false;
        }
        
    }

    @Override
    public boolean verificarEmailDominioGoogle(String email) {
        if (email == null) {
            return false;
        }
        if (email.contains("@gmail.com")) {
            System.out.println("x xmxxl" + email + "x dx gxxglx");
            return true;
        } else {
            System.out.println("x xmxxl" + email + " nxx x dx gxxglx");
            return false;
        }
    }
    
}
