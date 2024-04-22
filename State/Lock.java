public class Lock {
    private LockState state;
    public Lock(){
        this.state = new ClosedState();
    }
    public void open(){
        if(!(this.state instanceof ClosedState)) throw new IllegalStateException("To open it must be closed");
        this.state.open();
        this.state = new OpenState();
    }
    public void close(){
        if(!(this.state instanceof OpenState)) throw new IllegalStateException("To close it must be open");
        this.state.close();
        this.state = new ClosedState();
    }
    public void lock(){
        if(!(this.state instanceof ClosedState)) throw new IllegalStateException("To lock it must be closed");
        this.state.block();
        this.state = new LockedState();
    }
    public void unlock(){
        if(!(this.state instanceof LockedState)) throw new IllegalStateException("To unlock it must be locked");
        this.state.unblock();
        this.state = new ClosedState();
    }
}
