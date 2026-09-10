import java.math.BigDecimal;
abstract class MetodoPagamento{
    protected BigDecimal valor;
    protected String status;

    public MetodoPagamento(BigDecimal valor){
        this.valor =valor;
        this.status= "PENDENTE";
    }
    public abstract boolean processar();
    public String getStatus(){
        return status;
    }
}
