package Informationholder;

public class PersonInfo {
    private String name;
    private int age;
    public Personinfo() {
        name = "Maisha";
        age = 30;
    }
    public PersonInfo(java.lang.String name, int age) {
        this.name = name;
        this.age = age;
    }

    public java.lang.String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
