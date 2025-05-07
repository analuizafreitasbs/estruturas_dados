package Treino_provas_antigas.Treino.Treino;

public interface listavel {
    void anexar(Object dado);
    void inserir(int posicao, Object dado);
    Object selecionar(int posicao);
    Object[] selecionarTodos();
    void atualizar(int posicao, Object novoDado);
    Object apagar(int posicao);
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}
