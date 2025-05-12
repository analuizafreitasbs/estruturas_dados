package Pilhas.Pilha_Dinamica.src;
import java.util.NoSuchElementException;

/** Essa classe implementa uma pilha dinâmica, que é uma estrutura de dados que permite armazenar elementos de forma
 * a serem acessados em ordem LIFO (Last In, First Out).
 * @author Ana Luiza.F.B.S
 * @version 1.0
 * @since 2025-05-11
 */

public class PilhaDinamica<T> implements Empilhavel<T> {
    private int tamanho;
    private int quantidade;
    private NoDuplo<T> ponteiroTopo;

/**
* Construtor que recebe tam maximo
* @param tamanho indica o tamanho maximo que a pilha pode ter
*
*/
public PilhaDinamica(int tamanho) {
    this.tamanho = tamanho;
    this.quantidade = 0;
    this.ponteiroTopo = null;
}
/**
 * Construtor vazio
 *
 */

public PilhaDinamica() {
    this(10);
}

/**
 * Empilha um elemento na pilha.
 *
 * @param dado é o dado a ser empilhado
 * @throws NoSuchElementException se a pilha estiver cheia
 */

@Override
public void empilhar(T dado) {
    if (estaCheia()) {
        throw new IllegalStateException("A pilha está cheia");
    }
    NoDuplo<T> noTemp = new NoDuplo<>();
    noTemp.setDado(dado);
    noTemp.setProximo(ponteiroTopo);
    
    ponteiroTopo = noTemp;
    quantidade++;
}

/**
 * Desempilha o topo da pilha.
 *
 * @return retorna o elemento desempilhado
 * @throws NoSuchElementException se a pilha estiver vazia
 */

@Override
public T desempilhar() {
    if (estaVazia()) {
        throw new NoSuchElementException("A pilha está vazia");
    }
    T dadoTopo = ponteiroTopo.getDado();
    ponteiroTopo = ponteiroTopo.getAnterior();
    quantidade--;
    return dadoTopo;
}
/**
 * Espia o topo da pilha.
 *
 * @return retorna o elemento do topo
 * @throws NoSuchElementException se a pilha estiver vazia
 */

@Override
public T espiar() {
    if (estaVazia()) {
        throw new NoSuchElementException("A pilha está vazia");
    }
    return ponteiroTopo.getDado();
}
/**
 * Atualiza o topo da pilha.
 *
 * @param novoDado é o elemento a substituir o elemento do topo
 * @throws NoSuchElementException se a pilha estiver vazia
 */

@Override
public void atualizar(T novoDado) {
    if (estaVazia()) {
        throw new NoSuchElementException("A pilha está vazia");
    }
    ponteiroTopo.setDado(novoDado);
}

/**
 * Verifica se a pilha está vazia.
 *
 * @return true se a pilha estiver vazia, false caso contrário
 */

@Override
public Boolean estaVazia() {
    return quantidade == 0;
}

/**
 * Verifica se a pilha está cheia.
 *
 * @return true se a pilha estiver cheia, false caso contrário
 */

@Override
public boolean estaCheia() {
    return quantidade == tamanho;
}

/**
 * Texto referente aos elementos da pilha para serem impressos.
 * @return um texto com os elementos separados por ",", delimitados por colchetes
 */

@Override
public String imprimir() {
   NoDuplo<T> ponteiroAuxiliar = ponteiroTopo;
   String resultado = "[";
   for (int i = quantidade - 1; i >= 0; i--) {
       resultado += ponteiroAuxiliar.getDado();
       if (i != 0) {
           resultado += ", ";
       }
       ponteiroAuxiliar = ponteiroAuxiliar.getAnterior();
   } return resultado + "]";
}

}