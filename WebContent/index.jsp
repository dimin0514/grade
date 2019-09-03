<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적관리시스템</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<h2>회원가입</h2>
<form id="grade" action="<%=request.getContextPath()%>/grade.do">

	이름:<input type="text" name="name"/><br/>
	주민번호:<input type="text" name="ssn"/><br/>
	국어점수:<input type="text" name="kor"/><br/>
	영어점수:<input type="text" name="eng"/><br/>
	수학점수:<input type="text" name="math"/><br/>
	사회점수:<input type="text" name="soc" /><br/>
	<input type="submit" value="전송" /><br/>

</form>
<script>
$('#grade').submit(function(){
	alert('테스트 클릭!!');
});
</script>
</body>
</html>