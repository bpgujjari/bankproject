<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="c"%>
<h1>EMPLOYEE LOGIN PAGE...</h1>
<fieldset>
<c:form method="post" action="/emplogin" modelAttribute="emp">
EMPLOYEE ID      			  :<c:input path="id"/><br><br>
NAME			  		      :<c:input path="name"/><br><br>
PASSWORD            		  :<c:input path="password"/><br><br>
<input type="submit" value="LOGIN"><br><br>
</center>
</c:form>
</fieldset>