        package aluguel.services;

        import java.util.ArrayList;
        import java.util.List;
        import aluguel.entities.Inquilino;

        public class ListaInquilino {
            List<Inquilino> Inquilinos = new ArrayList<>();
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

            public void pesquisarPornome(String nome){
                for (Inquilino inquilino : Inquilinos){
                    if (inquilino.getNome().trim().equalsIgnoreCase(nome)){
                        System.out.println("############"+" "+"dados solicitados"+" "+"###########");
                        System.out.println(inquilino);
                        System.out.println("####################################");
                    }
                }

            }
        }
