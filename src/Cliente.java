import java.util.ArrayList;

public class Cliente extends Pessoa implements IPessoa{
    private String sexo;
    private String num;
    private String Email;
    //RC = Registro do Cliente

    private static ArrayList<Cliente> clientes = new ArrayList<>();

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

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

    public static int maiorIdade(){
        int i=0;
        for (Cliente c : clientes){
            if (Integer.parseInt(c.getIdade())>i){
                i = Integer.parseInt(c.getIdade());
            }
        }
        return i;
    }

    public static void maiorIdade2(){
        for (Cliente c : Cliente.getClientes()){
            if (Integer.parseInt(c.getIdade())== maiorIdade()){
                System.out.println("O cliente com maior idade é: " + c.getNome() + " | " + c.getIdade());
            }
        }
    }

    public static int menorIdade(){
        int a = Integer.parseInt(Cliente.getClientes().getFirst().getIdade());
        for (Cliente c : clientes){
            if (Integer.parseInt(c.getIdade())<a){
                a = Integer.parseInt(c.getIdade());
            }
        }
        return a;
    }

    public static void menorIdade2(){
        for (Cliente c : Cliente.getClientes()){
            if (Integer.parseInt(c.getIdade())== menorIdade()){
                System.out.println("O cliente com menor idade é: " + c.getNome() + " | " + c.getIdade());
            }
        }
    }

    public static int mais60() {
        int i = 0;
        for (Cliente c : clientes){
            if (Integer.parseInt(c.getIdade())>60){
                i++;
            }
        }
        return i;
    }

    public static int menor18(){
        int a = 0;
        for (Cliente c : clientes){
            if (Integer.parseInt(c.getIdade())<18){
                a++;
            }
        }
        return a;
    }

    public static float media(){
        float a = 0;
        for (Cliente c : clientes){
            a += Float.parseFloat(c.getIdade());
        }
        return a/clientes.size();
    }
}
