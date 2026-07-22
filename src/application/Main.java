package src.application;
import src.services.GeradorInquilino;
import src.services.ListaInquilino;
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
            System.out.println("(1)Consultar morardores (2) Pesquisa morador");
            System.out.println("(3) Altera dados (4) Sair");
            // Inicia a caça ao erros
            try {
                int opcao = scan.nextInt();
                scan.nextLine();
            if (opcao == 1) {
                // Exibi a lista gerada
                listaInquilinos.exibirInquilinos();
                scan.nextLine();
                loop = opcao;
            } else if (opcao == 2) {
                //Pesquisa o morador
                listaInquilinos.pesquisaMorador();
                loop = opcao;
                scan.nextLine();
            } else if (opcao == 3) { //  alterar/remover
                // a finalizar
                loop = opcao;
                scan.nextLine();
            } else if (opcao == 4) {
                // Fecha o programa
                System.out.println("Fechando Programa....");
                loop = opcao;
            } else{
                   System.out.println("digite uma opção valida!");
                }
        // Tranta completamente o erro sem interromper o loop
        }catch (InputMismatchException e){
                scan.nextLine();
                //Alerta e guia o usuário
                System.out.println("digite uma opção valida!");
                System.out.println("apenas os numeros informados");
                System.out.println( );

                System.out.println("##### ↓ Conferindo erro ↓ #####");
                System.out.flush(); // força a impreção imediata
                // Informa onde o erro ocorreu
                // sem quebrar
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
