package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.ProductVO;

@Controller
public class SampleController3 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	// doD 경로로 맵핑
	@RequestMapping("/doD")
	public String doD(Model model) {
		
		// product 객체 생성
		ProductVO product = new ProductVO("Sample Product",10000);
		
		logger.info("doD");
		
		// model 객체에 product 객체 저장
		model.addAttribute(product);
		
		// product.jsp 경로 이동
		return "product";
	}
	
}
