<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�α���</title>
</head>
<script type="text/javascript">
function valChk(){
	var user = document.getElementById("user");
	var pw = document.getElementById("pw");
	if(user.value == ""){
		document.getElementById("err").innerHTML = "";
		document.getElementById("msg").innerHTML = "���̵� �Է��� �ּ���.";
		return false;
	}else if(pw.value == ""){
		document.getElementById("err").innerHTML = "";
		document.getElementById("msg").innerHTML = "��й�ȣ�� �Է��� �ּ���.";
		return false;
	}
	return true;
}
</script>
<body>



</body>
</html>