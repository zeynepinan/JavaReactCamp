package JavaCampHomework3;

public class Main {

	public static void main(String[] args) {
		
		Student student= new Student();
		student.id=1;
		student.firstName="Zeynep ";
		student.lastName="İnan";
		student.schoolName="Kocaeli Üniversitesi";
		student.email="zey@gmail.com";
		student.address="Manisa";
		student.courseName="Java-React";
		student.homeworkName="3.ödev";
		
		Instructor instructor= new Instructor();
		instructor.id=2;
		instructor.firstName="Engin ";
		instructor.lastName="Demiroğ";
		instructor.email="engin@gmail.com";
		instructor.twitterUserName="engindemirog";
		instructor.youtubeUserName="engindemirog";
		instructor.courseName="Java-react ";
		
		

		UserManager userManager=new UserManager();
		userManager.add(instructor);
		userManager.add(student);
		
		userManager.logIn(instructor);
		userManager.logIn(student);
		
		userManager.logOut(instructor);
		userManager.logOut(student);
		
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addCourse(instructor);
		
		StudentManager studentManager=new StudentManager();
		studentManager.submissionOfHomework(student);
	}

}
