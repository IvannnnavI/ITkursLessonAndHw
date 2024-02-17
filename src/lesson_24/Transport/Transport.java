package lesson_24.Transport;

public abstract class Transport {
    protected int capacity;

    public Transport(int capacity) {
        this.capacity = capacity;
    }
    abstract void takePassenger();

    public int getCapacity() {
        return capacity;
    }
}

