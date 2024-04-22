public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.txt");

        Folder folder = new Folder("Folder");
        folder.add(file1);
        folder.add(file2);

        folder.print();
    }
}
