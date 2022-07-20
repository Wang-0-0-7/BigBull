package cn.ekgc.bigbull.emr.pojo.entity;

import cn.ekgc.bigbull.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>大牛医疗信息平台-病历疾病（外伤）史信息</b>
 *
 * @author Lixubo
 * @date 2022/7/13
 */
@Data
@TableName("sys_mr_disease_history")
public class EmrDiseaseHistory extends BaseEntity {
	private static final long serialVersionUID = 5069524584545984596L;
	@TableId(type = IdType.ASSIGN_ID)
	private String id;                                  //主键
	private String mr;                                  //病历信息
	private String pastDiseaseHistory;                  //既往疾病史
	private String pastMentalIllness;                   //既往精神类疾病诊断名称
	private String pastDiseases;                        //既往疾病名称
	private String pastDiseasesCode;                    //既往疾病代码
	private String pastDiseasesDm;                      //既往疾病诊断机构
	private String pastDiseasesDmCode;                  //既往疾病诊断机构级别代码
	private Date pastDiseasesDate;                      //既往疾病诊断时间
	private String diseaseCurrentStatusCode;            //疾病当前状态代码
}
