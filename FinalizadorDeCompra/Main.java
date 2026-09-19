public class Main {
    public static void main(String[] args) {
        CheckoutService checkout= new CheckoutService();
        try {
            checkout.finalizarCompra(3, 2500);
        } catch (EstoqueInsuficienteException e) {
            System.out.println("Não foi possivel concluir a compra: " + e.getMessage());
        } catch (PagamentoRecusadoException e) {
            System.out.println("Problema no pagamento: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Dados inválidos: " + e.getMessage());
        } finally {
            System.out.println("Processo de finalização de checkout encerrado.");
        }
    }
    
}
