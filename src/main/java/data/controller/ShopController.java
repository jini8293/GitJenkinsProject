package data.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class ShopController {
	
	@GetMapping("/")
	public String start() {
		return "redirect:shop/list";
	}
	
	@GetMapping("/shop/list")
	public String start(Model model) {
		return "gitshop/shoplist";
	}

}
