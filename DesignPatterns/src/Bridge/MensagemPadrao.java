package Bridge;

public class MensagemPadrao extends Mensagem{
    public MensagemPadrao(CanalDeEnvio canal){
        super(canal);
    }

    public void enviarMensagem(String texto) {
        canal.enviar("Mensagem padrão: " + texto);
    }
}
