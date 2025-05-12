// É como se fosse uma casinha do array. além do objeto tem que tem ter um ponteiro com referencia nó anterior e pro proximo nó
package Pilhas.Pilha_Dinamica.src;
/**
 * @author Ana Luiza
 * @version 1.0
 * @since 2025-05-11
 */
public class NoDuplo<T> {
    private T dado;
    private NoDuplo<T> anterior;
    private NoDuplo<T> proximo;

    public NoDuplo() {
        this.anterior = null;
        this.proximo = null;

    }

    public NoDuplo(T dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public NoDuplo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo<T> anterior) {
        this.anterior = anterior;
    }

    public NoDuplo<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }

}