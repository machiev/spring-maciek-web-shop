<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<body>
    <c:if test="${not empty user}">
        Welcome: ${user.name}
    </c:if>

	<h1>Cars</h1>
	
	<c:forEach items="${carList}" var="car">
		<p>
			${car.name}: $${car.price} <a href="${car.id}" role="button" >Details</a>
		</p>
	</c:forEach>

</body>
</html>