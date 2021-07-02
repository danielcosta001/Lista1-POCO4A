public class Principal {
    
    public static void main(String[] args) {
        Pendulo display = new Pendulo();
        System.out.println(display);

        display.setPendulo(2, 32, 2);
        
        System.out.println(display);
    }
}
