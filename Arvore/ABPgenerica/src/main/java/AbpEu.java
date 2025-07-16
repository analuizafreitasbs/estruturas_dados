package Arvore.ABPgenerica.src.main.java;

public class AbpEu<T extends Comparable<T>> implements Arborizavel<T> {
    // T extends Comparable<T>: o tipo T precisa saber se comparar com outros (para saber se é maior, menor ou igual).
    private NoTriplo<T> raiz;
    // A raiz da árvore. É o primeiro nó, onde tudo começa.

    public AbpEu() {
        // Construtor: cria uma árvore vazia, sem nenhuma raiz...
        raiz = null;
    }

    @Override
    public NoTriplo<T> getRaiz() { // Método que retorna a raiz da árvore.
        return null;
    }

    @Override
    public void limpar() {
        // Método para limpar a árvore, removendo todos os elementos.
        raiz = null; // Simplesmente define a raiz como nula, removendo todos os nós.
    }

    @Override
    public void inserir(T dado) {
        NoTriplo<T> novoNo = new NoTriplo<>();
        novoNo.setDado(dado); // Cria um novo nó com o dado a ser inserido.
        if (raiz == null) {
            raiz = novoNo; // Se a árvore está vazia, o novo nó se torna a raiz.
        } else {
            NoTriplo<T> aux = raiz; // Começa a busca pela posição correta a partir da raiz.
            while (true) {
                int comparacao = dado.compareTo(aux.getDado()); //
                if (comparacao == 0) {
                    if (aux.getEsquerda() == null) {
                        aux.setEsquerda(novoNo);
                        novoNo.setGenitor(aux); // Se o dado é igual, insere à esquerda se não houver nó lá.
                        break;
                    }
                    aux = aux.getEsquerda();
                } else {
                    if (aux.getDireita() == null) {
                        aux.setDireita(novoNo); // Se o dado é maior, insere à direita se não houver nó lá.
                        novoNo.setGenitor(aux);
                        break;
                    }
                    aux = aux.getDireita(); // Se o dado é menor, continua a busca à direita.
                }
            }
        }

    }

    @Override
    public T apagar(T dado) {
        NoTriplo<T> aux = buscar(dado);
        if (aux == null)
            return null; // Se o nó não for encontrado, retorna nulo.
        // caso 1: nó folha (sem filhos)
        if (aux.getEsquerda() == null && aux.getDireita() == null)
            apagarNoFolha(aux);

        // caso 2: no com um filho
        else if (aux.getEsquerda() == null || aux.getDireita() == null)
            apagarComUmFilho(aux);

        // caso 3: nó com dois filhos
        else
            apagarComDoisFIlhos(aux);
        return dado;
    }

    private void apagarComDoisFIlhos(NoTriplo<T> aux) {
        
    }

    private void apagarComUmFilho(NoTriplo<T> aux) {

    }

    private void apagarNoFolha(NoTriplo<T> aux) {
        NoTriplo<T> nodo;
        NoTriplo<T> pai = nodo.getGenitor();
        if (pai == null) {
            raiz = null;
        } else {
            if (nodo.equals(pai.getEsquerda())) {
                pai.setEsquerda(null); // Se o nó é filho da esquerda, remove-o.
            } else {
                pai.setDireita(null); // Se o nó é filho da direita, remove-o.
            }
        }
    }

    private NoTriplo<T> buscar(T dado) {
    }

    @Override
    public boolean existe(T dado) {
        return false;
    }

    @Override
    public String imprimirPreOrdem() {
        return "";
    }

    @Override
    public String imprimirEmOrdem() {
        return "";
    }

    @Override
    public String imprimirPosOrdem() {
        return "";
    }
}
