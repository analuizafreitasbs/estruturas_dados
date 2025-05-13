package Filas.Fila_Dinamica.src;

/** Essa interface indica as operações que uma classe que deseja
 * ter o comportamento de ser enfileravel precisa
 *
 * @author Ana Luiza
 * @version 1.0
 * @since 2025-05-12
 */


// java -cp bin Filas.Fila_Dinamica.scr.FilaDinamicaMain

public interface Enfileiravel<T> {

    void enfileirarInicio(T dado);
    void enfileirarFim(T dado);

    T frente();
    T tras();

    void atualizarInicio(T dado);
    void atualizarFim(T dado);

    T desenfileirarInicio();
    T desenfileirarFim();

    boolean estaVazia();
    boolean estaCheia();

    String imprimirTrasPraFrente();
    String imprimirFrentePraTras();
}
