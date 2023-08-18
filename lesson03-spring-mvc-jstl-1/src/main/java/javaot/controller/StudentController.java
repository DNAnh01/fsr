package javaot.controller;

import static javaot.common.Application.*;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
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
	
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	private List<Student> students;

	
	/*	@PostConstruct
	 *	 được sử dụng để đánh dấu một phương thức trong một class, 
	 *	 và phương thức này sẽ được thực thi ngay sau khi việc khởi tạo bean (đối tượng) 
	 *	 đã hoàn thành và trước khi bean bắt đầu được sử dụng.
	 */
	@PostConstruct
	public void init() {
		System.out.println("-----> @PostConstruct --------------");
		students = MockData.getStudents();
	}

	@GetMapping
	public String showIndexPage(Model model) {
		model.addAttribute("students", students);
		return STUDENT_INDEX_PAGE;
	}

	@GetMapping("/add")
	public String showAddPage(Model model) {
		addStudentAttributes(model, new Student(), STUDENT_ADD_TITLE);
		return STUDENT_ADD_EDIT_FORM_PAGE;
	}

	@GetMapping("/edit")
	public String showEditPage(Model model, @RequestParam("id") String studentId) {
		Student foundStudent = students.stream().
										filter(st -> st.getId().equals(studentId)).
										findFirst().
										get();
		addStudentAttributes(model, foundStudent, STUDENT_EDIT_TITLE);
		return STUDENT_ADD_EDIT_FORM_PAGE;
	}

	@PostMapping("/save")
	public String saveOrUpdate(
			Model model, 
			@Valid @ModelAttribute("student") Student student,
			BindingResult bindingResult) {
		System.out.println("=======> student: " + student);
		System.out.println("=======> binding results: " + bindingResult);
		boolean hasErrors = bindingResult.hasErrors();
		String formStudentId = student.getId();
		
		List<String> studentIds = students.stream()
										.map(Student::getId)
										.collect(Collectors.toList());
		if(studentIds.contains(formStudentId)) {
			// update if student exists
			if (hasErrors) {
				addStudentAttributes(model, student, STUDENT_EDIT_TITLE);
				return STUDENT_FORM_PAGE;
			}
			System.out.println("form update");
			Student foundStudent = students.stream().
					filter(st -> st.getId().equals(formStudentId)).
					findFirst().
					get();
			foundStudent.transfer(student);
		} else {
			// add
			if (hasErrors) {
				addStudentAttributes(model, student, STUDENT_ADD_TITLE);
				return STUDENT_ADD_EDIT_FORM_PAGE;
			}
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
