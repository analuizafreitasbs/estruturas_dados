package Pilhas;

public class Pilha_Main_01 {
    public static void main(String[] args) {
        Pilha_01 p = new Pilha_01();

        p.push(5);
        p.push(10);
        p.push(3);
        p.push(2);
        p.push(88);
        
        while(!p.isEmpty()) {

            int elementos = p.pop();
            System.out.println("Desempilhei " +elementos);
        }

    }
}
