<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head><title>Create User</title></head>
<body>
  <form:form action="/myapp/createUser" method="post" modelAttribute='user'>
	   Enter User Name:<form:input  path="name"/>
	   Enter age :<form:input path="age"/>
	   Enter location :<form:input path="location"/>
	   <input type="submit">
  </form:form>
</body>
</html>