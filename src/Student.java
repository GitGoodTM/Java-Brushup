public class Student {
    private int rollNo;
    private String name;
    private char grade;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public Student(int rollNo, String name, char grade){
        this.rollNo=rollNo;
        this.name=name;
        this.grade=grade;
    }

    @Override
    public String toString() {
        return "[Name: "+name+", RollNo.: "+rollNo+", Grade: "+grade+"] ";
    }
}
