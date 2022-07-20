package cn.ekgc.bigbull.emr.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>大牛医疗信息平台-病历医保信息</b>
 *
 * @author Lixubo
 * @date 2022/7/13
 */
@Data
@TableName("sys_mr_medical_insurance")
public class EmrMedicalInsurance extends BaseEntity {
	private static final long serialVersionUID = 4497449872143988219L;
	@TableId(type = IdType.ASSIGN_ID)
	private String id;                                  //主键
	private String mr;                                  //病历信息
	private String miCategory;                          //医保类别
	private String miCategoryCode;                      //医保类别代码
}
