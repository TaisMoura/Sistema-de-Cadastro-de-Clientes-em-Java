import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n=== SISTEMA DE CADASTRO DE CLIENTES ===");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Buscar cliente");
            System.out.println("4 - Atualizar cliente");
            System.out.println("5 - Remover cliente");
            System.out.println("6 - Sair");
            System.out.print("Escolha: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {

                case 1:

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

                    break;

                case 2:

                    System.out.println("\n--- Lista de Clientes ---");

                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {

                        for (Cliente clienteAtual : clientes) {

                            System.out.println("Nome: " + clienteAtual.getNome());
                            System.out.println("Idade: " + clienteAtual.getIdade());
                            System.out.println("Telefone: " + clienteAtual.getTelefone());
                            System.out.println("--------------------");
                        }
                    }

                    break;

                case 3:

                    System.out.print("Digite o nome do cliente: ");
                    String nomeBusca = entrada.nextLine();

                    boolean encontrado = false;

                    for (Cliente clienteAtual : clientes) {

                        if (clienteAtual.getNome().equalsIgnoreCase(nomeBusca)) {

                            System.out.println("\nCliente encontrado!");
                            System.out.println("Nome: " + clienteAtual.getNome());
                            System.out.println("Idade: " + clienteAtual.getIdade());
                            System.out.println("Telefone: " + clienteAtual.getTelefone());

                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Cliente não encontrado.");
                    }

                    break;

                case 4:

                    System.out.print("Digite o nome do cliente que deseja atualizar: ");
                    String nomeAtualizar = entrada.nextLine();

                    boolean atualizado = false;

                    for (Cliente clienteAtual : clientes) {

                        if (clienteAtual.getNome().equalsIgnoreCase(nomeAtualizar)) {

                            System.out.print("Novo nome: ");
                            String novoNome = entrada.nextLine();

                            System.out.print("Nova idade: ");
                            int novaIdade = entrada.nextInt();
                            entrada.nextLine();

                            System.out.print("Novo telefone: ");
                            String novoTelefone = entrada.nextLine();

                            clienteAtual.setNome(novoNome);
                            clienteAtual.setIdade(novaIdade);
                            clienteAtual.setTelefone(novoTelefone);

                            System.out.println("Cliente atualizado com sucesso!");

                            atualizado = true;
                            break;
                        }
                    }

                    if (!atualizado) {
                        System.out.println("Cliente não encontrado.");
                    }

                    break;

                case 5:

                    System.out.print("Digite o nome do cliente que deseja remover: ");
                    String nomeRemover = entrada.nextLine();

                    boolean removido = false;

                    for (int i = 0; i < clientes.size(); i++) {

                        if (clientes.get(i).getNome().equalsIgnoreCase(nomeRemover)) {

                            clientes.remove(i);

                            System.out.println("Cliente removido com sucesso!");

                            removido = true;
                            break;
                        }
                    }

                    if (!removido) {
                        System.out.println("Cliente não encontrado.");
                    }

                    break;

                case 6:

                    System.out.println("Programa encerrado!");

                    break;

                default:

                    System.out.println("Opção inválida.");

                    break;
            }

        } while (opcao != 6);

        entrada.close();
    }
}
