package cn.ekgc.bigbull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
/**
 * <b></b>
 *
 * @author Lixubo
 * @date 2022/7/3
 */
public class RegisterStarter {
	public static void main(String[] args) {
		SpringApplication.run(RegisterStarter.class,args);
	}
}
