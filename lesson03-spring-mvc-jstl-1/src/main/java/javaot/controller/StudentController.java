package javaot.controller;

import static javaot.common.Application.*;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javaot.bean.Student;
import javaot.common.MockUpData;

/**
 * student -> index page
 * student/id -> get page
 * student/add -> add page
 * student/save -> save/update page
 * student/delete -> delete page
 * 
 */


@Controller
@RequestMapping("student")
public class StudentController {
	@GetMapping("showForm")
	public String showStudentForm(Model model) {
		// data-binding
		// binding object from controller with form 
		Student student = new Student();
//		student.setId("124455");
//		student.setFullName("jfhakfdfasdfa");
		model.addAttribute("student", student);
		// gui doi tuong student nay qua ben student-form
		return STUDENT_FORM_PAGE; 
	}
	
	@PostMapping("processForm")
	public String processStudentForm(
			Model model,
			@ModelAttribute("student") Student student) {
		model.addAttribute("studentInfo", student);
		return STUDENT_INFO_PAGE; 
	}
	
	// class jv11
	
	private List<Student> students;
	

	
//	@RequestMapping("student-index")
	@GetMapping
	public String showIndexPage(Model model) {
		// TODO: PreConstruct later
		students = MockUpData.getStudents();
		model.addAttribute("students", students);
		return STUDENT_INDEX_PAGE;
	}
	
	@GetMapping("/add")
	public String showAddPage(Model model) {
		// data-binding
		model.addAttribute("student", new Student());
		return STUDENT_ADD_PAGE;
	}
	
	@PostMapping("/save")
	public String saveNewStudent(@ModelAttribute("student") Student student, Model model) {	
		System.out.println(student);
//		students.add(student);
//		model.addAttribute("students", students);
		return STUDENT_INDEX_PAGE;
	}
}
