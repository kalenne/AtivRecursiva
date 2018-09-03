package caelum;

public class Info {

    private Info prox; // O ponteiro para o próximo dado.
    private Info ant; // Anterior

    public Info getAnt() {
        return ant;
    }

    public void setAnt(Info ant) {
        this.ant = ant;
    }

    private Object elemento; // Escrever o dado.

    public Info(Info prox, Object elemento){
        this.prox = prox;
        this.elemento = elemento;
    }
    public Info(Object elemento){
        this.elemento = elemento;
    }
    public Info getProx() {
        return prox;
    }

    public void setProx(Info prox) {
        this.prox = prox;
    }

    public Object getElemento() {
        return elemento;
    }
}
