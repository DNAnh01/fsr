package javaot.controller;

import static javaot.common.Application.*;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javaot.bean.Student;
import javaot.common.MockData;

/**
 * student -> index page student/id -> get page student/add -> add page
 * student/save -> save/update page student/delete -> delete page
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
		model.addAttribute("student", student);
		return STUDENT_FORM_PAGE;
	}

	@PostMapping("processForm")
	public String processStudentForm(Model model, @ModelAttribute("student") Student student) {
		model.addAttribute("studentInfo", student);
		return STUDENT_INFO_PAGE;
	}

	// class jv11

	private List<Student> students;

	@PostConstruct
	public void init() {
		System.out.println("-----> @PostConstruct");
		students = MockData.getStudents();
	}

	@GetMapping
	public String showIndexPage(Model model) {
		model.addAttribute("students", students);
		return STUDENT_INDEX_PAGE;
	}

	@GetMapping("/add")
	public String showAddPage(Model model) {
		addStudentAttributes(model, new Student(), "ADD");
		return STUDENT_ADD_EDIT_FORM_PAGE;
	}

	@GetMapping("/edit")
	public String showEditPage(Model model, @RequestParam("id") String studentId) {
		Student foundStudent = students.stream().
										filter(st -> st.getId().equals(studentId)).
										findFirst().
										get();

		addStudentAttributes(model, foundStudent, "EDIT");
		return STUDENT_ADD_EDIT_FORM_PAGE;
	}

	@PostMapping("/save")
	public String saveOrUpdate(@ModelAttribute("student") Student student, Model model) {
		String formStudentId = student.getId();
		List<String> studentIds = students.stream()
										.map(Student::getId)
										.collect(Collectors.toList());
		if(studentIds.contains(formStudentId)) {
			// update 
			System.out.println("form update");
			Student foundStudent = students.stream().
					filter(st -> st.getId().equals(formStudentId)).
					findFirst().
					get();
			
			foundStudent.transfer(student);
		} else {
			// add
			System.out.println("form add");
			students.add(student);
		}
		return "redirect:/student";
	}

	private static void addStudentAttributes(Model model, Student student, String title) {
		model.addAttribute("title", title);
		
		// data-binding
		model.addAttribute("student", student);

		// select option
		model.addAttribute("countries", MockData.getCountries());

		// check-box
		model.addAttribute("operatingSystems", MockData.getOses());
	}
}
