public class OpenState implements LockState{
    @Override
    public void open() {
        // already opened
    }

    @Override
    public void close() {
        System.out.println("Closing");
    }

    @Override
    public void unblock() {
        // cannot unblock
    }

    @Override
    public void block() {
        // cannot block
    }
}
