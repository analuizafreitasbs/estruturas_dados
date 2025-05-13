package Filas;
// é literalmente uma fila normal com espaços delimitados, como se fosse uma fila de banco
public class FilaEstatica implements Enfileiravel {
    
// variaveis de instancia 
     private Object[] dados;
     private int ponteiroInicio;
     private int ponteiroFim;

     // constrtures
public FilaEstatica(int tamanho) {
    dados = new Object[tamanho];
    ponteiroInicio = 0 ;
    ponteiroFim = -1;
}

public FilaEstatica() {
    this(10);
}

// aqui são os metodos principais
@Override
public void enfileirar(Object dado) {
    if (!estaCheia()) {
        ponteiroFim++;
        dados[ponteiroFim] = dado;
    } else {
        System.err.println("fila cheia");
    }


}

@Override
public Object desenfileirar() {
    Object dadoInicio = null;
    if (!estaVazia()) {
        dadoInicio = dados[ponteiroInicio];
        ponteiroInicio++;
    } else {
        System.err.println("fila vazia");
    }
    return dadoInicio;

}
@Override
public Object frente() {
    Object dadoInicio = null;
    if (!estaVazia()) {
        dadoInicio = dados[ponteiroInicio];
    } else {
        System.err.println("fila vazia");
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

// metodos auxiliares
@Override
public boolean estaCheia() {
    return (ponteiroFim == dados.length -1);

}
@Override
public boolean estaVazia() {
    return (ponteiroFim == ponteiroInicio + 1);


}

     @Override
     public String imprimir() {
     String retorno = "[";
        for (int i = ponteiroInicio; i <= ponteiroFim; i++) {
           if (i == ponteiroFim)
            retorno += dados[i];
            else retorno += dados[i] + ",";
        }
        return retorno + "]"; 
}
}
