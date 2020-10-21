package springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pikachu
 * 2020/10/19.
 */
@RestController
public class PaymentController {
	@Value("${server.port}")
	private String serverPort;

	@GetMapping(value = "/payment/nacos/{id}")
	public String getPayment(@PathVariable("id") Integer id){
		return "nacos registry, serverPort: "+ serverPort+"\t id"+id;
	}
}
