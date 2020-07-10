package com.min.gr.search.model;

import java.util.List;

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
	public  boolean empApplyInsert(EmpDTO dto);
	
	public List<EmpUserDTO> empConfirmSelectD(String ws_code);
}
