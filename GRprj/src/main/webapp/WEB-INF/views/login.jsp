<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�α���</title>
</head>
<script type="text/javascript">
	function valChk() {
		var user = document.getElementById("user");
		var pw = document.getElementById("pw");
		if (user.value == "") {
			document.getElementById("err").innerHTML = "";
			document.getElementById("msg").innerHTML = "���̵� �Է��� �ּ���.";
			return false;
		} else if (pw.value == "") {
			document.getElementById("err").innerHTML = "";
			document.getElementById("msg").innerHTML = "��й�ȣ�� �Է��� �ּ���.";
			return false;
		}
		return true;
	}
</script>
<body>
	<form data-uc-form action="./result.do" method="POST">
		<input type="text" name="id" placeholder="���̵�"
			style="border-color: #777676;" /> <input type="text" name="password"
			placeholder="��й�ȣ" style="border-color: #777676;" />

		<button type="submit">�α���</button>
	</form>
	<a href="./joinInfoEmployee.do" data-uc-click="modal" > ȸ������</a>

	<a href="" class="is-txt-link">IDã��</a>
	<a href="" class="is-txt-link">��й�ȣ ã��</a>
</body>
</html>