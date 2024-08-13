package javabean;

public class StudentDetails {

	public static void main(String[] args) {
		Student s1=new Student("Sai",10);
		s1.setStudentId(101);
		s1.setStudentName("Loki");
		System.out.println(s1.getStudentId()+" "+s1.getStudentName());
	}
	

}
