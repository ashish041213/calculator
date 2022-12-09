package com.nagarro.dummy.apDummyApp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.dummy.apDummyApp.service.AdditionService;

@Controller
public class AdditionController {
	
	@Autowired
	AdditionService service;
	
	@RequestMapping(value = "/add")
	public ModelAndView addition(HttpServletRequest request, HttpServletResponse response) {
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		
		int c = service.getAdditionResult(a, b);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result",c);
		mv.setViewName("resultPage");
		return mv;
	}
	
	@RequestMapping(value = "/sub")
	public ModelAndView subtract(HttpServletRequest request, HttpServletResponse response) {
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		
		int c = service.getSubtractionResult(a, b);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result",c);
		mv.setViewName("resultPage");
		return mv;
	}
	
	@RequestMapping(value = "/mul")
	public ModelAndView multiply(HttpServletRequest request, HttpServletResponse response) {
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		
		int c = service.getMultiplyResult(a, b);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result",c);
		mv.setViewName("resultPage");
		return mv;
	}
	
	@RequestMapping(value = "/div")
	public ModelAndView division(HttpServletRequest request, HttpServletResponse response) {
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		
		int c = service.getDivitionResult(a, b);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result",c);
		mv.setViewName("resultPage");
		return mv;
	}
}
