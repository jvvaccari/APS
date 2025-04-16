package Bridge;

public class Main {
    public static void main(String[] args) {
        CanalDeEnvio email = new EmailCanal();
        CanalDeEnvio sms = new SmsCanal();

        Mensagem mensagem1 = new MensagemPadrao(email);
        mensagem1.enviarMensagem("Olá, tudo bem?");

        Mensagem mensagem11 = new MensagemUrgente(email);
        mensagem11.enviarMensagem("Olá, tudo bem?");

        Mensagem mensagem2 = new MensagemUrgente(sms);
        mensagem2.enviarMensagem("Atenção, sistema fora do ar!");

        Mensagem mensagem22 = new MensagemPadrao(sms);
        mensagem22.enviarMensagem("Olá, sistema está de volta!");
    }
}

