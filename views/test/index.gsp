
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'something.label', default: 'something')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
	</head>
	<body>
	>>
	
<chat:clientConnect
user="randomUser" 
message="haha I am just a random client sending a message and disconnecting"

autodisco="true"
strictMode="false"
/>
-
</body>
</html>