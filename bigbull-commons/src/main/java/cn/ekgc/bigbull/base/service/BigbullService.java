package cn.ekgc.bigbull.base.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "bigbull-emr-provider")
/**
 * <b></b>
 *
 * @author Lixubo
 * @date 2022/7/4
 */
public interface BigbullService {

}
