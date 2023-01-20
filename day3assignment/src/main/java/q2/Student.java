package q2;

import java.util.List;

import q2.Student;

public class Student {

	private int roll;
	private String name;
	private int marks;
	
	private List<Student> students;

	public Student() {
		
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Student(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public List<Student> getStudents() {
		return students;
	}
	
	public void displayDetails(){
        System.out.println("Student roll number : "+roll);
        System.out.println("Student name : "+name);
        System.out.println("Student marks : "+marks);
    }
	
	@Override
    public boolean equals(Object obj) {
        Student s1 = this;
        Student s2 = (Student) obj;
        if (s1.roll == s2.roll && s1.name.equals(s2.name) && s1.marks == s2.marks)
            return true;
        else
            return false;
    }
	
	@Override
    public int hashCode() {
        return this.roll;
    }
}
