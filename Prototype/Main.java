public class Main {
    public static void main(String[] args){
        Resume r1 = new Resume("a", "b");
        Resume r2 = r1.clone();
        System.out.println(r1.getInfo());
        System.out.println(r2.getInfo());
    }
}
