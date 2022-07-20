package cn.ekgc.bigbull.emr.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b> * <b>大牛医疗信息平台-病历通信信息</b></b>
 *
 * @author Lixubo
 * @date 2022/7/13
 */
@Data
@TableName("sys_mr_communication")
public class EmrCommunication extends BaseEntity {
	private static final long serialVersionUID = 1849002171828024321L;
	@TableId(type = IdType.ASSIGN_ID)
	private String id;                          //主键
	private String mr;                          //病历信息
	private String phoneCategory;               //联系电话类别
	private String phoneCategoryCode;           //联系电话-类别代码
	private String cellphone;                   //联系电话-号码
	private String email;                       //电子邮件地址
}
