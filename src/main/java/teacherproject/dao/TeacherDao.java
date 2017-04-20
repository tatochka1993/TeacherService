package teacherproject.dao;


import teacherproject.model.Lesson;
import teacherproject.model.Teacher;

import java.util.List;

public interface TeacherDao {

    List<Teacher> findAllTeachers();

    void saveTeacher(Teacher teacher);

    void deleteTeacher(int id);

    void updateTeacher(Teacher teacher);

    void addLessonToParticularTeacher(int idTeaher, Lesson lesson);
}
