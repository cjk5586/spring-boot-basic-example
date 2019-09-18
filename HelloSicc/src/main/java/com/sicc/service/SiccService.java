package com.sicc.service;

import com.sicc.vo.SiccVO;

/**
 * interface
 * @author Woongs
 */
public interface SiccService {
	// sicc information setting
	public SiccVO setSiccInformation(String sabun, String name, String division);
}