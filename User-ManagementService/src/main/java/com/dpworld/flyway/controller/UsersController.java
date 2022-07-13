package com.dpworld.flyway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dpworld.flyway.model.Users;
import com.dpworld.flyway.service.UsersService;



@RefreshScope
@Controller
public class UsersController {

	@Autowired
    private UsersService service ;

	@Value("${welcome.message}")
	private String envName;
	

	@GetMapping("/")
	public ModelAndView viewHomePage(Model model) {
		System.out.println("Calling Home Page....");
		ModelAndView view = new ModelAndView();
		view.setViewName("index");
		view.addObject("envName", envName);
		return view; 
	}
	
	

	

	// display list of users
	@GetMapping("/all")
	public String listUserss(Model model) {
		System.out.println(" ===> listUserss");
		
		model.addAttribute("listUsers", service.getAllUserss());
		model.addAttribute("envName", envName);
		System.out.println(service.getAllUserss());
		return "listUsers";
	}

	// display list of users
	@GetMapping("/addUser")
	public String addUsers(Model model) {
		// create model attribute to bind form data
		Users user = new Users();
		model.addAttribute("user", user);
		return "addUserForm";
	}

	@PostMapping("/saveUser")
	public String saveUsers(@ModelAttribute("user") Users user) {
		// save user to database
		System.out.println(" ===================== ");
		System.out.println("saveUsers : "+user);
		System.out.println(" ===================== ");
		
		
		service.saveUser(user);
		return "redirect:/all";
	}

	@GetMapping("/editUserForm/{id}")
	public String showEditForm(@PathVariable(value = "id") long id, Model model) {

		// get user from the service
		Users user = service.getUsersById(id); 
		 
		// set user as a model attribute to pre-populate the form
		model.addAttribute("user", user);
		return "editUserForm";
	}

	@GetMapping("/viewUser/{id}")
	public String viewUsers(@PathVariable(value = "id") long id, Model model) {

		// get user from the service
		Users user = service.getUsersById(id);

		// set user as a model attribute to pre-populate the form
		model.addAttribute("user", user);
		System.out.println("viewUsers : " + user);
		return "viewUser";
	}

	@GetMapping("/deleteUser/{id}")
	public String deleteUsers(@PathVariable(value = "id") long id) {

		// call delete user method
		this.service.deleteUsersById(id);
		return "redirect:/all";
	}

}
