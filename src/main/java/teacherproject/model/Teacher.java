package teacherproject.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class Teacher {

    private int id;
    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private List<Lesson> lessonList;

    public Teacher() {
    }

    public Teacher(int id, String name, Date date, List<Lesson> lessonList) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.lessonList = lessonList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (id != teacher.id) return false;
        if (!name.equals(teacher.name)) return false;
        if (!date.equals(teacher.date)) return false;
        return lessonList.equals(teacher.lessonList);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + lessonList.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", lessonList=" + lessonList +
                '}';
    }
}
