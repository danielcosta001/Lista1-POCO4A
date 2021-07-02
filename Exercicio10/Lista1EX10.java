public class Lista1EX10 {
       
    public class SAIDA {
        public SAIDA() {}
        public static String imprimir(String mensagem){
            return mensagem; 
        }	
    }

    public class MinhaImpressao {
        public static SAIDA saida;
        public MinhaImpressao() {}
    }
    
    public class Principal {
        public Principal() {}

        public static void main(String[] args) {
            String mensagem;
            mensagem="OLA MUNDO";
            
            System.out.println(MinhaImpressao.saida.imprimir(mensagem));	
        }
    }
}
