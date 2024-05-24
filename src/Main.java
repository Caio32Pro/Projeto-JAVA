import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList <Pessoa> pessoa = new ArrayList<>();
        ArrayList <Produto> produtos =  new ArrayList<>();

        Funcionario func1 = new Funcionario("Ray", 17, 1243);
        Funcionario func2 = new Funcionario("Samuel Sabadin", 16, 1423);
        Funcionario func3 = new Funcionario("Lucas Antunes", 17, 1324);
        Funcionario func4 = new Funcionario("Lucas Bachega", 16, 1234);

        Cliente cliente1 = new Cliente("Danilo", 16, "374-1");
        Cliente cliente2 = new Cliente("Lavínia", 16, "927-3");
        Cliente cliente3 = new Cliente("Helena", 16, "328-2");
        Cliente cliente4 = new Cliente("Catarine", 16, "957-2");

        Produto prod1 =  new Produto("Pão doce", "pão doce", 6.99, 6574, "doces");
        System.out.println("Seja bem-vindo(a) a Padaria Universo");




    }
}