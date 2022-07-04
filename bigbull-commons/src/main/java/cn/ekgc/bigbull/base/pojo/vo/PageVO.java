package cn.ekgc.bigbull.base.pojo.vo;

import cn.ekgc.bigbull.base.util.BaseConstans;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <b>分页视图</b></b>
 *
 * @author Lixubo
 * @date 2022/7/2
 */
@Data
public class PageVO<E extends BaseVO> implements Serializable {
	private static final long serialVersionUID = 7386477002482064774L;
	private Integer num;
	private Integer size;
	private Long totalCount;
	private Integer totalPage;
	private List<E> list;

	public PageVO() {
	}

	public PageVO(Integer num, Integer size) {
		if (num!=null&&num>0){
			this.num = num;
		}else {
			this.num = BaseConstans.PAGE_NUM;
		}
		if (size!=null&&size>0){
			this.size = size;
		}else {
			this.size = BaseConstans.PAGE_SIZE;
		}

	}
}
