package Treino_provas_antigas.Treino.Treino;

public interface ControleDeReservaHotel {
    void adicionarReserva(String nome, String dataEntrada, String dataSaida, String servicosAdicionais);

    void removerReserva(int posicao); // uma vez que é uma lista de reservas

    void atualizarReserva(String nome, String dataEntrada, String dataSaida, String novosServicosAdicionais);

    Object[] listarReservas(); 

    Object buscarReserva(int posicao); 

    boolean estahVazia();

    boolean estahCheia();
    
}
