package aluguel.services;
import aluguel.entities.Inquilino;
import java.util.Random;


public class GeradorInquilino {
    public String[] nomes = {
            "João Silva",
            "Maria Oliveira",
            "Pedro Santos",
            "Ana Souza",
            "Lucas Pereira",
            "Juliana Costa",
            "Gabriel Rodrigues",
            "Larissa Almeida",
            "Rafael Ferreira",
            "Camila Gomes",
            "Matheus Ribeiro",
            "Fernanda Carvalho",
            "Gustavo Martins",
            "Beatriz Rocha",
            "Thiago Lima",
            "Isabela Barbosa",
            "Bruno Araújo",
            "Amanda Melo",
            "Diego Cardoso",
            "Patrícia Nascimento"};
    public String []predios = {null,"Predio A", "Predio B","Predio C"};
    public String []blocos = {null,"Bloco 1","Bloco 2"};

    public GeradorInquilino() {}

     private Random random = new Random();

    public void gerarInquilinos(ListaInquilino listaInquilinos){
        for (int i = 0; i<5;i++) {
            int gerarNome = random.nextInt(1, nomes.length);
            int exPredio = random.nextInt(1, predios.length);
            int exBloco = random.nextInt(1, blocos.length);
            double aluguelPago = random.nextDouble(0, 2000);
            String nome = nomes[gerarNome];
            String predio = predios[exPredio];
            String bloco = blocos[exBloco];

        Inquilino inquilino = new Inquilino(nome,predio,bloco,aluguelPago);
        listaInquilinos.addInquilino(inquilino);  }}}
