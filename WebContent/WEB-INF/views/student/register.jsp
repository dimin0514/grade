<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로또 등록</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<h1>등록절차</h1>
<form id=consumer action="<%=request.getContextPath()%>/student.do">
	ID: <input type="text" name="cid" /><br />
	PASS: <input type="password" name="pass"/><br />
	<input type="hidden" name="action" value="join" />
	<input type="hidden" name="dest" value="login" />
	<input type="submit" id="test" value="전송" > 
	
</form>
<script>
$('#consumer').submit(function(){
	alert('제이쿼리 테스트');
});
</script>
</body>
</html>