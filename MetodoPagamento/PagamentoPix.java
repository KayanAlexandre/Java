import java.math.Bigdecimal;
import java.util.UUID;

public class PagamentoPix {
    public PagamentoPix(BigDecimal valor){
        super(valor);
    }
   @Override
    public boolean processar(){
        String chavePix=UUID.random().toString();
        this.status="AGUARDANDO_PAGAMENTO";
        System.out.println("Pix gerado no valor de "+this.valor+".");
        System.out.println("Copie e cole a chave: " + chavePix);
        return true ; // Simula que a geração deu certo
    } 
}
