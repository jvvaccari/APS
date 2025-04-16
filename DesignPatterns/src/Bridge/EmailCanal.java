package Bridge;

public class EmailCanal implements CanalDeEnvio{
    public void enviar(String mensagem){
        System.out.println("Email -> " + mensagem);
    }
}
