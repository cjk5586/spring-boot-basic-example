package com.sicc.vo;

import org.springframework.stereotype.Component;

/**
 * VO
 * @author Woongs
 */
@Component
public class SiccVO {
	private String sabun;		// 사번
	private String name;		// 이름
	private String division;	// 부서

	// 기본 생성자
	public SiccVO() {
		
	}
	
	// 생성자
	public SiccVO(String sabun, String name, String division) {
		super();
		this.sabun = sabun;
		this.name = name;
		this.division = division;
	}

	// setter and getter
	public String getSabun() {
		return sabun;
	}

	public void setSabun(String sabun) {
		this.sabun = sabun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	// toString()
	@Override
	public String toString() {
		return "SiccVO [sabun=" + sabun + ", name=" + name + ", division=" + division + "]";
	}	
}
