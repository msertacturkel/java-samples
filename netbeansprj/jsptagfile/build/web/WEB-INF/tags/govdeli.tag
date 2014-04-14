<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute  name="tekrar"%>
<jsp:doBody var="govde" scope="page"/><%--govde--%>
<c:if test="${tekrar==null}">
    <c:set var="tekrar" value="1"/>
</c:if>

<c:forEach begin="1" end="${tekrar}">
    <h2>${govde}</h2>
</c:forEach>