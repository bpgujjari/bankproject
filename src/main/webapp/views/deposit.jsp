<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<center>
<center>
<h1>SDFC BANK</h1>
<h2>EXTRADORANY SERVICES</h2>
<a href="/reg">NEW ACCOUNT</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/balance">BALANCE</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/deposit">DEPOSIT</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/withdraw">WITHDRAW</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/transfer">TRANSFER</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/about">ABOUT</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/close">CLOSE</a>&nbsp;&nbsp;&nbsp;&nbsp;

</center>
<fieldset>
<h1>DEPOSIT YOUR MONEY</h1>
<c:form method="post" action="/depositamt" modelAttribute="bank">
BANK   AC/NO:      			 :<c:input path="acno"/><br><br>
NAME					     :<c:input path="name"/><br><br>
PASSWORD            		  :<c:input path="password"/><br><br>
AMOUNT   						:<c:input path="amount"/><br><br>
<input type="submit" value="DEPOSIT"><br><br>
</center>
</fieldset>
</c:form>