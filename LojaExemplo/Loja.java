public class Loja {
    private int estoque = 5;

    public void comprar(String Consumidor){
        if(estoque > 0){
            System.out.println(Consumidor+" encontrou produto");
            estoque--;
            System.out.println(Consumidor+" comprou. Estoque: "+estoque);
        }
    }
    
}
