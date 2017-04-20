package teacherproject.exception;

public class TeacherException extends Exception {

    private String message;

    public TeacherException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
