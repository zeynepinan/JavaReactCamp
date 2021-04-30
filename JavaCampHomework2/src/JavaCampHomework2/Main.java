package JavaCampHomework2;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"Yaz�l�m Geli�tirici Kamp� C#-Angular","Engin DEM�RO�");
		Course course2=new Course(2,"Yaz�l�m Geli�tirici Kamp� Java-React","Engin DEM�RO�");
		Course course3=new Course(3,"Programlamaya Giri� ��in Temel Kurs","Engin DEM�RO�");

		Course[] courses= {course1,course2,course3};
		
		for(Course course:courses) {
			System.out.println(course.courseName +" "+ course.teacherName);
		};
		
		
		Instructor instructor1=new Instructor(1,"Engin ","DEM�RO�");
		Instructor instructor2=new Instructor(2,"Mehmet Emin ","KURTBO�A");
		
		Instructor[] instructors= {instructor1,instructor2};
		System.out.println(instructors.length);
		for(Instructor instructor:instructors) {
			System.out.println(instructor.name+ instructor.surname);
		};
		
		CourseManager courseManager=new CourseManager();
		courseManager.registerCourse(course1);
		
		courseManager.registerCourse(course2);
		
		courseManager.registerCourse(course3);
		
		courseManager.previousLesson(course3);
		courseManager.previousLesson(course2);
		courseManager.previousLesson(course1);
	}

}
