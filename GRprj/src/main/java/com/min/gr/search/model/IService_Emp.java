package com.min.gr.search.model;

import java.util.List;
import java.util.Map;

import com.min.gr.emp.dto.EmpDTO;
import com.min.gr.emp.dto.EmpUserDTO;
import com.min.gr.ws.dto.WorkSpaceDTO;

public interface IService_Emp {

	/**
	 * 사업장 조회
	 * @return WS_NAME, WS_LOC, WS_NUM, WS_CODE
	 */
	public List<WorkSpaceDTO> wsSearch();
	
	/**
	 * 입사신청(입사신청시 EMP_CODE, USER_ID, WS_CODE, EMP_CONFIRM, EMP_RESIGN이 자동으로 입력된다.)
	 * @param dto
	 * @return EMP_CODE, USER_ID, WS_CODE, EMP_CONFIRM, EMP_RESIGN
	 */
	public  boolean empApplyInsert(Map<String, Object> map);
	
	/**
	 * 입사신청한 일반회원 조회
	 * @param ws_code
	 * @return EMP_CODE, USER_ID, WS_CODE, EMP_CONFIRM, USER_TYPE, USER_NAME, 
	 *         USER_ADDRESS, USER_PHONE, USER_BIRTH, USER_GENDER, USER_EMAIL
	 */
	public List<EmpUserDTO> empConfirmSelectD(String ws_code);
	
	/**
	 * 입사승인시  정보 업데이트 후 승인완료(근로계약시작일, 근로계약종료일, 근로시간, 주휴일, 월급, 근로내용, 월급일, 입사승인일, 직급)
	 * @param dto
	 * @return EMP_HIREDATE, EMP_HIREDATE_END, EMP_WORKTIME, EMP_HOLIDAY, EMP_SALARY, EMP_POSITION, EMP_SALATY_DAY, EMP_APPLY, EMP_RANK
	 */
	public boolean empApplyUpdate(EmpDTO dto);
	
	/**
	 * 사업장별 직원조회
	 * @param ws_code
	 * @return EMP_CODE, USER_ID, USER_TYPE, USER_EMAIL, USER_PHONE, USER_NAME,
	 *         USER_ADDRESS, USER_GENDER, USER_BIRTH, EMP_HIREDATE, 
	 *         EMP_SALARY, EMP_SALARY_DAY, EMP_APPLY, EMP_RANK, WS_CODE
	 */
	public List<EmpUserDTO> empAllSelect(String ws_code);
	
	/**
	 * 직원정보 상세보기
	 * @param map(EMP_CODE, WS_CODE)
	 * @return EMP_CODE, USER_ID, WS_CODE, EMP_RANK, EMP_HIREDATE, EMP_HIREDATE_END, EMP_POSITION, EMP_WORKTIME,
	 *         EMP_HOLIDAY, EMP_SALARY, EMP_SALARY_DAY, EMP_CONFIRM, EMP_APPLY, USER_EMAIL, USER_PHONE, USER_NAME,
	 *         USER_ADDRESS, USER_GENDER, USER_BIRTH
	 */
	public EmpUserDTO empDetailSelect(Map<String, Object> map);
	
	/**
	 * 입사거절
	 * @param emp_code
	 * @return EMP_CONFIRM
	 */
	public boolean empApplyReject(String emp_code);
	
	/**
	 * 직원정보 수정(근로계약시작일, 근로계약 종료일, 업무내용, 업무시간, 주휴일, 월급, 직급)
	 * @param dto
	 * @return EMP_HIREDATE, EMP_HIREDATE_END, EMP_POSITION, EMP_WORKTIME,
	 *         EMP_HOLIDAY, EMP_SALARY_DAY, EMP_RANK
	 */
	public boolean empUpdate(EmpDTO dto);
	
	/**
	 *퇴사처리 
	 * @param map(EMP_CODE, WS_CODE)
	 * @return EMP_CONFIRM, EMP_RESIGN
	 */
	public boolean empdelete(Map<String, Object> map);
}
