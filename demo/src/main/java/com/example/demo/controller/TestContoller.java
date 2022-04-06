package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.TestData;
import com.example.demo.service.TestService;

@Controller
public class TestContoller {

	@Autowired
	private TestService testService;
	
//	@RequestMapping("/test/inputData.do")
//	public ModelAndView inputData() throws Exception {
//		ModelAndView mv = new ModelAndView("/test");
//		
//		List<TestData> list = testService.selectTestList();
//		mv.addObject("list", list);
//		
//		return mv;
//	}
	

	@RequestMapping(value = "/", method= {RequestMethod.GET})
	public String index(Model model) {
		model.addAttribute("title", "주소록");
		
		return "/";
	}
	
	@GetMapping("/insertData")
	public String insertData(Model model) {
		model.addAttribute("title", "주소록");
		
		return "insertData";
	}
	
	@PostMapping("/insertData")
	public String insertData(TestData testdata) throws Exception {
		testService.insertData(testdata);
		System.out.println("DDDDD");
		return "redirect:/insertData";
	}
}
