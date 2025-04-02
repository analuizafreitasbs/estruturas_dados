package Pilhas;

public class Pilha_01 {

    int elementos[];
    int topo;

    // construtor
    public Pilha_01() {
        elementos = new int[10];
        topo = -1;
    }

    public void push(int e) {
        if (isFull()) {
            throw new RuntimeException("Stack overflow");
        }
        topo++;
        elementos[topo] = e;

    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack overflow");
        }
        int e;
        e = elementos[topo];
        topo--;
        return e;

    }

    public boolean isEmpty() {
        if (topo == -1) {
        return true; 
        }
        return false;
        // ou return(topo == -1);

    }

    public boolean isFull() {
        return (topo == 9);


    }
    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack overflow");
        }
        topo++;
        return elementos[topo];

    }
}
