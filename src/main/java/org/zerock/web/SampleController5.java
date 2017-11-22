package org.zerock.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.ProductVO;

@Controller
public class SampleController5 {
	
	@RequestMapping("/dojson")
	// @ResponseBody를 사용해서 JSON 형식으로 데이터 전달
	public @ResponseBody ProductVO dojson() {
		
		// 전달할 객체 생성
		ProductVO vo = new ProductVO("sample",30000);
		
		// 전달할 객체 리턴
		return vo;
	}

}
