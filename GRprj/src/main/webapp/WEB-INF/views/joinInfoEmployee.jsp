<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>joinInfoEmployee</title>
</head>
<body>
	<form action="./Employee.do" method="post">

		<input type="text" name="selpick" placeholder="* ����ڵ�����̹���" id="selpick" /> 
		
		<input class="form-control" type="text" name="id"	id="id" placeholder="* ���̵�" maxlength="20">
		<br> <span id="result"></span> 
		
		<input type="text" name="pw" placeholder="* ��й�ȣ" id="pw">
		
		<input class="form-control" type="password"	id="passOk" placeholder="* ��й�ȣ Ȯ��">
		<br> <span	id="result_pw"></span> 
		<input type="text" name="name"	placeholder="* �̸�" id="name"> 
		
		<input type="text"	name="address" placeholder="* �ּ�"> 
		
		<input type="text"	name="nicname" placeholder="* ����"> 
		
		<input type="text" id="sellernum" name="sellernum" placeholder="* ����ڹ�ȣ" maxlength="20">
		<span id="result"></span> 
		
		<input type="text" name="email" id="email"	placeholder="* �̸���">
		
		<button type="submit" class="is-btn-yg1 is-mg-b_15" onclick="check()">ȸ������</button>

	</form>
</body>
</html>