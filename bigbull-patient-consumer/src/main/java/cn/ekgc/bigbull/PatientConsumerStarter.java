package cn.ekgc.bigbull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
/**
 * <b></b>
 *
 * @author Lixubo
 * @date 2022/7/3
 */
public class PatientConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(PatientConsumerStarter.class,args);
	}
}
