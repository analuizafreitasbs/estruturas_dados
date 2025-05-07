package Pilhas;

public interface Empilhavel {
    void empilhar(Object dado);
    void atualizar(Object dado);
    Object desempilhar();
    Object espiar();
    Boolean estaVazia();
    boolean estaCheia();
    String imprimir();
}
