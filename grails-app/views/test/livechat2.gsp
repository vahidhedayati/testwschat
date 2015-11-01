
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'aa.label', default: 'aa')}" />
		<title>Example custom live chat</title>
	</head>
	<body>

<g:form method="post" action="livechat3">
<g:select name="user"from="${['happy_user','sad_user','silly_user'] }"/>
<g:select name="room"from="${['happy_room','sad_room','silly_room'] }"/>
<g:submitButton name="LiveChat Me There"/>
</g:form>


</body>
</html>
