public class Funcionario extends Pessoa implements IPessoa{
    private int RF;
    //RF = Registro do Funcionário

    @Override
    public void exibir() {

    }

    public Funcionario(String nome, int idade, int RF) {
        super(nome, idade);
        this.RF = RF;
    }

    public int getRF() {
        return RF;
    }

    public void setRF(int RF) {
        this.RF = RF;
    }
}
