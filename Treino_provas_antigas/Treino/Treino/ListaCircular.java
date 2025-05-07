package Treino_provas_antigas.Treino.Treino;

import Listas.Listavel;

public class ListaCircular implements Listavel {

    private int ponteiroInicio;
    private int ponteiroFim;
    private Object[] dados;
    private int quantidade;

    public ListaCircular(int tamanho) { // construtores
        ponteiroInicio = 0;
        ponteiroFim = -1;
        quantidade = 0;
        dados = new Object[tamanho];
    }

    @Override
    public void anexar(Object dado) {
        if (!estaCheia()) {
            ponteiroFim++;
            if (ponteiroFim == dados.length) {
                ponteiroFim = 0;
            }
            quantidade++;
            dados[ponteiroFim] = dado;
        } else {
            System.out.println("Lista cheia");
        }
    }

    @Override
    public void inserir(int posicao, Object dado) {


    }

    @Override
    public Object selecionar(int posicao) {
        Object dadosAux = null;

        if (!estaVazia()) {
            if ((posicao >= 0) && (posicao < quantidade)) {
                int posicaoFisica = (ponteiroInicio + posicao) % dados.length;
                dadosAux = dados[posicaoFisica];
            } else {
                System.out.println("indice invalido!");
            }
        } else {
            System.out.println("Lista vazia!!");
        }
        return dadosAux;
    }

    @Override
    public Object[] selecionarTodos() {
        Object[] dadosAux = null;
        if (!estaVazia()) {
            dadosAux = new Object[quantidade];
            for (int i = 0, ponteiroAux = ponteiroInicio; i < quantidade; i ++, ponteiroAux++) {
                if (ponteiroAux == dados.length); {
                    ponteiroAux = 0;
                }
                dadosAux[i] = dados[ponteiroAux];
            }
        } return dadosAux;
    }

    @Override
    public void atualizar(int posicao, Object novoDado) {
        if (!estaVazia()) {
            if ((posicao >= 0) && (posicao < quantidade)) {
                int posicaoFisica = (ponteiroInicio + posicao) % dados.length;
                dados[posicaoFisica] = novoDado;
            } else {
                System.out.println("indice invalido");
            }
        } else {
            System.out.println("lista vazia");
        }

    }

    @Override
    public Object apagar(int posicao) {
        return null;
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
        return "";
    }
}
