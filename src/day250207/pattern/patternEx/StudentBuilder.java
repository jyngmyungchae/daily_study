package day250207.pattern.patternEx;

public class StudentBuilder {
    private int id;
    private String name;
    private String major;
    private String grade = "freshman";
    private String phoneNumber;
    private String address;

    public StudentBuilder(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public StudentBuilder setGrade(String grade) {
        this.grade = grade;
        return this;
    }

    public StudentBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    public Student build(){
        return new Student(id,name,major,grade,phoneNumber,address);
    }

}

