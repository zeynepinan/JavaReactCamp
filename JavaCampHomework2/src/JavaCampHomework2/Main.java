package JavaCampHomework2;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"Yazýlým Geliþtirici Kampý C#-Angular","Engin DEMÝROÐ");
		Course course2=new Course(2,"Yazýlým Geliþtirici Kampý Java-React","Engin DEMÝROÐ");
		Course course3=new Course(3,"Programlamaya Giriþ Ýçin Temel Kurs","Engin DEMÝROÐ");

		Course[] courses= {course1,course2,course3};
		
		for(Course course:courses) {
			System.out.println(course.courseName +" "+ course.teacherName);
		};
		
		
		Instructor instructor1=new Instructor(1,"Engin ","DEMÝROÐ");
		Instructor instructor2=new Instructor(2,"Mehmet Emin ","KURTBOÐA");
		
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
