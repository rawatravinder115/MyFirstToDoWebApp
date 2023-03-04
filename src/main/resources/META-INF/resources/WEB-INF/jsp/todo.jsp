<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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
    <title>Add Todos Page</title>
</head>
<body>
<%-- recommendation for a bootstrap that all the body content should be within
        div tag of class container --%>
    <div class="container">
        <h1>Enter Todo Details</h1>
        <form:form method="post" modelAttribute="todo">

        <fieldset class="mb-3">
            <form:label path="description">description</form:label>
            <form:input type="text" path="description"
                        required="required"/>
            <form:errors cssClass="text-warning" path="description" />
        </fieldset>
            <fieldset class="mb-3">
                <form:label path="targetDate">Target Date</form:label>
                <form:input type="text" path="targetDate"
                            required="required"/>
                <form:errors cssClass="text-warning" path="targetDate" />
            </fieldset>

            <form:input type="hidden" path="id"  />
            <form:input type="hidden" path="done" />
            <input type="submit" class="btn btn-success" />
        </form:form>
    </div>


<%--    // js and jquery file should be placed at the end of body tag--%>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>

</html>