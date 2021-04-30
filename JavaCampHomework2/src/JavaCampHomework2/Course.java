package JavaCampHomework2;

public class Course {

	public Course() {
		
	};
	public Course(int id,String courseName, String teacherName){
		this.id=id;
		this.courseName=courseName;
		this.teacherName=teacherName;
	};

	int id;
	String courseName;
	String teacherName;
}
