import java.util.ArrayList;
import java.util.Scanner;

class Cliente {

    String nome;
    int idade;
    String telefone;

    Cliente(String nome, int idade, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }
}


public class Main {

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n=== CADASTRO DE CLIENTES ===");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");

            opcao = entrada.nextInt();
            entrada.nextLine();


            if(opcao == 1){

                System.out.print("Nome: ");
                String nome = entrada.nextLine();

                System.out.print("Idade: ");
                int idade = entrada.nextInt();
                entrada.nextLine();

                System.out.print("Telefone: ");
                String telefone = entrada.nextLine();


                Cliente cliente = new Cliente(nome, idade, telefone);

                clientes.add(cliente);

                System.out.println("Cliente cadastrado com sucesso!");

            } else if(opcao == 2){

                System.out.println("\n--- Lista de Clientes ---");

                for(Cliente cliente : clientes){

                    System.out.println("Nome: " + cliente.nome);
                    System.out.println("Idade: " + cliente.idade);
                    System.out.println("Telefone: " + cliente.telefone);
                    System.out.println("--------------------");
                }

            }

        } while(opcao != 3);


        System.out.println("Programa encerrado!");

        entrada.close();

    }
}
