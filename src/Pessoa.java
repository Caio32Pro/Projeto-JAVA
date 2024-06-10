public abstract class Pessoa {
    private String nome;
    private String idade;

    public Pessoa(String nome, String idade) {
        this.nome = nome;
        try {
            if (Integer.parseInt(idade)<0){
                throw new IllegalArgumentException();
            }
            else {
                this.idade = idade;
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Digite uma idade válida");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
