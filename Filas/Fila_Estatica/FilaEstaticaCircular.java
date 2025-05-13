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

public FilaEstaticaCircular() {
    this(10);
}

@Override
public void enfileirar(Object dado) {
    if (!estaCheia()) {
        ponteiroFim = avancar(ponteiroFim);
        dados[ponteiroFim] = dado;
        if (estaVazia())
            ponteiroInicio = ponteiroFim;
        quantidade++;
    } else {
        System.out.println("fila cheia");
    }

}

@Override
public Object desenfileirar() {
    Object dadoInicio = null;
    if (!estaVazia()) {
        dadoInicio = dados[ponteiroInicio];
        ponteiroInicio = avancar(ponteiroInicio);
        quantidade--;
    } else {
        System.err.println("Fila cheia");
    }
    return dadoInicio;

}

@Override
public Object frente() {
    Object dadoInicio = null;
    if (!estaVazia()) {
        dadoInicio = dados[ponteiroInicio];
    } else {
        System.err.println("Queue is empty");
    }
    return dadoInicio;
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
     int ponteiroAux = ponteiroInicio; // aqui ponteiro aux
        for (int i = 0; i < quantidade; i++) {
           if (i == quantidade - 1)
            retorno += dados[ponteiroAux];
            else retorno += dados[ponteiroAux] + ",";

            ponteiroAux = avancar(ponteiroAux);
        }
        return retorno + "]";
}

private int avancar(int ponteiro) {
    return (ponteiro+1)%dados.length;
}

}
