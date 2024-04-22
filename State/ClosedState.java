public class ClosedState implements LockState{
    @Override
    public void open() {
        System.out.println("Opening");
    }

    @Override
    public void close() {
        // already closed
    }

    @Override
    public void unblock() {
        // cannot unblock
    }

    @Override
    public void block() {
        System.out.println("Blocking");
    }
}
