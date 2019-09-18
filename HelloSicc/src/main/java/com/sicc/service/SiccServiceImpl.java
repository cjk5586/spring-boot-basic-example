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
		siccVO.setSabun(sabun);			// ��� setting
		siccVO.setName(name);			// �̸� setting
		siccVO.setDivision(division);	// �μ� setting

		return siccVO;
	}
}
