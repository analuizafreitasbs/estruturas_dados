package Filas.Fila_Dinamica.src;

import java.util.NoSuchElementException;

/**
 * Implementação de uma fila dinâmica.
 *
 * @author Ana Luiza
 * @version 1.0
 * @since 2025-05-12
 *
 * @param <T> Tipo dos elementos armazenados na fila.
 */
public class FilaDinamica<T> implements Enfileiravel<T> {

    /** Ponteiro para o primeiro elemento da fila. */
    private NoDuplo<T> ponteiroInicio;

    /** Ponteiro para o último elemento da fila. */
    private NoDuplo<T> ponteiroFim;

    /** Quantidade atual de elementos na fila. */
    private int quantidade;

    /** Tamanho máximo permitido da fila. */
    private int tamanho;

    /**
     * Construtor padrão. Cria uma fila com tamanho máximo de 10 elementos.
     */
    public FilaDinamica() {
        this(10);
    }

    /**
     * Construtor que permite definir o tamanho máximo da fila.
     *
     * @param tamanho O tamanho máximo da fila.
     */
    public FilaDinamica(int tamanho) {
        this.tamanho = tamanho;
        this.quantidade = 0;
        this.ponteiroInicio = null;
        this.ponteiroFim = null;
    }

    /**
     * Não suportado: Enfileirar um elemento no início da fila.
     *
     * @param dado Elemento a ser inserido.
     * @throws UnsupportedOperationException Sempre lançado, pois a operação não é suportada.
     */
    @Override
    public void enfileirarInicio(T dado) {
        throw new UnsupportedOperationException("Operação não suportada!");
    }

    /**
     * Enfileira um elemento no final da fila.
     *
     * @param dado Elemento a ser inserido.
     * @throws UnsupportedOperationException Caso a fila esteja cheia.
     */
    @Override
    public void enfileirarFim(T dado) {
        if (estaCheia()) {
            throw new UnsupportedOperationException("Operação não suportada!");
        }
        NoDuplo<T> noTemp = new NoDuplo<>();
        noTemp.setDado(dado);
        if (!estaVazia()) {
            ponteiroFim.setProximo(noTemp);
        } else {
            ponteiroInicio = noTemp;
        }
        noTemp.setAnterior(ponteiroFim);
        ponteiroFim = noTemp;
        quantidade++;
    }

    /**
     * Retorna o elemento no início da fila sem removê-lo.
     *
     * @return Elemento na frente da fila.
     * @throws NoSuchElementException Caso a fila esteja vazia.
     */
    @Override
    public T frente() {
        if (estaVazia()) {
            throw new NoSuchElementException("fila vazia ");
        }
        return ponteiroInicio.getDado();
    }

    /**
     * Não suportado: Retorna o elemento no final da fila.
     *
     * @return Elemento no final da fila.
     * @throws UnsupportedOperationException Sempre lançado, pois a operação não é suportada.
     */
    @Override
    public T tras() {
        throw new UnsupportedOperationException("Operação não suportada!");
    }

    /**
     * Atualiza o elemento no início da fila.
     *
     * @param dado Novo valor a ser definido no início da fila.
     * @throws NoSuchElementException Caso a fila esteja vazia.
     */
    @Override
    public void atualizarInicio(T dado) {
        if (estaVazia()) {
            throw new NoSuchElementException("fila vazia ");
        }
        ponteiroInicio.setDado(dado);
    }

    /**
     * Atualiza o elemento no final da fila.
     *
     * @param dado Novo valor a ser definido no final da fila.
     * @throws NoSuchElementException Caso a fila esteja vazia.
     */
    @Override
    public void atualizarFim(T dado) {
        if (estaVazia()) {
            throw new NoSuchElementException("fila vazia ");
        }
        ponteiroFim.setDado(dado);
    }

    /**
     * Verifica se a fila está vazia.
     *
     * @return {@code true} se a fila estiver vazia, {@code false} caso contrário.
     */
    @Override
    public boolean estaVazia() {
        return (quantidade == 0);
    }

    /**
     * Verifica se a fila está cheia.
     *
     * @return {@code true} se a fila estiver cheia, {@code false} caso contrário.
     */
    @Override
    public boolean estaCheia() {
        return (quantidade == tamanho);
    }

    /**
     * Não suportado: Imprime os elementos da fila do final para o início.
     *
     * @return String com os elementos da fila.
     * @throws UnsupportedOperationException Sempre lançado, pois a operação não é suportada.
     */
    @Override
    public String imprimirTrasPraFrente() {
        throw new UnsupportedOperationException("Operação não suportada!");
    }

    /**
     * Imprime os elementos da fila do início para o final.
     *
     * @return String representando os elementos da fila no formato [elem1, elem2, ...].
     */
    @Override
    public String imprimirFrentePraTras() {
        String resultado = "[";
        NoDuplo<T> noAuxiliar = ponteiroInicio;
        for (int i = 0; i < quantidade; i++) {
            if (i == quantidade - 1) {
                resultado += noAuxiliar.getDado();
            } else {
                resultado += noAuxiliar.getDado() + ",";
            }
            noAuxiliar = noAuxiliar.getProximo();
        }
        return resultado + "]";
    }

    /**
     * Remove e retorna o elemento no início da fila.
     *
     * @return Elemento removido do início da fila.
     * @throws NoSuchElementException Caso a fila esteja vazia.
     */
    @Override
    public T desenfileirarInicio() {
        if (estaVazia()) {
            throw new NoSuchElementException("fila vazia ");
        }
        T dadoInicio = ponteiroInicio.getDado();
        ponteiroInicio = ponteiroInicio.getProximo();
        quantidade--;
        if (!estaVazia()) {
            ponteiroInicio.setAnterior(null);
        } else {
            ponteiroFim = null;
        }
        return dadoInicio;
    }

    /**
     * Não suportado: Remove e retorna o elemento no final da fila.
     *
     * @return Elemento removido do final da fila.
     * @throws UnsupportedOperationException Sempre lançado, pois a operação não é suportada.
     */
    @Override
    public T desenfileirarFim() {
        throw new UnsupportedOperationException("Operação não suportada!");
    }
}
