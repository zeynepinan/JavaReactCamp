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
		
		
		Teacher teacher1=new Teacher(1,"Engin ","DEM�RO�");
		Teacher teacher2=new Teacher(2,"Mehmet Emin ","KURTBO�A");
		
		Teacher[] teachers= {teacher1,teacher2};
		System.out.println(teachers.length);
		for(Teacher teacher:teachers) {
			System.out.println(teacher.name+ teacher.surname);
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
