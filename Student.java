public class Student {

    int rollnum;
    String name;
    String course;
    int marks;

    public Student(int rollnum, String name, String course, int marks) {

        this.rollnum = rollnum;
        this.name = name;
        this.course = course;
        this.marks = marks;

    }

    public void displayStudentDetails() {

        System.out.println("Student Roll No : " + rollnum);
        System.out.println("Student Name : " + name);
        System.out.println("Course : " + course);
        System.out.println("Marks : " + marks);

    }

    public void addBonusMarks(int bonusmarks) {

        this.marks = this.marks + bonusmarks;

        System.out.println("Updated Marks : " + marks);

    }

    public static void main(String[] args) {

        Student s1 = new Student(116, "Sakshi", "Computer Science", 99);

        s1.displayStudentDetails();
        s1.addBonusMarks(6);

        System.out.println("*------*------*-----*------*");

        Student s2 = new Student(103, "Manaswi", "MCA", 99);

        s2.displayStudentDetails();
        s2.addBonusMarks(6);

    }
}