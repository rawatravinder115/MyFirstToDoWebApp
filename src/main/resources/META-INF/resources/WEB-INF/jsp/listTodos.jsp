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
            rel="stylesheet"  >
<%--        /*show that its csc file*/--%>
    <title>List todos pages</title>
</head>
<body>
<%-- recommendation for a bootstrap that all the body content should be within
        div tag of class container --%>
    <div class="container">
        <h1>Your Todos</h1>
        <table class="table">
            <thead>
            <tr>
<%--                <th>id</th>--%>
                <th>Description</th>
                <th>Target Date</th>
                <th>Is Done?</th>
                <th></th>>
                <th></th>>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
<%--                    <td>${todo.id}</td>--%>
                    <td>${todo.description}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                    <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">DELETE</a></td>
                    <td><a href="update-todo?id=${todo.id}" class="btn btn-success">UPDATE</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

        <a href="add-todo" class="btn btn-success">Add Todo</a>

    </div>


<%--    // js and jquery file should be placed at the end of body tag--%>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>

</html>