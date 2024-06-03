import java.util.ArrayList;

public class Funcionario extends Pessoa implements IPessoa{
    private String sexo;
    private String numero;
    private String email;
    //RF = Registro do Funcionário

    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    @Override
    public void exibir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Telefone: " + getNumero());
        System.out.println("Email: " + getEmail());
    }

    public Funcionario(String nome, String idade, String sexo, String numero, String email) throws IllegalArgumentException{
        super(nome, idade);

        int idadeCliente = Integer.parseInt(getIdade());
        if (idadeCliente<18){
            throw new IllegalArgumentException("Funcionários não podem ser cadastrados menores de 18 anos");
        }
        this.sexo = sexo;
        this.numero = numero;
        this.email = email;
    }

    public static ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void excluirFuncionario() {
        System.out.println("Funcionário " + getNome() + " excluído.");
    }
}
