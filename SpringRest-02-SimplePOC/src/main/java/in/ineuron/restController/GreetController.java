package in.ineuron.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/greet")
@RestController
public class GreetController {

	@GetMapping("/msg")
	public ResponseEntity<String> wishMessage() {

		String msg = "Good Afternoon";

		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}

}
