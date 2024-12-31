package etc.record;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import etc.record.Curriculum.Course;
import etc.record.Curriculum.Course.Usecase;

public class SealedRecord {

    public static void main(String[] args) {

        var courseId = UUID.randomUUID();
        Course course = new Course(courseId, null, null, null, null, null, null, null, true);
        System.out.println("origin course : " + course);

        Usecase service = new CourseService();
        var savedCourse = service.save(course);
        System.out.println("saved course : " + savedCourse);

        assert courseId.equals(savedCourse.courseId()) : "아이디는 동일해야합니다.";
    }
}

sealed interface Curriculum {

    record Course(
            UUID courseId,
            String name,
            Integer round,
            String target,
            String content,
            UUID classManagerId,
            LocalDate startDate,
            LocalDate endDate,
            Boolean closed) implements Curriculum {
        interface Usecase {
            public Course save(Course course);

            public List<Course> courses();

            public Course findCourse(UUID courseId);
        }
    }

}

class CourseService implements Course.Usecase {

    @Override
    public Course save(Course course) {
        System.out.println("course saved. courseId is " + course.courseId());
        return this.findCourse(course.courseId());
    }

    @Override
    public List<Course> courses() {
        throw new UnsupportedOperationException("Unimplemented method 'courses'");
    }

    @Override
    public Course findCourse(UUID courseId) {
        return new Course(courseId, null, null, null, null, null, LocalDate.now(), LocalDate.now().plusDays(30), false);
    }

}