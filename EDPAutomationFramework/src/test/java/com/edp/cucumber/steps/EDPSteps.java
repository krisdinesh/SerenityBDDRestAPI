package com.edp.cucumber.steps;

import java.util.List;
import java.util.Map;
import com.edp.cucumber.serenity.EDPSerenitySteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EDPSteps {

	String firstName;
	String lastName;
	String programme;
	String email; 
	String courses;

	@Steps
	EDPSerenitySteps steps;
	
	@When("^Create Student using Rest API should get the response 201$")
	public void create_Student(DataTable arg1) {
		
		List<Map<String, String>> list = arg1.asMaps(String.class, String.class);
		for(int i=0; i<list.size(); i++) {
			firstName = list.get(i).get("firstName");
			lastName = list.get(i).get("lastName");
			email = list.get(i).get("email");
			programme = list.get(i).get("programme");
			steps.createStudent(firstName, lastName, email, programme).statusCode(201).log().all();
		}
	}
	
	@When("^Update Student using Rest API should get the response 200$")
	public void update_Student() {
		
		int studentId = 101;
		String fN = "update";
		String lN = "Update";
		String eM = "update@update.com";
		String pR = "UPDATE";
		steps.updateStudent(studentId, fN, lN, eM, pR).log().all();
		
		//HashMap<String,Object> value = steps.getStudentInfoByFirstName(firstName);
		}
	
	@When("^Delete Student and search the same Student using Rest API should get the response 404$")
	public void delete_Student() {
		
		int studentId = 101;
		steps.deleteStudent(studentId);
		steps.getStudentById(studentId).statusCode(404);
		
		//HashMap<String,Object> value = steps.getStudentInfoByFirstName(firstName);
		}
	
	}
