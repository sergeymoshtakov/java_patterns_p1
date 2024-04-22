public class Main {
    public static void main(String[] args) {
        Lock lock = new Lock();

        lock.open();
        lock.close();
        lock.lock();
        lock.unlock();
    }
}
