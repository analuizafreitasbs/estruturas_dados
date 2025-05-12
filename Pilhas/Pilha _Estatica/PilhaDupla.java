package Pilhas;

// esse aqui duplica o processo já feito antes basicamente na pilha normal com algumas mudanças

public class PilhaDupla implements EmpilhavelDupla {
    // Variáveis de instância
    private Object[] dados;
    private int ponteiroTopo1;
    private int ponteiroTopo2;

    // Construtor
    public PilhaDupla(int tamanho) {
        dados = new Object[tamanho];
        ponteiroTopo1 = -1;
        ponteiroTopo2 = tamanho;
    }

    // Métodos principais

    @Override
    public void empilhar1(Object dado) {
        if (!estaCheia1()) {
            ponteiroTopo1++;
            dados[ponteiroTopo1] = dado;
        } else {
            System.out.println("A pilha 1 esta cheia");
        }
    }

    @Override
    public void atualizar1(Object dado) {
        if (!estaVazia1()) {
            dados[ponteiroTopo1] = dado;
        } else {
            System.out.println("Pilha 1 vazia");
        }
    }

    @Override
    public Object desempilhar1() {
        if (!estaVazia1()) {
            Object aux = dados[ponteiroTopo1];
            ponteiroTopo1--;  // Mover o ponteiro para o próximo item
            return aux;
        } else {
            System.err.println("Pilha 1 vazia");
            return null;
        }
    }

    @Override
    public Object espiar1() {
        if (!estaVazia1()) {
            return dados[ponteiroTopo1];
        } else {
            System.out.println("Pilha 1 vazia");
            return null;
        }
    }

    // Métodos auxiliares

    @Override
    public boolean estaCheia1() {
        return (ponteiroTopo1 == ponteiroTopo2-1);
    }

    @Override
    public Boolean estaVazia1() {
        return (ponteiroTopo1 == -1);
    }

    @Override
    public String imprimir1() {
        String aux = "[";
        for (int i = ponteiroTopo1; i >= 0; i--) {
            if (i == 0)
                aux += dados[i];
            else
                aux += dados[i] + ",";
        }
        return aux + "]";
    }

    @Override
    public void empilhar2(Object dado) {
        if (!estaCheia2()) {
            ponteiroTopo2--;
            dados[ponteiroTopo2] = dado;
        } else {
            System.out.println("A pilha 2 esta cheia");
        }
    }

    @Override
    public void atualizar2(Object dado) {
        if (!estaVazia2()) {
            dados[ponteiroTopo2] = dado;
        } else {
            System.out.println("Pilha 2 vazia");
        }
    }

    @Override
    public Object desempilhar2() {
        if (!estaVazia2()) {
            Object aux = dados[ponteiroTopo2];
            ponteiroTopo2++;  // Mover o ponteiro para o próximo item
            return aux;
        } else {
            System.err.println("Pilha 2 vazia");
            return null;
        }
    }

    @Override
    public Object espiar2() {
        if (!estaVazia2()) {
            return dados[ponteiroTopo2];
        } else {
            System.out.println("Pilha 2 vazia");
            return null;
        }
    }

    // Métodos auxiliares

    @Override
    public boolean estaCheia2() {
        return estaCheia1();
    }

    @Override
    public Boolean estaVazia2() {
        return (ponteiroTopo2 == dados.length);
    }

    @Override
public String imprimir2() {
    String aux = "[";
    for (int i = ponteiroTopo2; i <= dados.length - 1; i++) {
        if (i == dados.length - 1) {
            aux += dados[i];
        } else {  // Aqui estava o erro de chave
            aux += dados[i] + ",";
        }
    }
    return aux + "]";
}

}



