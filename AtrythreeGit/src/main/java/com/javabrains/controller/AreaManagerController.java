package com.javabrains.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AreaManagerController {

	
	@RequestMapping("/AreaManager")
	public String index() {
		return "areaManager/areaManager";
	}




	@RequestMapping("AreaManager/AssignTarget")
	public String AssignTarget() {	
		return "areaManager/AssignTarget";
	}



	
	@RequestMapping("AreaManager/ViewSale")
	public String ViewSales() {	
	return "areaManager/ViewSale";
	}
	
	
	@RequestMapping("AreaManager/RegionalSale")
	public String RegionalSales() {	
	return "areaManager/RegionalSale";
	}
	
	@RequestMapping("AreaManager/AreaSale")
	public String AreaSale() {	
	return "areaManager/AreaSale";
	}
	
	
	
	@RequestMapping("AreaManager/IssueWarning")
	public String IssueWarning() {	
	return "areaManager/IssueWarning";
	}
	
	@RequestMapping("AreaManager/viewWarning")
	public String viewWarning() {	
	return "areaManager/viewWarning";
	}
	
	
	
	
	
	@RequestMapping("AreaManager/AddFeedback")
	public String AddFeedback() {	
	return "areaManager/addFeedback";
	}
	
	@RequestMapping("AreaManager/viewFeedback")
	public String viewFeedback() {	
	return "areaManager/viewFeedback";
	}
	
	
	@RequestMapping("AreaManager/viewPerformance")
	public String viewPerformance() {	
	return "areaManager/viewPerformance";
	}
	
	
	
	
	@RequestMapping("AreaManager/AddAchievedTarget")
	public String AddAchievedTarget() {	
	return "areaManager/AddAchievedTarget";
	}
	
	
}
