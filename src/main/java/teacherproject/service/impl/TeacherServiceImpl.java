package teacherproject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teacherproject.dao.TeacherDao;
import teacherproject.model.Lesson;
import teacherproject.model.Teacher;
import teacherproject.service.TeacherService;

import java.util.List;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public List<Teacher> findAllTeachers() {
        return teacherDao.findAllTeachers();
    }

    @Override
    public void saveTeacher(Teacher teacher) {
        teacherDao.saveTeacher(teacher);
    }

    @Override
    public void deleteTeacher(int id) {
        teacherDao.deleteTeacher(id);
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        teacherDao.updateTeacher(teacher);
    }

    @Override
    public void addLessonToParticularTeacher(int idTeaher, Lesson lesson) {
        teacherDao.addLessonToParticularTeacher(idTeaher, lesson);
    }
}
