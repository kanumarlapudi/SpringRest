package in.ineuron.restcontroller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Company;
import in.ineuron.model.Customer;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@GetMapping("/report/{id}")
	public ResponseEntity<Customer> showAllCustomer(@PathVariable Integer id) {

		// get from DataBase
		System.out.println("customer Data for the id : " + id);

		Customer customer = new Customer();
		customer.setCno(id);
		customer.setCname("sachin");
		customer.setBillAmount(54.5f);
		customer.setTeamNames(new String[] { "IND", "MI", "AsiaXT", "Mumbai" });
		customer.setStudies(List.of("10th", "12th", "Engineering"));
		customer.setPhoneNumbers(Set.of(4554685L, 685488L, 647487454L));
		customer.setIdDetails(Map.of("adhar", 59565845L, "pan no", "hddff7846L"));
		customer.setCompany(new Company("Mi", "IPL", "MUMBAI", 45));

		ResponseEntity<Customer> entity = new ResponseEntity<Customer>(customer, HttpStatus.OK);

		return entity;
	}

	@PostMapping(value = "/save")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer) {
		System.out.println(customer);
		Integer id = 10;
		String body = "Customer registered with the id :: " + id;
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}

}
