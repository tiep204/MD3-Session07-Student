package ra;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName() +" "+student.getClasss());
        student.setName("Tiep update");
        student.setClasss("jv03");
        System.out.println(student.getName()+" "+student.getClasss());
    }
}
