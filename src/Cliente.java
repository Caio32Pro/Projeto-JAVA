public class Cliente extends Pessoa implements IPessoa{
    private String RC;
    //RC = Registro do Cliente

    @Override
    public void exibir() {
        System.out.println(getNome());
        System.out.println(RC);
        System.out.println(getIdade());
    }

    public Cliente(String nome, int idade, String RC) {
        super(nome, idade);
        this.RC = RC;
    }

    public String getRC() {
        return RC;
    }

    public void setRC(String RC) {
        this.RC = RC;
    }
}
