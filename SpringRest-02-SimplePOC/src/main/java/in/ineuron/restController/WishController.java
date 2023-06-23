package in.ineuron.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/wish")
@RestController
public class WishController {

	@GetMapping("/msg")
	public String generateWishMessage() {

		String msg = "Welcome to RestFul services from iNeuron";
		return msg;

	}

}
