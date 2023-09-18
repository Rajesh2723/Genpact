package genpact.mvc.jdbc;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import genpact.mvc.jdbc.entities.User;

@Controller
public class HomeController {

	@GetMapping(value = "/")
	public String home() {
		System.out.println("Hello World");
		return "index";
	}

	@GetMapping("/base")
	public String openBasePage() {
		return "base";
	}

	@GetMapping(value = "/openForm")
	public String openFormMethod() {
		System.out.println("Returning form page name");
		return "form";
	}

	// Demo1 : Receive data with @RequestParam
	// fullName, password, mobileNo, emailId, gender, hobbies, skills

	// Demo4: Using Model interface to send data to "welcome.jsp"

//	@GetMapping(value = "/register")
//	public String registration(
//			@RequestParam("fullName") String fullName,
//			@RequestParam("password") String password,
//			@RequestParam("mobileNo") String mobileNo,
//			@RequestParam("emailId") String emailId,
//			@RequestParam("gender") String gender,
//			@RequestParam("hobbies") String[] hobbies,
//			@RequestParam("skills") String[] skills,
//			Model model
//			) {
//		//import org.springframework.ui.Model;
//		System.out.println("Inside registration method");
//		
//		System.out.println("\n " + fullName + ", " + password);
//		System.out.println("\n " + mobileNo + ", " + emailId);
//		System.out.println("\n " + gender) ;
//		System.out.println("\n " + Arrays.toString(hobbies)) ;
//		System.out.println("\n " + Arrays.toString(skills)) ;
//		
//		model.addAttribute("fullName", fullName);
//		model.addAttribute("password", password);
//		model.addAttribute("mobileNo", mobileNo);
//		model.addAttribute("emailId", emailId);
//		model.addAttribute("gender", gender);
//		model.addAttribute("hobbies", hobbies);
//		model.addAttribute("skills", skills);
//		
//		// send some more data
//		String[] hobbiesData = {"Badminton", "Cricket", "Reels"};
//		String[] skillsData = {"Hibernate", "Spring Boot"};
//		User user = new User("Aakash", "1234", "4044674", 
//				"a@gmail.com","m", hobbiesData, skillsData) ;
//		
//		model.addAttribute("userData", user);
//
//		List<String> cities = List.of("Indore", "Bhopal", "Gwalior");
//		model.addAttribute("citiesList", cities);
//		
//		return "welcome";
//	}

	// Demo2 : Receive data with @ModelAttribute
	@GetMapping(value = "/register")
	public String registration(@ModelAttribute("user") User user) {

		System.out.println("------------------------");
		System.out.println(user);

		return "data";
	}

	// handleDataOnClick?profession=CorporateTrainer&subject=Java
	// ModelAndView Class
	// import org.springframework.web.servlet.ModelAndView;

	@GetMapping(value = "/handleDataOnClick")
	public ModelAndView handleDataOnClickMethod(@RequestParam("profession") String profession,
			@RequestParam("subject") String subject) {
		System.out.println("------------------------");
		System.out.println("Profession : " + profession);
		System.out.println("Subject : " + subject);

		ModelAndView mView = new ModelAndView();
		mView.setViewName("trainer");
		mView.addObject("profession", profession);
		mView.addObject("subject", subject);

		return mView;
	}

	@GetMapping("/staticContent")
	public String staticContent() {
		return "static_files";
	}

}
