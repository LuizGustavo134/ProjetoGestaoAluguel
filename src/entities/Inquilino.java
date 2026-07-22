    package src.entities;

    public class Inquilino {
        private String nome;
        private String predio;
        private String bloco;
        private double aluguelValor = 900;
        private double aluguelPago;
        private String aluguelStatus;
        private final String AVISO1 = "Débitos em dia!";
        private final String AVISO2 = "Pagamento incompleto";

        public Inquilino() {}

        public Inquilino(String nome, String predio, String bloco, double aluguelPago, String aluguelStatus) {
            this.nome = nome;
            this.predio = predio;
            this.bloco = bloco;
            this.aluguelPago = aluguelPago;
            this.aluguelStatus = aluguelStatus;// preciso adiciona esse valor
        }
        public Inquilino(String nome, String predio, String bloco, double aluguelPago) {
            this.nome = nome;
            this.predio = predio;
            this.bloco = bloco;
            this.aluguelPago = aluguelPago;
        }

        public String definir_status(){
            if (aluguelPago > 900 || aluguelPago == 900){
                aluguelStatus = AVISO1;
            } else{
                aluguelStatus = AVISO2;
            }
            return aluguelStatus;
        }
        @Override
        public String toString(){
         return "==========Inquilino==============\n"
         +nome +" \n"
         +predio+" \n"+
          bloco+" \n"+
         "Valor cobrado:\n"+
          aluguelValor+" \n"
          +"Valor pago: \n"
          +String.format("%.2f", aluguelPago)+" \n"
          +"Situação atual: \n"
          +definir_status(); // incompleto
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getPredio() {
            return predio;
        }

        public void setPredio(String predio) {
            this.predio = predio;
        }

        public String getBloco() {
            return bloco;
        }

        public void setBloco(String bloco) {
            this.bloco = bloco;
        }

        public double getAluguelValor() {
            return aluguelValor;
        }

        public void setAluguelValor(double aluguelValor) {
            this.aluguelValor = aluguelValor;
        }

        public double getAluguelPago() {
            return aluguelPago;
        }

        public void setAluguelPago(double aluguelPago) {
            this.aluguelPago = aluguelPago;
        }

        public String getAluguelStatus() {
            return aluguelStatus;
        }

        public void setAluguelStatus(String aluguelStatus) {
            this.aluguelStatus = aluguelStatus;
        }
    }
