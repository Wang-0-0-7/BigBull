package cn.ekgc.bigbull;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("cn.ekgc.bigbull.dao")
@EnableEurekaClient
@SpringBootApplication
/**
 * <b></b>
 *
 * @author Lixubo
 * @date 2022/7/3
 */
public class OpcProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(OpcProviderStarter.class,args);
	}
}
