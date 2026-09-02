public class CheckoutService {
    public void finalizadorCompra(double valor, FormaPagamento FormaPagamento){
        System.out.println("Finalizando Compra...");
        FormaPagamento.pagar(valor);
        System.err.println("pedido criado com sucesso");
    }
}
