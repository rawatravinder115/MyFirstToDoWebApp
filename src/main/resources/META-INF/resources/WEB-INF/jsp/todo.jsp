
<%@ include file="common/header.jspf" %>

<%-- recommendation for a bootstrap that all the body content should be within
    div tag of class container --%>
<%@ include file="common/navigation.jspf" %>
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
<%@ include file="common/footer.jspf"%>
<script type="text/javascript">
$('#targetDate').datepicker({
    format: 'yyyy-mm-dd'
});
</script>
