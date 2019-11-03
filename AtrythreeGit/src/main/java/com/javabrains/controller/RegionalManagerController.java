package com.javabrains.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegionalManagerController {

			@RequestMapping("/RegionalManager")
			public String index() {
				return "regionalManager/regionalManager";
			}


    
    
			@RequestMapping("RegionalManager/AssignTarget")
			public String AssignTarget() {	
				return "regionalManager/AssignTarget";
			}



			
			@RequestMapping("RegionalManager/ViewSale")
			public String ViewSales() {	
			return "regionalManager/ViewSale";
			}
			
			
			@RequestMapping("RegionalManager/RegionalSale")
			public String RegionalSales() {	
			return "regionalManager/RegionalSale";
			}
			
			@RequestMapping("RegionalManager/AreaSale")
			public String AreaSale() {	
			return "regionalManager/AreaSale";
			}
			
			
			
			@RequestMapping("RegionalManager/IssueWarning")
			public String IssueWarning() {	
			return "regionalManager/IssueWarning";
			}
			
			@RequestMapping("RegionalManager/viewWarning")
			public String viewWarning() {	
			return "regionalManager/viewWarning";
			}
			
			
			
			
			
			@RequestMapping("RegionalManager/AddFeedback")
			public String AddFeedback() {	
			return "regionalManager/addFeedback";
			}
			
			@RequestMapping("RegionalManager/viewFeedback")
			public String viewFeedback() {	
			return "regionalManager/viewFeedback";
			}
			
			
			@RequestMapping("RegionalManager/viewPerformance")
			public String viewPerformance() {	
			return "regionalManager/viewPerformance";
			}
			
			
			
			
			@RequestMapping("RegionalManager/AddAchievedTarget")
			public String AddAchievedTarget() {	
			return "regionalManager/AddAchievedTarget";
			}
			
			
			
	
}
