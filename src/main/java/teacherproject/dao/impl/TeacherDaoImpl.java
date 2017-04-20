package teacherproject.dao.impl;

import org.springframework.stereotype.Repository;
import teacherproject.dao.TeacherDao;
import teacherproject.exception.TeacherException;
import teacherproject.model.Lesson;
import teacherproject.model.Teacher;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository("teacherDao")
public class TeacherDaoImpl implements TeacherDao {

    private List<Teacher> teacherList = new ArrayList<Teacher>();

    public TeacherDaoImpl() {
        List<Lesson> lessons1 = new ArrayList<Lesson>();
        lessons1.add(new Lesson(1, "sss", 500));
        lessons1.add(new Lesson(2, "ddd", 400));
        teacherList.add(new Teacher(1, "Anna", new Date(), lessons1));

        List<Lesson> lessons2 = new ArrayList<Lesson>();
        lessons2.add(new Lesson(1, "rrr", 567));
        lessons2.add(new Lesson(2, "yhyy", 456));
        teacherList.add(new Teacher(2, "Kirill", new Date(), lessons2));
    }

    @Override
    public List<Teacher> findAllTeachers() {
        return teacherList;
    }

    @Override
    public void saveTeacher(Teacher teacher) {
        if (teacherList.contains(teacher)) {
            new TeacherException("Teacher is exist");
        }
        teacherList.add(teacher);
    }

    @Override
    public void deleteTeacher(int id) {
        if (teacherList.get(id) != null) {
            teacherList.remove(id);
        } else {
            new TeacherException("There is no teacher with such id");
        }
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        if (teacherList.get(teacher.getId()) != null) {
            teacherList.set(teacher.getId(), teacher);
        } else {
            new TeacherException("There is no teacher to update");
        }
    }

    @Override
    public void addLessonToParticularTeacher(int idTeaher, Lesson lesson) {
        if (teacherList.get(idTeaher) != null) {
            teacherList.get(idTeaher).getLessonList().add(lesson);
        } else {
            new TeacherException("There is no teacher with such id");
        }
    }
}
