<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<body>
    <c:if test="${not empty user}">
        Welcome: ${user.name}
    </c:if>

	<h1>Car Details</h1>

	<p>
	    <c:if test="${not empty car}">
            ${car.name}: $${car.price}
        </c:if>

        <c:if test="${empty car}">
            Car not found
        </c:if>
	</p>
	
</body>
</html>