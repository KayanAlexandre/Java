public class ArmazenamentoCloud implements Armazenamento{
    @Override
    public String salvar(String nomeArquivo, byte[] conteudo){
        System.out.println("Autenticando no serviço de cloud...");
        System.out.println("Enviando arquivo...");
        String url = "https://storage.empresa.com/"+ nomeArquivo;
        System.out.println("Upload concluido.");
        return url;
    }
    
    @Override
    public void remover(String caminho){
        System.out.println("Solicitando remoção na cloud...");
        System.out.println("Arquivo removido: " + caminho);
    }
}
