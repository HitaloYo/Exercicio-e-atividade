package Atividade1.Q2;
    public class CamaroteInferior extends Vip{
        private String local;
//CONSTRUTOR  
    public CamaroteInferior(double valor, double adicional, String local){
            super(valor, adicional);
            this.local = local;    
        }
//GETTER AND SETTER
        public String getLocal() {
            return local;
        }

        public void setLocal(String local) {
            this.local = local;
        }

//METODOS
        @Override
        public String toString() {
            
            return "Valor: " + (getValor() + getAdicional()) + "\nLocalização do camarote inferior: " + getLocal();
        }
        public String exibeLocal(){
            return "Localização: " + getLocal();       
        }
        
}
