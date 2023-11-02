package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner sc =  new Scanner (System.in); //Configurando entrada de dados
        Boolean flag = true; //Flag para o menu
        Arquivo arquivo = new Arquivo(); //Criando o arquivo
        ArrayList<Produto> produtosArray = new ArrayList<>(); //Array de Produtos

        while(flag){
            //Configurando as opções do menu
            System.out.println("--- MENU ---");
            System.out.println("1 - Adicionar Produto no Arquivo");
            System.out.println("2 - Mostrar informações do Arquivo");
            System.out.println("3 - Ordenar produto em ordem decrescente de preço");
            System.out.println("4 - Quantidade de produtos de cada tipo");
            System.out.println("5 - Sair do Menu");

            //Operador do Menu
            int op = sc.nextInt();
            switch (op) {

                case 1: //Adicionando um novo Produto no arquivo
                    System.out.println("--- Adicionando Produto ---");
                    //Entrando com o nome do Produto
                    System.out.print("Entre com o nome do Produto: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    try {

                        //Entrando com o preço do Produto
                        System.out.print("Entre com o preço do Produto: ");
                        double preco;
                        preco = sc.nextDouble();

                        //Verifiando se o preço é valido
                        if (preco > 0) {
                            //Se for válido, continua o código normalmente
                        }else {
                            throw new InfoInvalidaException("Preço inválido!");
                            //Inválido, ativa a exception que para a execução dessa parte, voltando para o menu
                        }

                        //Entrando com o gênero do Produto
                        System.out.print("Entre com o tipo do Produto: ");
                        sc.nextLine();
                        String tipo = sc.nextLine();

                        //Criando o Produto, escrevendo no arquivo e adicionando ao Array
                        Produto p1 = new Produto(nome, preco, tipo);
                        arquivo.escrever(p1);
                        System.out.println("Produto adicionado com sucesso!");

                    } catch (InfoInvalidaException e) {
                        System.out.println("Preço inválido! Tente denovo.");
                        break;
                    }
                    break;

                case  2:
                    //Lendo o arquivo e adicionando no array de leitura
                    produtosArray = arquivo.ler();
                    //Mostrando os dados do arquivo
                    System.out.println("--- Lista de Produtos ---");
                    for (int i = 0; i < produtosArray.size(); i++) {
                        System.out.println("Nome do produto: " + produtosArray.get(i).getNome());
                        System.out.println("Preco do produto: " + produtosArray.get(i).getPreco());
                        System.out.println("Genero do produto: " + produtosArray.get(i).getTipo());
                        System.out.println("-------------------");
                    }
                    break;
                case 3:
                    //Usando o arquivo de criação dos produtos para mostrar ordenado de maneira decrescente de preço
                    Collections.sort(produtosArray);
                    System.out.println("--- Lista de Produto ---");
                    for (int i = 0; i < produtosArray.size(); i++) {
                        System.out.println("Nome do produto: " + produtosArray.get(i).getNome());
                        System.out.println("Preco do produto: " + produtosArray.get(i).getPreco());
                        System.out.println("Genero do produto: " + produtosArray.get(i).getTipo());
                        System.out.println("-------------------");
                    }
                    break;
                case 4:
                    int com = 0, hig = 0, dec = 0;
                    for (int i = 0; i < produtosArray.size(); i++) {

                        if(produtosArray.get(i).getTipo().equals("Comida")){
                            com++;
                        }

                        if(produtosArray.get(i).getTipo().equals("Higiene")){
                            hig++;
                        }

                        if(produtosArray.get(i).getTipo().equals("Decoração")){
                            dec++;
                        }
                    }

                    System.out.println("--- Quantidade de produtos ---");
                    System.out.println("Produtos de Comida: " + com);
                    System.out.println("Produtos de Higiene: " + hig);
                    System.out.println("Produtos de Decoração: " + dec);
                    System.out.println("-------------------");
                    break;
                case 5:
                    //Opção de sair do menu, finalizando o código
                    flag = false;
                    break;
                default:
                    //Default padrão
                    System.out.println("Entre com uma opção válida");
                    break;
            }
        }

    }
}