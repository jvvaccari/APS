package Builder;

public class Lanche {
    private String pao;
    private String carne;
    private String queijo;
    private boolean alface;
    private boolean molho;

    public boolean isAlface() {
        return alface;
    }

    public boolean isMolho() {
        return molho;
    }

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getQueijo() {
        return queijo;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public void setAlface(boolean alface) {
        this.alface = alface;
    }

    public void setMolho(boolean molho) {
        this.molho = molho;
    }
}
