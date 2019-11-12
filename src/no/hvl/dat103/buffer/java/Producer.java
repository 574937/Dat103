package no.hvl.dat103.buffer.java;

public class Producer extends Thread{
    BBuffer buffer;

    public Producer(BBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        do{
            buffer.produce();
        }while (true);
    }
}
