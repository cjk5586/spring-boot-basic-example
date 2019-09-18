package com.sicc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sicc.config.SiccConfig;
import com.sicc.service.SiccServiceImpl;
import com.sicc.vo.SiccVO;

/**
 * RestController = "@Controller" + "@ResponseBody"
 * @author Woongs
 */
@RestController
@RequestMapping("/rest")
public class SiccRestController {
	@Autowired
	SiccServiceImpl siccServiceImpl;
	
	@Autowired
	SiccConfig siccConfig;
	
	// rest api 강제 셋팅
	@RequestMapping("")
	public SiccVO sicc() {
		return siccServiceImpl.setSiccInformation("77777", "MSA GROUP", "SD TEAM"); // 사번, 이름, 팀
	}
	
	// rest api pathvariable 적용
	@RequestMapping("/{sabun}/{name}/{division}")
	public SiccVO siccPathVariable(@PathVariable String sabun, @PathVariable String name, @PathVariable String division) {
		return siccServiceImpl.setSiccInformation(sabun, name, division); // 사번, 이름, 팀
	}
	
	// 사용자 정의 config
	@RequestMapping("/config")
	public String config() {
		return siccConfig.getMessage();
	}
}
