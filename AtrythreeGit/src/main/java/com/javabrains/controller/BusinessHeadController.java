package com.javabrains.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BusinessHeadController {


	@RequestMapping("/BusinessHead")
	public String index() {
		return "businessHead/businessHead";
	}


    
    
			@RequestMapping("BusinessHead/AssignTarget")
			public String AssignTarget() {	
				return "businessHead/AssignTarget";
			}



			
			@RequestMapping("BusinessHead/ViewSale")
			public String ViewSales() {	
			return "businessHead/ViewSale";
			}
			
			
			@RequestMapping("BusinessHead/RegionalSale")
			public String RegionalSales() {	
			return "businessHead/RegionalSale";
			}
			
			@RequestMapping("BusinessHead/AreaSale")
			public String AreaSale() {	
			return "businessHead/AreaSale";
			}
			
			
			
			@RequestMapping("BusinessHead/IssueWarning")
			public String IssueWarning() {	
			return "businessHead/IssueWarning";
			}
			
			@RequestMapping("BusinessHead/viewWarning")
			public String viewWarning() {	
			return "businessHead/viewWarning";
			}
			
			
			
			
			
			@RequestMapping("BusinessHead/AddFeedback")
			public String AddFeedback() {	
			return "businessHead/addFeedback";
			}
			
			@RequestMapping("BusinessHead/viewFeedback")
			public String viewFeedback() {	
			return "businessHead/viewFeedback";
			}
			
			
			@RequestMapping("BusinessHead/viewPerformance")
			public String viewPerformance() {	
			return "businessHead/viewPerformance";
			}
			
			
			
			
			@RequestMapping("BusinessHead/AddAchievedTarget")
			public String AddAchievedTarget() {	
			return "businessHead/AddAchievedTarget";
			}
			
			
			
			
			

	
}
