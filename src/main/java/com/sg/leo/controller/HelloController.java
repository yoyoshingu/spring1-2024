package com.sg.leo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/img")
	public String img() {
		System.out.println("이미지파일이 요청됨");
		return "redirect:image/people.jpg";
	}
	
	@GetMapping("/jsp")
	public String jsp(Model model) {
		System.out.println("jsp파일 요청됨");
		model.addAttribute("username", "흐흠 이콘텐츠주인 이용희");
		return "hellojsp2";
	}

}
