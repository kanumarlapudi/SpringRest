package in.ineuron.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

	@GetMapping("/info/{id}")
	public ResponseEntity<String> getCourseInfo(@PathVariable Integer id) {

		String body = "null";

		if (id == 5) {
			body = "SpringBoot-Microservices batch from Syed Haider from May23-2023 @9.00AM";
		} else if (id == 18) {
			body = "Java Real Time Project batch from Navin Reddy from June12-2023 @6.30AM";
		} else {
			body = "Contact ineuron website for the information";
		}

		ResponseEntity<String> entity = new ResponseEntity<String>(body, HttpStatus.OK);
		return entity;
	}

	@GetMapping("/info/{id}/JRTP/{name}")
	public ResponseEntity<String> getCourseDetails(@PathVariable String id, @PathVariable String name) {

		String body = null;

		if (id.equals("5") && name.equalsIgnoreCase("navinreddy")) {
			body = "Java Real Time Project batch from Navin Reddy from June12-2023 @6.30AM";
		} else if (id.equals("5") && name.equalsIgnoreCase("haider")) {
			body = "Java Real Time Project batch from Syed Haider from May23-2023 @9.00AM";
		} else {
			body = "Contact ineuron website for the information";
		}

		ResponseEntity<String> entity = new ResponseEntity<String>(body, HttpStatus.OK);
		return entity;
	}

}
