        package src.services;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

        import src.entities.Inquilino;

        public class ListaInquilino {
            List<Inquilino> Inquilinos = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            public ListaInquilino(){}
            public ListaInquilino(List<Inquilino> Inquilinos) {
                this.Inquilinos = Inquilinos;
            }

            public void addInquilino(Inquilino inquilino){
                Inquilinos.add(inquilino);
            }
            public void exibirInquilinos() {
                for (Inquilino inquilino : Inquilinos) {
                    System.out.println(inquilino);}}

            public void pesquisaMorador(){
                System.out.println("infomorme o nome do morador ou ID ");
                System.out.println("*Para nome digite qualquer numero*");
                System.out.println("ID: ");
                 int Id_Morador = scan.nextInt();
                scan.nextLine();
                System.out.println("*caso tenha informado id aperte enter*");
                System.out.printf("Nome completo: ");
                String nome = scan.nextLine();

                for (Inquilino inquilino : Inquilinos){
                    if (inquilino.getId_morador() == Id_Morador){
                        System.out.println(inquilino);
                    }else if  (inquilino.getNome().trim().equalsIgnoreCase(nome) && (!(nome == null)) ){
                        System.out.println(inquilino);
                    }
                }

            } public void AlteraValor(){ // a finalizar
                System.out.println("infomorme o ID do morador: ");
                int Id_Morador = scan.nextInt();
                for (Inquilino inquilino : Inquilinos){
                    if (inquilino.getId_morador() == Id_Morador){
                        System.out.println(inquilino);
                        System.out.println("O que deseja alterar? ");
                        System.out.println("(1) nome (2) Predio (3) bloco");
                    }
                }
            }
        }

