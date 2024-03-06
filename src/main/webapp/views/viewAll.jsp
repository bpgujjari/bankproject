<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table border="1" >

<th>A/C NO</th>
<th>NAME</th>
<th>PASSWORD</th>
<th>AMOUNT</th>
<th>ADDRESS</th>
<th>MOBILE</th>
<th>EDIT</th>
<th>DELETE</th>


<c:forEach var="cust" items="${cs}">
<tr>
<td>${cust.acno}</td>
<td>${cust.name}</td>
<td>${cust.password}</td>
<td>${cust.amount}</td>
<td>${cust.address}</td>
<td>${cust.mobile}</td>
<td> <a href="/edit/${cust.acno}">edit</a> </td>
<td> <a href="/delete/${cust.acno}">delete</a> </td>
</tr>

</c:forEach>




</table>