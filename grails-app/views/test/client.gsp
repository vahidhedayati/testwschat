
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'aa.label', default: 'aa')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
	</head>
	<body>
	
<chat:clientConnect
user="clientuser" 
receiver="masteruser"
message="do_task_1"
strictMode="false"
masterNode="false"
divId="myNode"
actionMap="['performed_task_1': 'do_task_2', 'performed_task_2': 'do_task_3', 'performed_task_3': 'close_my_connection' ]"
/>
-
<div id="myNode">
</div>
</body>
</html>