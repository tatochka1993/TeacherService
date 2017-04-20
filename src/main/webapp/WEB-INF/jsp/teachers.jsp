<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>TEACHERS</title>

</head>
<body>
<div>
    <br><br>
    <h2>TEACHERS</h2>
    <br>

    <form:form method="GET" acceptCharset="UTF-8">
        <input type="submit" onclick="getTeachersList()" value="GET_ALL_TEACHERS" style="width:250px;height:25px" />
    </form:form>
    <h1><p id="demo"></p></h1>

    <%--<form:form method="GET" action= "" acceptCharset="UTF-8">--%>
        <%--<input type="submit" onclick="" value="DELETE_TEACHER" style="width:250px;height:25px" />--%>
    <%--</form:form>--%>

    <%--<form:form method="GET" action= "" acceptCharset="UTF-8">--%>
        <%--<input type="submit" onclick="" value="UPDATE_TEACHER" style="width:250px;height:25px" />--%>
    <%--</form:form>--%>

    <%--<form:form method="GET" action= "" acceptCharset="UTF-8">--%>
        <%--<input type="submit" onclick="" value="CREATE_TEACHER" style="width:250px;height:25px" />--%>
    <%--</form:form>--%>

    <%--<form:form method="GET" action= "" acceptCharset="UTF-8">--%>
        <%--<input type="submit" onclick="" value="ADD_LESSON_TO_TEACHER" style="width:250px;height:25px" />--%>
    <%--</form:form>--%>

</div>



<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="/static/js/getTeachersList.js"></script>
</body>
</html>