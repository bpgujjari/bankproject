<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>

<center>
<h1>SDFC BANK</h1>
<h2>EXTRADORANY SERVICES</h2>
<h2>EMPLOYEE REGISTRATION FORM</h2>
<fieldset>
<c:form method="post" action="/empregister" modelAttribute="emptemp">
EMPLOYEE ID      			  :<c:input path="id"/><br><br>
NAME			  		      :<c:input path="name"/><br><br>
DESIGNATION 			      :<c:input path="desg"/><br><br>
PASSWORD            		  :<c:input path="password"/><br><br>
CONFIRM PASSWORD           	  :<c:input path="cpassword"/><br><br>
SALARY           		      :<c:input path="salary"/><br><br>
<input type="submit" value="REGISTER"><br><br>
</center>
</c:form>
</fieldset>
</center>