import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //<ARRAY> DE OBJETOS
        Cliente[] clientes = new Cliente[3];

        //MENU DE CLIENTES
        int opcao;
        do{ // INICIA A CONDIÇÃO PRIMEIRO
            System.out.println("""
                    Selcione a opção:
                     
                    1 - Cadastro de cliente.
                    2 - Listar Clientes.
                    3 - Buscar Clientes.
                    4 - Alterar Clientes.
                    5 - Remover Clientes.
                    6 - sair.
                    """);
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao){
                case 1:
                    //CADASTRO DAS VARIÁVEIS
                    for(int i = 0; i < clientes.length; i++){ // LEITURA DE CADA VARIÁVEL DENTRO DO ARRAY .LENGTH

                        System.out.println("Digite o nome do cliente: ");
                        String nome = input.nextLine();

                        System.out.println("Digite a idade do cliente: ");
                        int idade = input.nextInt();
                        input.nextLine();

                        System.out.println("Digite a cidade do cliente: ");
                        String cidade = input.nextLine();

                        clientes[i] = new Cliente(nome,idade,cidade);//INSERÇÃO DOS NOVOS DADOS DENTRO DO ARRAY
                    }
                    break;

                case 2:
                    //EXIBIÇÃO
                    for(int i = 0; i < clientes.length; i++){
                        clientes[i].exibirDados();
                    }

                    break;

                case 3:
                    //BUSCA DE CLIENTE
                    System.out.println("Deseja encontrar dados de algum cliente? digite o nome:" );
                    String busca = input.nextLine();
                    boolean encontrado = false;// VERIFICAÇÃO DA BUSCA SE ENCONITROU OU NÃO

                    for(int i = 0; i < clientes.length; i++){// PERCORRENDO O ARRAY

                        if (clientes[i].getNome().equals(busca)) {//BUSCANDO A QUANTIDADE DO ELEMENTO NO ARRAY

                            clientes[i].exibirDados();
                            encontrado = true;//CONDIÇÃO DE ENCONTRAMENTO DA CONDIÇÃO DE BUSCA
                        }
                    }
                    if(!encontrado){//CONDIÇÃO DE NÃO ENCONTRADO
                        System.out.println("Nenhum cliente encontrado.");
                    }

                    break;

                case 4: //ALTERAÇÃO DE CLIENTE
                    System.out.println("Digite o nome do cliente que deseja alterar: ");
                    String buscaAl = input.nextLine();//BUSCANDO PELO NOME
                    boolean alterado = false;// A VARIÁVEL COMO NÃO ENCONTRADA NO ARRAY

                    for(int i = 0; i < clientes.length; i++){//PERCORRENDO O ARRAY

                        if(clientes[i] !=  null && clientes[i].getNome().equals(buscaAl)){// VERIFICANDO SE CONTÉM ALGO VAZIO E COMPARANDO BUSCA

                            System.out.println("Digite o novo nome do cliente: ");
                            String nome = input.nextLine();

                            System.out.println("Digite a nova idade o Cliente: ");
                            int idade = input.nextInt();
                            input.nextLine();

                            System.out.println("Digite a cidade: ");
                            String cidade = input.nextLine();

                            alterado = true;//VARIAVEL ENCONTRADA NO ARRAY E ALTERADA
                            clientes[i] = new Cliente(nome,idade,cidade);
                        }
                    }
                    if(!alterado){//VARIÁVLE NÃO ENCONTRDA (! SIGNIFICA NEGAÇÃO/NÃO)
                        System.out.println("Nenhum cliente alterado.");
                    }
                    break;
                case 5://REMOVER CLIENTE
                    System.out.println("Digite o nome do cliente que deseja remover: ");
                    String buscaRemo = input.nextLine();
                    boolean removido = false;//VERIFICAÇÃO DA VARIÁVEL

                    for(int i = 0; i < clientes.length; i++){
                        if(clientes[i] != null && clientes[i].getNome().equals(buscaRemo)){//VERIFICANDO SE ESTÁ VAZIO E COMPARANDO

                            clientes[i] = null;//REMOVENDO CLIENTE
                            removido = true;//VERIFICAÇÃO DA VARIÁVEL
                            System.out.println("cliente removido com sucesso.");

                        }
                    }
                    if(!removido){//NÃO REMOVIDO
                        System.out.println("Nenhum cliente removido.");
                    }
                    break;
            }
        }while(opcao != 6);
    }
}