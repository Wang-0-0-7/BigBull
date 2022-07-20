package cn.ekgc.bigbull.admin.dao;

import cn.ekgc.bigbull.system.admin.pojo.entity.Identity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <b>大牛医疗信息平台-系统功能-人员身份数据持久层层接口</b>
 *
 * @author Lixubo
 * @date 2022/7/14
 */
@Repository
public interface IdentityDao extends BaseMapper<Identity> {
}
