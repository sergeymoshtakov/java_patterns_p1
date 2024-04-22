public interface Observer {
    public void update();
    public void addObservable(Subject sub);
    public void removeObservable(Subject sub);
}
