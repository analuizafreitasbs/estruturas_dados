package Filas;
public class FilaEstaticaCircular implements Enfileiravel {
     private Object[] dados;
     private int ponteiroInicio;
     private int ponteiroFim;
     private int quantidade;
 
          // constrtures
public FilaEstaticaCircular(int tamanho) {
    dados = new Object[tamanho];
    ponteiroInicio = 0 ;
    ponteiroFim = -1;
    quantidade = 0;

}

@Override
public void enfileirar(Object dado) {
    if (!estaCheia()) {
        ponteiroFim = (ponteiroFim+1)%dados.length;
        dados[ponteiroFim] = dado;
        quantidade++;
    } else {
        System.out.println("fila cheia");
    }

}

@Override
public void desenfileirar() {
    Object aux = null;
    if (!estaVazia()) {
        aux = dados[ponteiroInicio];
        ponteiroInicio = (ponteiroInicio + 1)%dados.length;
        quantidade--;
    } else {
        System.err.println("fila cheia");
    }

}

@Override
public Object frente() {
    Object aux = null;
    if (!estaVazia()) {
        aux = dados[ponteiroInicio];
    } else {
        System.err.println("Queue is empty");
    }
    return aux;
}

@Override
public void atualizarInicio(Object dado) {
        if (!estaVazia()) {
            dados[ponteiroInicio] = dado;
        } else {
            System.err.println("Queue is empty");
        }

}

@Override
public void atualizarFim(Object dado) {
        if (!estaVazia()) {
            dados[ponteiroFim] = dado;
        } else {
            System.err.println("Queue is empty");
        }

}

@Override
public boolean estaCheia() {
    return (quantidade == dados.length);

}
@Override
public boolean estaVazia() {
    return (quantidade == 0);

}

@Override
public String imprimir() {
     String retorno = "[";
        for (int i = ponteiroInicio; i < quantidade+ponteiroInicio; i++) {
           if (i == quantidade + ponteiroInicio - 1)
            retorno += dados[i%dados.length];
            else retorno += dados[i%dados.length] + ",";
        }
        return retorno + "]";
}

private int avancar(int ponteiro) {
    return (ponteiro+1)%dados.length;
}

}
