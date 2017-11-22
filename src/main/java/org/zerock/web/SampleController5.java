package org.zerock.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.ProductVO;

@Controller
public class SampleController5 {
	
	@RequestMapping("/dojson")
	// @ResponseBody�� ����ؼ� JSON �������� ������ ����
	public @ResponseBody ProductVO dojson() {
		
		// ������ ��ü ����
		ProductVO vo = new ProductVO("sample",30000);
		
		// ������ ��ü ����
		return vo;
	}

}
