<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>joinInfoEmployee</title>
</head>
<body>
	
	<div class="row-fluid">
	<div id="head">
		<h1>ȸ������</h1>
	</div>
	<div class="login-box" style="width:600px;">
		<form class="form-horizontal" method="post" id="form" name="form" action="./Employee.do">
			<input type="hidden" id="confmKey" name="confmKey" value="">
 			<div class="input-prepend">
			<br>
			<br>
    			<label>���̵�&nbsp;&nbsp;&nbsp;
				<input class="input-large" type="text" name="user_id" id="user_id" readonly="readonly" placeholder="���̵� �Է�">
    			<input class="btn btn-basic" type="button" value="�ߺ� Ȯ��" onclick="idChk();" style="margin-bottom : 5px;">
				</label>
 			</div>
 			<div class="input-prepend">
 			<br>
    			<label>��й�ȣ&nbsp;&nbsp;&nbsp;
				<input class="input-large" type="password" id="user_password" name="user_password" placeholder="��й�ȣ">
				</label>
				<div  style="height: 15px;">
				<label id="msg1"> </label>
				</div>
 			</div>
			<div class="input-prepend">
     			<label>��й�ȣ Ȯ��&nbsp;&nbsp;	
				<input class="input-large"  type="password" id="passOk" placeholder="��й�ȣ Ȯ��">
				</label>
				<div  style="height: 15px;">
				<label id="msg2"> </label>
				</div>
  			</div>	
  			<div class="input-prepend">
  			<br>
     			<label>����&nbsp;&nbsp;&nbsp;&nbsp;
     			<input type="text" class="input-large" id="user_name" name="user_name" placeholder="����">
  				</label>
  			</div>
			<div class="input-prepend" style="display: none;">
     			<label>Ÿ��</label>	
				<input class="form-control" type="text" id="user_type" name="user_type" value=${user_type}>
			</div>
			<div class="input-prepend">
			<br>
     			<label>�̸���&nbsp;&nbsp;&nbsp;&nbsp;	
   				<input type="text" class="input-large" id="user_email" name="user_email" placeholder="�̸��� �Է�" readonly="readonly">
   				<input class="btn btn-basic" type="button" value="�����ϱ�" onclick="emailChk();" style="margin-bottom : 5px;">
				</label> 
			</div>  
			<div class="input-prepend">
			<br>
     			<label>�޴���ȭ&nbsp;&nbsp;&nbsp;
     			<input type="text" class="input-large" id="user_phone" name="user_phone" placeholder="�޴���ȭ �Է�(-����)" readonly="readonly"> 
     			<input class="btn btn-basic" type="button" value="�����ϱ�" onclick="phoneChk();" style="margin-bottom : 5px;">
				</label> 	
			</div>
			<div class="input-prepend">
			<br>
     			<label>�ּ�&nbsp;&nbsp;&nbsp;&nbsp;
				<input class="input-large span8" type="text" id="user_address" name="user_address" readonly="readonly" placeholder="�ּ� �Է�"/> 
				<input class="btn btn-basic" type="button" value="�ּ� �˻�" onclick="goPopup();" style="margin-bottom : 5px;">
				</label>	
			</div>
			<div class="input-prepend">	
			<br>
				<label> �������&nbsp;&nbsp;&nbsp;&nbsp;
					<input class="input-large" type="date" id="user_birth" name="user_birth" style="margin-top: 5px;">
				</label>
			</div>
			<div class="input-prepend">
			<br>
				<label>���� ����&nbsp;&nbsp;&nbsp;&nbsp; 
					<input type="radio" name="user_gender" value="F" checked="checked" style="margin-top: -3px;"> ��
					<input type="radio" name="user_gender" value="M" style="margin-top: -3px;"> ��
				</label>
			</div>
			<div class="input-prepend"> 
			<br>
				<label>�̸��� ���ŵ��� ����&nbsp;&nbsp;&nbsp;&nbsp; 
					<input type="radio" name="user_eagree" value="Y" checked="checked" style="margin-top: -3px;"> ��
					<input type="radio" name="user_eagree" value="N" style="margin-top: -3px;"> �ƴϿ�
				</label>
			</div>	
			<div class="input-prepend">		
			<br>
				<label>SMS ���ŵ��� ����&nbsp;&nbsp;&nbsp;&nbsp; 
					<input type="radio" name="user_sagree" value="Y" checked="checked" style="margin-top: -3px;"> ��
					<input type="radio" name="user_sagree" value="N" style="margin-top: -3px;"> �ƴϿ�
				</label>
			<br>	
			</div>	
			<div class="input-prepend" id="botton" style="text-align: center">
			<br>
			<label>
				<input id="signUp" type="button" class="btn btn-primary" value="ȸ������">&nbsp;&nbsp;
				<input type="button" class="btn btn-basic" value="���ư���" onclick="javascript:history.back(-1)">
			</label>
			</div>
			<br>
		</form>
		</div>
	</div>
</body>
</html>