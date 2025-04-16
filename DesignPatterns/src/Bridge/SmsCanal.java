package Bridge;

public class SmsCanal implements CanalDeEnvio{
    public void enviar(String mensagem){
        System.out.println("SMS -> " + mensagem);
    }
}
