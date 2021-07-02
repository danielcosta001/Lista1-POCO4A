package cliente;


public class Principal {
    public static void main(String[] args) {
        Cliente[] c1 = new Cliente[2];
        c1[0] = new Cliente("Guilherme",27,11,2000);
        c1[1] = new Cliente("Guilherme",27,11,2000);
        System.out.println(c1[0]);
        System.out.println(c1[1]);
    }
}
