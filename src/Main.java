public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("John Doe");
        student1.setAge(20);
        student1.setStudentId("S12345");

        Student student2 = new Student("Jane Smith", 22, "S54321");

        System.out.println(student1);
        System.out.println(student2);
    }
}
