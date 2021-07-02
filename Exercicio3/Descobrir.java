public class Descobrir {
    private int aleatorio;

    public Descobrir(){
        this.aleatorio = (int) (1 + Math.random() *10);//gera um numero entre 1 e 10
    }

    public String avaliar(int num){

        String result = "Iguais";
        if(num < this.aleatorio)
            result = "maior";
        else
            if( num > this.aleatorio)
                result = "menor";
        
        System.out.println(result);
        return result;
    }
}
