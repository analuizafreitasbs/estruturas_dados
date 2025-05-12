package Pilhas;
// pilha/stack
// algo que tem como ser empilhado

// interface define comportamento
// define comportamentos
// conjunto de operaçõs de algo(classe) deve prover

// tipo de retorno - nome - parametro de entrada

// definir interfade na prova (pilha ou lista) e questoes de concurso
// n da empilhar tudo

public class PilhaEstatica implements Empilhavel {
    // Variáveis de instância
    private Object[] dados;
    private int ponteiroTopo;

    // Construtor
    public PilhaEstatica(int tamanho) {
        dados = new Object[tamanho];
        ponteiroTopo = -1;
    }

    // Métodos principais

    @Override
    public void empilhar(Object dado) {
        if (!estaCheia()) {
            ponteiroTopo++;
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
            ponteiroTopo--;  // Mover o ponteiro para o próximo item
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
        for (int i = ponteiroTopo; i >= 0; i--) {
            if (i == 0)
                aux += dados[i];
            else
                aux += dados[i] + ",";
        }
        return aux + "]";
    }
}
