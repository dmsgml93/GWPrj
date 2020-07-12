package com.min.gr.search.model;

import java.util.List;
import java.util.Map;

import com.min.gr.emp.dto.EmpDTO;
import com.min.gr.emp.dto.EmpUserDTO;
import com.min.gr.ws.dto.WorkSpaceDTO;

public interface IService_Emp {

	/**
	 * ����� ��ȸ
	 * @return WS_NAME, WS_LOC, WS_NUM, WS_CODE
	 */
	public List<WorkSpaceDTO> wsSearch();
	
	/**
	 * �Ի��û(�Ի��û�� EMP_CODE, USER_ID, WS_CODE, EMP_CONFIRM, EMP_RESIGN�� �ڵ����� �Էµȴ�.)
	 * @param dto
	 * @return EMP_CODE, USER_ID, WS_CODE, EMP_CONFIRM, EMP_RESIGN
	 */
	public  boolean empApplyInsert(Map<String, Object> map);
	
	/**
	 * �Ի��û�� �Ϲ�ȸ�� ��ȸ
	 * @param ws_code
	 * @return EMP_CODE, USER_ID, WS_CODE, EMP_CONFIRM, USER_TYPE, USER_NAME, 
	 *         USER_ADDRESS, USER_PHONE, USER_BIRTH, USER_GENDER, USER_EMAIL
	 */
	public List<EmpUserDTO> empConfirmSelectD(String ws_code);
	
	/**
	 * �Ի���ν�  ���� ������Ʈ �� ���οϷ�(�ٷΰ�������, �ٷΰ��������, �ٷνð�, ������, ����, �ٷγ���, ������, �Ի������, ����)
	 * @param dto
	 * @return EMP_HIREDATE, EMP_HIREDATE_END, EMP_WORKTIME, EMP_HOLIDAY, EMP_SALARY, EMP_POSITION, EMP_SALATY_DAY, EMP_APPLY, EMP_RANK
	 */
	public boolean empApplyUpdate(EmpDTO dto);
	
	/**
	 * ����庰 ������ȸ
	 * @param ws_code
	 * @return EMP_CODE, USER_ID, USER_TYPE, USER_EMAIL, USER_PHONE, USER_NAME,
	 *         USER_ADDRESS, USER_GENDER, USER_BIRTH, EMP_HIREDATE, 
	 *         EMP_SALARY, EMP_SALARY_DAY, EMP_APPLY, EMP_RANK, WS_CODE
	 */
	public List<EmpUserDTO> empAllSelect(String ws_code);
	
	/**
	 * �������� �󼼺���
	 * @param map(EMP_CODE, WS_CODE)
	 * @return EMP_CODE, USER_ID, WS_CODE, EMP_RANK, EMP_HIREDATE, EMP_HIREDATE_END, EMP_POSITION, EMP_WORKTIME,
	 *         EMP_HOLIDAY, EMP_SALARY, EMP_SALARY_DAY, EMP_CONFIRM, EMP_APPLY, USER_EMAIL, USER_PHONE, USER_NAME,
	 *         USER_ADDRESS, USER_GENDER, USER_BIRTH
	 */
	public EmpUserDTO empDetailSelect(Map<String, Object> map);
	
	/**
	 * �Ի����
	 * @param emp_code
	 * @return EMP_CONFIRM
	 */
	public boolean empApplyReject(String emp_code);
	
	/**
	 * �������� ����(�ٷΰ�������, �ٷΰ�� ������, ��������, �����ð�, ������, ����, ����)
	 * @param dto
	 * @return EMP_HIREDATE, EMP_HIREDATE_END, EMP_POSITION, EMP_WORKTIME,
	 *         EMP_HOLIDAY, EMP_SALARY_DAY, EMP_RANK
	 */
	public boolean empUpdate(EmpDTO dto);
	
	/**
	 *���ó�� 
	 * @param map(EMP_CODE, WS_CODE)
	 * @return EMP_CONFIRM, EMP_RESIGN
	 */
	public boolean empdelete(Map<String, Object> map);
}
