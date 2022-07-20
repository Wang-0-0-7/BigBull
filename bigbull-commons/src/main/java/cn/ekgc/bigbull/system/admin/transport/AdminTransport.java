package cn.ekgc.bigbull.system.admin.transport;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * <b>大牛医疗信息平台-系统功能-人员信息传输接层口</b>
 *
 * @author Lixubo
 * @date 2022/7/18
 */
@FeignClient(name = "bigbull-system-provider")
public interface  AdminTransport {
}
