package cn.ekgc.bigbull.emr.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>大牛医疗信息平台-病历联系人信息</b>
 *
 * @author Lixubo
 * @date 2022/7/13
 */
@Data
@TableName("sys_mr_contact")
public class EmrContact extends BaseEntity {
	private static final long serialVersionUID = -2312351626684733700L;
	@TableId(type = IdType.ASSIGN_ID)
	private String id;                                  //主键
	private String mr;                                  //病历信息
	private String identificationCode;                  //标识号-类别代码
	private String identificationNo;                    //标识号-号码
	private Date identificationEffectiveDate;           //标识号-生效日期
	private String nameIdentifyObjects;                 //姓名-标识对象
	private String nameIdentifyCode;                    //姓名-标识对象代码
	private String name;                                //姓名
}
