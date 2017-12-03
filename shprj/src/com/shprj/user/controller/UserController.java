package com.shprj.user.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shprj.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/regist", method=RequestMethod.GET)
	public String toRegist(Model model){
		model.addAttribute("user", new User());
		return "user";
	}
	
	@RequestMapping(value="/regist", method=RequestMethod.POST)
	public String regist(@Valid User user, BindingResult bindingResult,
			HttpSession session, Model model){
		if(bindingResult.hasErrors()){
			model.addAttribute("user", user);
			return "user";
		}else{
			session.setAttribute("user", user);
			return "center";
		}
	}

}
