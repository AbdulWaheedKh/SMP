package com.javabrains.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.javabrains.model.UserRepository;
import com.javabrains.model.*;

@Controller
//@RequestMapping("/Ceo")
	public class CeoController {

	@Autowired
	UserRepository Repo;
	
			@RequestMapping("/Ceo")
			public String index() {
				return "ceo/ceo";
			}
		

		    @GetMapping("Ceo/AssignTarget")
		    public String greetingForm(Model model) {
		        model.addAttribute("greeting",new ceo());
		/* model.addAttribute(attributeValue) */
		        return "ceo/AssignTarget";
		    }

			 @PostMapping("/greeting-submit")
			   public String greetingSubmit(@ModelAttribute ceo greeting)
			   
			  {
				 Repo.save(greeting); 
				
				 
		/* Repo.findAll(); */
				 return "ceo/ceo";
				 }
			
			
			
	/*
	 * 
	 * @RequestMapping("Ceo/AssignTarget") public String AssignTarget() { return
	 * "ceo/AssignTarget"; }
	 * 
	 * 
	 */
			
			@RequestMapping("Ceo/ViewSale")
			public String ViewSales() {	
				return "ceo/ViewSale";
			}
		
		
			@RequestMapping("Ceo/RegionalSale")
			public String RegionalSales() {	
				return "ceo/RegionalSale";
			}
		
			@RequestMapping("Ceo/AreaSale")
			public String AreaSale() {	
				return "ceo/AreaSale";
			}
		
		    
		    
			@RequestMapping("Ceo/IssueWarning")
			public String IssueWarning() {	
				return "ceo/IssueWarning";
			}
		
			@RequestMapping("Ceo/AddFeedback")
			public String AddFeedback() {	
				return "ceo/addFeedback";
			}

	

}
	
	
	
	
	
