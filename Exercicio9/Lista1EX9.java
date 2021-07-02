import java.util.Random;

public class Lista1EX9 {

    public static class Cliente{
        private String Nome;
        private int number;
        
        public Cliente(){}

        public Cliente setNome(String Nome){
            this.Nome= Nome;
            return this;    
        }

        public String getNome(){
            return this.Nome;
        }

        public Cliente setNumber(int number){
            this.number= number;
            return this;
        }
        public int getNumber(){
            return this.number;
        }
    }

    public static class Supermercado extends Cliente{

        private String nomeMercado;

        public Supermercado(){}

        public Supermercado setNomeMercado(String nomeMercado){
            this.nomeMercado= nomeMercado;
            return this;
        }

        public String getNomeMercado(){
            return this.nomeMercado ;
        }

        static Cliente c1= new Cliente();
        static Cliente c2= new Cliente();      
        static Cliente c3= new Cliente();       
        static Cliente c4= new Cliente();
    }


    public class Principal extends Supermercado{       

        public static void main(String[] args) {
            Random num = new Random();
            

            c1.setNome("Lukinhas");
            c1.setNumber(num.nextInt(100));

            c2.setNome("Leozin");
            c2.setNumber(num.nextInt(100));

            c3.setNome("Pedrin");
            c3.setNumber(num.nextInt(100));

            c4.setNome("Gui");
            c4.setNumber(num.nextInt(100));

            Supermercado m1= new Supermercado();
            m1.setNomeMercado("Mercadinho Mr.Ze");

            System.out.println("Mercado: "+m1.getNomeMercado());

            System.out.println("Cliente 1:"+c1.getNome()+"\t Numero:"+c1.getNumber());
            System.out.println("Cliente 2:"+c2.getNome()+"\t Numero:"+c2.getNumber());
            System.out.println("Cliente 3:"+c3.getNome()+"\t Numero:"+c3.getNumber());
            System.out.println("Cliente 4:"+c4.getNome()+"\t Numero:"+c4.getNumber());
       
        }
    }

}
