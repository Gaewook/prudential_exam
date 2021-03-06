package examples.springmvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import examples.springmvc.dto.User;
import examples.springmvc.service.UserService;

@Controller
@RequestMapping(path = "/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public String getUsers(Model model) {
		model.addAttribute("list", userService.getUsers());
		return "users/list";
	}
	
	@GetMapping(value="/joinForm")
	public String joinForm(Model model) {
//		model.addAttribute("user", userService.addUser(User usr));
		return "users/joinForm";
	}
	
	@PostMapping(value="/actionJoin")
	public String actionJoin(User user) {
		userService.addUser(user);
		return loginForm();
	}		
	
	@GetMapping(value="/loginform")
	public String loginForm() {
		return "users/loginform";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute User user, HttpSession session) {
		User dbUser = userService.getUser(user.getUserId());
		
//		System.out.println(user);
		
		if (dbUser != null && dbUser.getPassword().equals(user.getPassword())) {
			session.setAttribute("login",  user);
//			System.out.println("#####" + session.getAttribute("login").toString());
			return "redirect:/boards";
		} else {
			// 로그인 실패
			return "redirect:/users/loginform";
		}
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("login");
//		return loginForm();
		return "redirect:/boards"; 
		}
}
