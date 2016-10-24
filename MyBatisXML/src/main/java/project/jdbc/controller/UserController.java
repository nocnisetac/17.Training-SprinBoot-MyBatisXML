package project.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import project.jdbc.service.AccountService;
import project.jdbc.service.UserService;

@Controller
@RequestMapping("batxml")
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("users", userService.findAll());
		return "batxml/index";
	}
	@RequestMapping(value = "detail/{id}", method=RequestMethod.GET)
	public String detail(@PathVariable("id") Long id, ModelMap modelMap) {
		modelMap.put("accounts", accountService.findAccountsByUserId(id));
		return "batxml/detail";
	}
	@RequestMapping(value = "all", method=RequestMethod.GET)
	public String all(ModelMap modelMap) {
		modelMap.put("users", userService.findUsersWithAccounts());
		return "batxml/all";
	}
}
