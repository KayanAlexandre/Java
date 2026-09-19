public class Checkout {
    //POLIMORFISMO
    //Este Método não sabe se é cartão,Pix ou boleto.Ele apenas manda "processar".
    public void finalizadorCompra(MetodoPagamento metodoPagamento) {
        System.out.println("---Iniciando checkout---");
        boolean sucesso = metodoPagamento.processar();

        if(sucesso){
            System.out.println("Compra finalizada. Status do pedido: "+ metodoPagamento.getStatus());
        } else{
            System.out.println("Falha no checkout. Verifique o método de pagamento.");
        }
        System.out.println("-------------------\n);
    }
}
