import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private boolean contained;
    private String name;
    private final List<FileSystemComponent> componentList;
    public Folder(String name){
        this.setName(name);
        componentList = new ArrayList<>();
        contained = false;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void add(FileSystemComponent component){
        if(component.getContained()){
            throw new IllegalStateException("component already busy");
        }
        componentList.add(component);
        component.setContined(true);
    }

    public void remove(FileSystemComponent component){
        componentList.remove(component);
        component.setContined(false);
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
        for(FileSystemComponent f : componentList){
            System.out.print("\t");
            f.print();
        }
    }
}
