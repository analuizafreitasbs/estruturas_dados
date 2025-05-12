package Pilhas;
// desse pra estatica normal muda alguns detalhes

public class PilhaInvertida implements Empilhavel {
    private Object[] dados;
    private int ponteiroTopo;

    // Construtor
    public PilhaInvertida(int tamanho) {
        dados = new Object[tamanho];
        ponteiroTopo = tamanho;
    }

    // Métodos principais

    @Override
    public void empilhar(Object dado) {
        if (!estaCheia()) {
            ponteiroTopo--;
            dados[ponteiroTopo] = dado;
        } else {
            System.out.println("Stack is full");
        }
    }

    @Override
    public void atualizar(Object dado) {
        if (!estaVazia()) {
            dados[ponteiroTopo] = dado;
        } else {
            System.out.println("Stack is empty");
        }
    }

    @Override
    public Object desempilhar() {
        if (!estaVazia()) {
            Object aux = dados[ponteiroTopo];
            ponteiroTopo++;  // Mover o ponteiro para o próximo item
            return aux;
        } else {
            System.err.println("Stack is empty");
            return null;
        }
    }

    @Override
    public Object espiar() {
        if (!estaVazia()) {
            return dados[ponteiroTopo];
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    // Métodos auxiliares

    @Override
    public Boolean estaVazia() {
        return (ponteiroTopo == -1);
    }

    @Override
    public boolean estaCheia() {
        return (ponteiroTopo == dados.length - 1);
    }

    @Override
    public String imprimir() {
        String aux = "[";
        for (int i = ponteiroTopo; i <= dados.length-1; i++) {
            if (i == dados.length-1)
                aux += dados[i];
            else
                aux += dados[i] + ",";
        }
        return aux + "]";
    }
}
