package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Pikachu
 * 2020/10/19.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain9002.class,args);
	}
}
