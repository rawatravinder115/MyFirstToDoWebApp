<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>

    <%--
    /META-INF/resources/webjars/bootstrap/5.1.3/css/bootstrap.min.css
    /META-INF/resources/webjars/bootstrap/5.1.3/js/bootstrap.min.js
    /META-INF/resources/webjars/jquery/3.6.0/jquery.min.js
--%>
<%--    // css file link should be placed in the starting of head--%>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
            rel="stylesheet"  > /*show that its csc file*/
    <title>List todos pages</title>
</head>
    <body>
    <div>
        <h1>Your Todos</h1>
        <table class="table">
            <thead>
            <tr>
                <th>id</th>
                <th>Description</th>
                <th>Target Date</th>
                <th>Is Done?</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.description}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>


<%--    // js and jquery file should be placed at the end of body tag--%>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>

</html>