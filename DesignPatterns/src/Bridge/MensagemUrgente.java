package Bridge;

public class MensagemUrgente extends Mensagem{
    public MensagemUrgente(CanalDeEnvio canal) {
        super(canal);
    }

    public void enviarMensagem(String texto) {
        canal.enviar("MENSAGEM URGENTE: " + texto.toUpperCase());
    }
}
