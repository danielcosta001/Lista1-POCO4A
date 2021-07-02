package computador;

public class Computador {
    
    private String nome;
    private String marca;
    private Data data;
    
    public Data getData(){
	return data;
    }
    public String getNome(){
		return this.nome;
    }
    public String getMarca(){
		return this.marca;
    }	
    public void setNome(String n){
	this.nome = n;
    }
    public void setMarca(String m){
	this.marca = m;
    }
    public void setData(int d, int m, int a){
	data = new Data(d,m,a);
    }
}
