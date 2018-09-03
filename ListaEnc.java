package caelum;

public class ListaEnc {
    private Info primeiro; // O primeiro dado;
    private Info ultimo;    // O ultimo dado;
    int cont;

    // 2
    public void inserir(Object elemento) {  // Inserir no começo da lista.
        Info novo = new Info(this.primeiro, elemento);
        this.primeiro = novo;

        if (this.cont == 0) {
            this.ultimo = this.primeiro;
        }
        this.cont++;

    }

    // 3
    public String toString() {
        if (this.cont == 0) { // Informando que é uma lista vazia.
            return "[]";
        }

        StringBuilder builder = new StringBuilder("["); // O início do print.
        Info atual = primeiro;
        for (int i = 0; i < this.cont - 1; i++) {
            builder.append(atual.getElemento()); // vai pegar o elemento
            builder.append(", ");
            atual = atual.getProx(); // vai pegar o sucessor
        }
        builder.append(atual.getElemento()); // Para informar o ultimo elemento.
        builder.append("]");

        return builder.toString();
    }

    // 4
    public int empty() { // Verificar se está vazio ou não.
        if (this.primeiro == null) {
            return 1;
        } else {
            return 0;
        }
    }

    // 5
    public boolean buscar(Object elemento) {  // Vê se certo existe na lista.
        Info atual = this.primeiro;
        while (atual != null) { // Enquanto atual não for nula...
            if (atual.getElemento().equals(elemento)) { // Se o elemento for igual ao elemento
                return true; // Verdadeiro
            }
            atual = atual.getProx(); // Se nao, va ao próximo
        }
        return false; //  Se nada disso for verdadeiro, retorne falso
    }

    // 6
    public boolean ocupacao(int posicao) { // irá ver se a posição foi ocupada ou não.
        return posicao >= 0 && posicao <= this.cont;
    }

    public void remover() { // Remover o dado que estiver na última posição.
        if (this.cont == 1) {
            this.primeiro = this.primeiro.getProx();
            this.cont--;
        } else {
            Info p = this.ultimo.getAnt(); // Pegue o valor
            this.ultimo = p; // tornar esse valor o ultimo.
            this.cont--;
        }
    }

    // 7
    public void removetudo(){
       while(cont != 0){ // Enquanto cont nao for 0...
           this.primeiro = this.primeiro.getProx(); // vai pegar o primeiro valor, e vai trocar pelo proximo.
           cont--;
       }
       if(this.cont == 0){
           this.ultimo = null; // se o cont tiver 0, será null.
       }
    }
}
