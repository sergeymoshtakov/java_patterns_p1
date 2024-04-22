public class File implements FileSystemComponent{
    private boolean contained;
    private String name;
    public File(String name){
        this.setName(name);
        contained = false;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public boolean getContained() {
        return contained;
    }

    @Override
    public void setContined(boolean b) {
        this.contained = b;
    }

    @Override
    public void print() {
        System.out.println(this.getName());
    }
}
