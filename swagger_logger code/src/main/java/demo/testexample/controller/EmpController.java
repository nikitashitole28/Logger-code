package demo.testexample.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.testexample.model.EmpModel;
import demo.testexample.service.EmpService;

@RestController
@RequestMapping("emp")
public class EmpController {
	
	 private static final Logger LOGGER = LogManager.getLogger(EmpController.class);

	@Autowired
	EmpService empService;
	
	@GetMapping("/getall")
	public List<EmpModel> getAllEmployee1() {
	 List<EmpModel> lst= empService.getAllEmployee();
	 LOGGER.info("getting all employees");
	 return lst;
	}
	
	@GetMapping("/getll")
	public List<EmpModel> getAlmployee1() {
	 List<EmpModel> lst= empService.getAllEmployee();
	 LOGGER.info("getting all employees");
	 return lst;
	}
	
	@PostMapping("/post")
	public String postEmp(@RequestBody EmpModel e) {
		empService.postEmp(e);
		return "employee saved successfully";
		}
	
    @DeleteMapping("/delete/{id}")
    public String deleteemp(@PathVariable Integer id) {
    	empService.deleteemp(id);
    	return " employee deleted successfully";
    }

	@PutMapping("/put/{id}")
	public String updateemp(@PathVariable Integer id,@RequestBody EmpModel e) {
		empService.updateemp(id,e);
    	return " employee updated successfully";

		
	}

}
