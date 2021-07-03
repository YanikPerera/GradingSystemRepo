package com.example.GradingSystem.Students.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.GradingSystem.Students.domian.StudentAnswerDomian;
import com.example.GradingSystem.Students.repository.StudentServiceRepo;
import com.example.GradingSystem.Teachers.domain.QuestionDomain;


@RestController
@RequestMapping("/student")
@ControllerAdvice	
public class StudentController {
	
	@Autowired
	private StudentServiceRepo studentservicerepo;
	
@GetMapping("/result")
public List<StudentAnswerDomian> StudentResultChecker() {
		
		//once we auto-wired we can use this injection to add interface functions 
			return studentservicerepo.StudentResult();
		// here also we can add data base code to the get all users data
//				return "All users";
				
			}
@GetMapping("/reviewanswer/{id}")
public Optional<StudentAnswerDomian> ReviewAnswer(@PathVariable Integer id) {
		//StudentAnswerDomian studentanswer ;
		
		//once we auto-wired we can use this injection to add interface functions 
			return studentservicerepo.ReviewAnswer(id);
		// here also we can add data base code to the get all users data
//				return "All users";
				
			}

/*@RequestMapping(path = "/reviewanswers/{studentid}/{assignmentid}/{questionid}", method = RequestMethod.GET)
public List<StudentAnswerDomian> getAnswer(@PathVariable Integer studentid, @PathVariable  Integer assignmentid, @PathVariable  Integer questionid) {

	System.out.println(studentid+assignmentid+questionid);
return studentservicerepo.Getanswers(studentid,assignmentid,questionid);

	
}*/

@RequestMapping(path = "/reviewsubmitedans/{studentid}/{assignmentid}/{questionid}", method = RequestMethod.GET)
public List<StudentAnswerDomian> getBook(@PathVariable Integer studentid, @PathVariable  Integer assignmentid, @PathVariable  Integer questionid) {
	
	return studentservicerepo.Getanswers(studentid,assignmentid,questionid);
    // code here
}
@RequestMapping(path = "/reviewquecstions/{assignmentid}/{questionno}", method = RequestMethod.GET)
public List<QuestionDomain> getQuestions( @PathVariable  Integer assignmentid, @PathVariable  Integer questionno) {
	
	return studentservicerepo.GetQuecstionAns(assignmentid,questionno);

	// code here
}

/*@RequestMapping(path = "/reviewanswers/{studentid}/{assignmentid}/{questionid}", method = RequestMethod.GET)
public List<StudentAnswerDomian> getAnswer(@PathVariable Integer studentid, @PathVariable  Integer assignmentid, @PathVariable  Integer questionid) {


return studentservicerepo.Getanswers(studentid,assignmentid,questionid);

	
}*/


	
//this is update quarry
//@GetMapping("/find/{id}") this @getMapping we can identify the end of the URL should 
//be find and here can be able pass id though the link
//@PathVariable Integer id can be identify the variable data which is pass from the id

/*@GetMapping("/find/{id}")
public UserDTO getUserById(@PathVariable (value ="id")long id) {
	
	return serviceuser.findById(id);
	
}
*/
}
