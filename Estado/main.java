
public class main{
public static void main(String[] args) {
    String[] usuarios = {"raphael.jesus@estacio.br", "carol@gmail.com", "ana@email.com"};
    for(String email: usuarios);{
        EnviadorEmail thread = new EnviadorEmail(email);
        thread.start();
    }
    System.out.println("Todos os envios foram iniciados...");
}
}