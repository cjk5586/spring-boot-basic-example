package com.sicc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sicc.vo.SiccVO;

/**
 * SiccServiceImpl
 * @author Woongs
 */
@Service
public class SiccServiceImpl implements SiccService {
	@Autowired
	SiccVO siccVO;
	
	// sicc information setting impl
	@Override
	public SiccVO setSiccInformation(String sabun, String name, String division) {
		siccVO.setSabun(sabun);			// 사번 setting
		siccVO.setName(name);			// 이름 setting
		siccVO.setDivision(division);	// 부서 setting

		return siccVO;
	}
}
