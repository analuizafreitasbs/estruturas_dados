package Arvores_Heap.Heap_Estatico;

public class ArvoreBinariaHeapMaximo implements Amontoavel {
    private Object[] dados;
    private int ponteiroFim;


    public ArvoreBinariaHeapMaximo(int tamanho) {
        dados = new Object[tamanho];
        ponteiroFim = -1;
    }

    public ArvoreBinariaHeapMaximo() {
        this(10); // Tamanho padrão
    }

    @Override
    public void inserir(Object dado) {

    }

    @Override
    public Object obterRaiz() {
        return null;
    }

    @Override
    public Object extrair() {
        return null;
    }

    @Override
    public String imprimir() {
        return "";
    }

    @Override
    public boolean estaCheia() {
        return false;
    }

    @Override
    public boolean estaVazia() {
        return false;
    }
}
