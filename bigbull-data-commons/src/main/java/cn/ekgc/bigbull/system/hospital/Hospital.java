package cn.ekgc.bigbull.system.hospital;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>大牛医疗信息平台-系统功能-医院信息实体</b>
 *
 * @author Lixubo
 * @date 2022/7/12
 */
@Data
@TableName("sys_hospital")
public class Hospital extends BaseEntity {
	private static final long serialVersionUID = 2034544778558313962L;
	@TableId(type = IdType.AUTO)
	private Long id;                            //主键
	private String hospitalName;                //医院名称
	private String code;                        //组织机构代码
	private String name;                        //负责人
	private String province;                    //所在省份
	private String city;                        //所在市
	private String district;                    //所在区县
	private String address;                     //详细地址
	private String cellphone;                   //联系电话
}
