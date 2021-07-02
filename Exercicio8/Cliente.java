package cliente;


public class Cliente {
    
    private String nome;
	
    private Data dataNascimento;
    
    public Cliente(String n, int d, int m, int a) {
	setNome(n);
	setDataNascimento(d,m,a);
    }
	
    public void setDataNascimento(int d, int m, int a){
	dataNascimento = new Data(d,m,a);
    }
    public Data getDataNascimento(){
	return dataNascimento;
    }
	
    public String getNome(){
	return this.nome;
    }
    public void setNome(String n){
	this.nome = n;
    }

}
