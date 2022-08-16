import java.util.Comparator;
import java.util.List;

public class Lesson {
    public static List<Course> uniqueCourses(List<Student> students) {
        return students.stream().flatMap(s -> s.getAllCourses().stream()).distinct().toList();
    }

    public static List<Student> curiousStudents(List<Student> students) {
        Comparator<Student> comparator = Comparator.comparingInt(s -> s.getAllCourses().size());
        return students.stream().sorted(comparator.reversed()).toList().subList(1, 3);
    }

    public static List<Student> courseStudents(List<Student> students, Course course) {
        return students.stream().filter(s -> s.getAllCourses().contains(course)).toList();
    }
}
