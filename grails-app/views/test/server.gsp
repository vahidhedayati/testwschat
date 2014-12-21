
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'aa.label', default: 'aa')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
	</head>
	<body>
	
<chat:clientConnect
user="masteruser" 
receiver="clientuser"
strictMode="false"
masterNode="true"
divId="myNode"
message="hi this is an automated websocket SERVER message"
actionMap="['do_task_1': 'performed_task_1', 'do_task_2': 'performed_task_2', 'do_task_3': 'performed_task_3', 'close_my_connection': 'close_connection', 'list_domain': 'testwschat.userbase']"
/>
-
<div id="myNode">
</div>
</body>
</html>