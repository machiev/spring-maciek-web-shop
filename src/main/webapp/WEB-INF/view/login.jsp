<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>

	<h1>Login to Cars Shop</h1>

    <form:form method="POST" modelAttribute="newUser">
        <p>
            Name:
            <input type="text" name="name" />
        </p>
        <input type="submit" />
    </form:form>

</body>
</html>