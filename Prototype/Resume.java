public class Resume implements Cloneable{
    private String name;
    private String email;
    public Resume(String name, String email){
        this.setName(name);
        this.setEmail(email);
    }
    public Resume(Resume resume){
        this.setName(resume.getName());
        this.setEmail(resume.getEmail());
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getInfo(){
        return this.getName() + " : " + this.getEmail();
    }
    @Override
    public Resume clone() {
        return new Resume(this);
    }
}
