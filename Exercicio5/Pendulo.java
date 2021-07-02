import java.text.DecimalFormat;

public class Pendulo {
    
    private int a;
    private int b;
    private int c;

    public Pendulo(){
        setPendulo(0,0,0);
    }

    public void setPendulo(int A, int B, int C){
        this.a = A;
        this.b = B;
        this.c = C;
    }

    public String converterOnda(){
        DecimalFormat doisDigitos = new DecimalFormat("00");
        return doisDigitos.format(this.a) + "       |"+
                doisDigitos.format(this.b) +"       |"+
                doisDigitos.format(this.c);
    }


    public String toString(){
        DecimalFormat doisDigitos = new DecimalFormat("00");
        if(this.c > 30){
            this.c = 0;
            this.b = this.b+1;
        }
        if (b > 30){
            c = 0;
            b = 0;
            a = a+1;
        }
        return (doisDigitos.format(this.a)+ "       |"+
                doisDigitos.format(this.b)+ "       |"+
                doisDigitos.format(this.c));
    }



}