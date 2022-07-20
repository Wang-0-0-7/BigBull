package cn.ekgc.bigbull.base.pojo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * <b></b>
 *
 * @author Lixubo
 * @date 2022/7/14
 */
@Data
public class QueryPageVO<E> implements Serializable {
	private static final long serialVersionUID = 4353662287697923851L;
	private E queryVO;
	private PageVO pageVO;

	public QueryPageVO() {}

	public QueryPageVO(E queryVO, Integer num,Integer size) {
		this.queryVO = queryVO;
		this.pageVO = new PageVO(num,size);
	}
}
