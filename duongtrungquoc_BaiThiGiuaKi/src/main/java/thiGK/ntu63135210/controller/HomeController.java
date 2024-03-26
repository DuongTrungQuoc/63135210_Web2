package thiGK.ntu63135210.controller;

import java.util.ArrayList;
import java.util.List;

import thiGK.ntu63135210.service.StudentService;
import thiGK.ntu63135210.models.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	private static List<Student> students = new ArrayList<Student>();

	static {
		students.add(new Student(1, "Nguyen Van A", "K61A", "CNTT", "NTU"));
        students.add(new Student(2, "Tran Thi B", "K62B", "Kinh Te", "NTU"));
        students.add(new Student(3, "Le Van C", "K63C", "Ngoai Thuong", "NTU"));
	}

	// Inject via application.properties
	@Value("${welcome.message}")
	private String message;

	@Value("${error.message}")
	private String errorMessage;

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {

		model.addAttribute("message", message);

		return "index";
	}

	@RequestMapping(value = { "/listStudent" }, method = RequestMethod.GET)
	public String personList(Model model) {

		model.addAttribute("students", students);

		return "listStudent";
	}

	@RequestMapping(value = { "/add" }, method = RequestMethod.GET)
	public String showAddPersonPage(Model model) {

		Student Form = new Student();
		model.addAttribute("Student", Form);

		return "add";
	}

	@RequestMapping(value = { "/add" }, method = RequestMethod.POST)
	public String savePerson(Model model, //
			@ModelAttribute("Form") Student Form) {

		
		return "add";
	}

}