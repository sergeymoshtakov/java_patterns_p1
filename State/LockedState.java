public class LockedState implements LockState{
    @Override
    public void open() {
        // cannot open
    }

    @Override
    public void close() {
        // cannot close
    }

    @Override
    public void unblock() {
        System.out.println("Unblocking");
    }

    @Override
    public void block() {
        // already blocked
    }
}
