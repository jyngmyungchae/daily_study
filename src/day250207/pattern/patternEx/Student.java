package day250207.pattern.patternEx;

public class Student {
    private int id;
    private String name;
    private String major;
    private String grade = "freshman";
    private String phoneNumber;
    private String address;

    public Student(int id, String name, String major, String grade, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.grade = grade;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new StudentBuilder(1, "aa", "major1")
                .setPhoneNumber("010-1234-5678")
                .setAddress("seoul")
                .build();

        Student student2 = new StudentBuilder(2, "bb", "major2")
                .setGrade("F")
                .setPhoneNumber("010-9876-5432")
                .build();

        System.out.println(student1);
        System.out.println(student2);

    }
}
