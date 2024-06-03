public class Cliente extends Pessoa implements IPessoa{
    private String sexo;
    private String num;
    private String Email;
    //RC = Registro do Cliente

    @Override
    public void exibir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("sexo: " + getSexo());
        System.out.println("telefone: " + getNum());
        System.out.println("Email: " + getEmail());
    }

    public Cliente(String nome, String idade, String sexo, String num, String Email){
        super(nome, idade);
        this.Email = Email;
        this.num = num;
        this.sexo = sexo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void excluirCliente() {
        System.out.println("Cliente " + getNome() + " excluído.");
    }
}
