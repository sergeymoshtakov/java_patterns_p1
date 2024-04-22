public interface LockState {
    public void open();
    public void close();
    public void unblock();
    public void block();
}
