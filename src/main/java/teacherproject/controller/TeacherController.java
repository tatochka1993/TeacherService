package teacherproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import teacherproject.model.Lesson;
import teacherproject.model.Teacher;
import teacherproject.service.TeacherService;

import java.util.List;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "/teachers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Teacher>> getAllTeachersGet() {
        List<Teacher> teacherList = teacherService.findAllTeachers();
        return new ResponseEntity<>(teacherList, HttpStatus.OK);
    }

    @RequestMapping(value = "/teachers", method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveTeacherPost(Teacher teacher) {
        teacherService.saveTeacher(teacher);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/teachers/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteTeacherDelete(@PathVariable("id") int id) {
        teacherService.deleteTeacher(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/teachers", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateTeacherPut(Teacher teacher) {
        teacherService.updateTeacher(teacher);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/teachers/addLesson}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addLesonToTeacherPost(Teacher teacher, Lesson lesson) {
        teacherService.addLessonToParticularTeacher(teacher.getId(), lesson);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
