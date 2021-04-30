package JavaCampHomework2;

public class CourseManager {

	public void registerCourse(Course course) {
		System.out.println(course.courseName + " Kursuna kayýt olundu.");
	};
	
	public void previousLesson(Course course) {
		System.out.println(course.courseName+ " kursunda önceki derse geri dönüldü");
	};
}
