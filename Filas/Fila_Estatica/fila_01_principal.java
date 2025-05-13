package Filas;

public class fila_01_principal {
    public static void main(String[] args) {

        fila_01 fila = new fila_01();
        fila.inserir(10);
        fila.inserir(2);
        fila.inserir(5);
        fila.inserir(16);
        fila.inserir(81);

        while(!fila.isEmpty()) {
            int x = fila.retirar();
            System.out.println("Retirei o elemento: "+x);
        }   
    }
    
}
