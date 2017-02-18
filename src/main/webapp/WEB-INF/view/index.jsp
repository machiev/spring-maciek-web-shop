<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

	<h1>Welcome to Cars Shop</h1>

    <p>
	    <c:if test="${not empty user}">
            Welcome: ${user.name}
        </c:if>

        <c:if test="${empty user}">
            <a href="login">Login</a>
        </c:if>
	</p>

	<a href="car/list">List cars...</a>

</body>
</html>