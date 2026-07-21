package aluguel.application;
import aluguel.services.GeradorInquilino;
import aluguel.services.ListaInquilino;

import java.util.InputMismatchException;
import java.util.Scanner;
// Aqui fica apenas o fluxo do programa
public class Main {
    public static void main(String[]args){
        //Intâncias
        ListaInquilino listaInquilinos = new ListaInquilino();
        GeradorInquilino gerador = new GeradorInquilino();
        Scanner scan = new Scanner(System.in);

        int loop = 0;
        // Gera automaticamente os moradores
        gerador.gerarInquilinos(listaInquilinos);

        do {
            System.out.println("(1)Consultar morardores (2)Pesquisar morador 3 sair");
            // Inicia a caça ao erros
            try {
                int opcao = scan.nextInt();
                scan.nextLine();
            if (opcao == 1) {
                // Exibi a lista gerada
                listaInquilinos.exibirInquilinos();
                loop = opcao;
            } else if (opcao == 2) {
                //Pesquisa o morador
                System.out.println("infomorme o nome do morador: ");
                String nome = scan.nextLine().trim();
                listaInquilinos.pesquisarPornome(nome);
                loop = opcao;
            } else if (opcao == 3) {
                // Fecha o programa
                System.out.println("Fechando Programa....");
                loop = opcao;
            } else{
                   System.out.println("digite uma opção valida!");
                }
        // Trantando completamente o erro sem interromper o loop
        }catch (InputMismatchException e){
                scan.nextLine();
                //Alerta e guia o usuário
                System.out.println("digite uma opção valida!");
                System.out.println("apenas os numeros informados");
                System.out.println( );

                System.out.println("##### ↓ Conferindo erro ↓ #####");
                System.out.flush(); // força a impreção imediata
                // Informa onde o erro ocorreu
                e.printStackTrace(System.out); // defini a ordem da saida
                System.out.flush();

                System.out.println("################################");
                System.out.println( );
                //Reseta o loop
                loop = 0;
            }
        } while (!(loop == 3)); //Mantém o programa funcionando
    }
}
