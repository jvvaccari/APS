package Bridge;

public abstract  class Mensagem {
    protected CanalDeEnvio canal; // Composição

    public Mensagem(CanalDeEnvio canal){
        this.canal = canal;
    }

    public abstract void enviarMensagem(String texto);
}
