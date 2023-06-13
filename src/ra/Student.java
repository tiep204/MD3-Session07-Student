package ra;

public class Student {
    public String name = "John";
    public String classs = "CO2";

    public Student() {
    }

    public Student(String name, String classs) {
        this.name = name;
        this.classs = classs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }
}
