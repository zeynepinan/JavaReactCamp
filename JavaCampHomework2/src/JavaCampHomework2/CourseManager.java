package JavaCampHomework2;

public class CourseManager {

	public void registerCourse(Course course) {
		System.out.println(course.courseName + " Kursuna kay�t olundu.");
	};
	
	public void previousLesson(Course course) {
		System.out.println(course.courseName+ " kursunda �nceki derse geri d�n�ld�");
	};
}
