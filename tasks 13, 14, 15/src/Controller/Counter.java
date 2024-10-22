package Controller;

public class Counter implements AutoCloseable {
    private int count = 0;

    @Override
    public void close() {
        System.out.println("Counter closed");
    }

    public void increase() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
