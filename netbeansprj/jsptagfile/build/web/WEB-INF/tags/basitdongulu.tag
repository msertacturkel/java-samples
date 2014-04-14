
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute  name="tekrar"%>
<c:if test="${tekrar==null}">
    <c:set var="tekrar" value="1"/>
</c:if>
<%@attribute required="true" name="text"%>
<c:forEach begin="1" end="${tekrar}">
    <h2>${text}</h2>
</c:forEach>
