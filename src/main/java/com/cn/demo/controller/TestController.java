package com.cn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		
		String str = "Hello this is a demo with codegen";
		
		System.out.println(str);
		
		return str;
	}
}
