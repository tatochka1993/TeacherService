package teacherproject.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class TeacherExceptionMapper implements ExceptionMapper<TeacherException> {

    @Override
    public Response toResponse(TeacherException e) {
        return Response.serverError().entity(e.getMessage()).build();
    }
}
