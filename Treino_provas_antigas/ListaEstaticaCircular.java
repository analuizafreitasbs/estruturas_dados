package Treino_provas_antigas.Treino.Treino;

public class ListaEstaticaCircular {

    private Object[] dados;          // Array que guarda os elementos
    private int ponteiroInicio;      // Índice do primeiro elemento
    private int ponteiroFim;         // Índice do último elemento
    private int quantidade;          // Quantidade de elementos armazenados

    public ListaEstaticaCircular(int tamanho) {
        dados = new Object[tamanho];
        ponteiroInicio = 0;
        ponteiroFim = -1;
        quantidade = 0;
    }

    public ListaEstaticaCircular() {
        this(10); // se não passar nada, cria com tamanho 10
    }

    // Avança o ponteiro circularmente
    private int avancar(int ponteiro) {
        return (ponteiro + 1) % dados.length;
    }

    // Retrocede o ponteiro circularmente
    private int retroceder(int ponteiro) {
        return (ponteiro - 1 + dados.length) % dados.length;
    }

    // Mapeia a posição lógica (0,1,2...) para a posição física no array
    private int mapeamento(int posicao) {
        return (ponteiroInicio + posicao) % dados.length;
    }

    public Object remover(int posicao) {
        Object removido = null;

        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                int posicaoFisica = mapeamento(posicao);

                removido = dados[posicaoFisica];

                for (int i = posicao; i != ponteiroFim; i = avancar(i)) {
                    int proximaPosicao = avancar(i);
                    dados[mapeamento(i)] = dados[mapeamento(proximaPosicao)];
                }
                quantidade--;

                ponteiroFim = retroceder(ponteiroFim);

            } else {
                System.out.println("Posição inválida!");
            }
        } else {
            System.out.println("Lista vazia!");

        } return removido;
        
    }

    // Verifica se a lista está cheia
    public boolean estaCheia() {
        return quantidade == dados.length;
    }

    // Verifica se a lista está vazia
    public boolean estaVazia() {
        return quantidade == 0;
    }

    // Imprime todos os elementos da lista
    public String imprimir(int posicao) {
       if (posicao >= 0 && posicao < quantidade) {
        for (int i = 0; i < quantidade; i++) {
            int posicaoFisica = mapeamento(i);
            System.out.print(dados[posicaoFisica] + " ");
        } 
        } else {
            System.out.println("Posição inválida!");
       }

    }
}
