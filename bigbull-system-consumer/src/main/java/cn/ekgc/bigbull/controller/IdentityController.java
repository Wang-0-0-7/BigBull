package cn.ekgc.bigbull.controller;

import cn.ekgc.bigbull.base.controller.BaseController;
import cn.ekgc.bigbull.base.pojo.vo.PageVO;
import cn.ekgc.bigbull.base.pojo.vo.QueryPageVO;
import cn.ekgc.bigbull.base.pojo.vo.ResponseVO;
import cn.ekgc.bigbull.base.util.BaseConstans;
import cn.ekgc.bigbull.base.util.TokenUtil;
import cn.ekgc.bigbull.system.admin.pojo.vo.AdminVO;
import cn.ekgc.bigbull.system.admin.pojo.vo.IdentityVO;
import cn.ekgc.bigbull.system.admin.transport.IdentityTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <b>大牛医疗信息平台-系统功能-人员身份控制层</b>
 *
 * @author Lixubo
 * @date 2022/7/14
 */
@RestController("identityController")
@RequestMapping("/system/admin/identity")
public class IdentityController extends BaseController {
	@Autowired
	private IdentityTransport identityTransport;

	/**
	 * 查询分页信息
	 * @param num
	 * @param size
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page/{num}/{size}")
	public ResponseVO queryPageVO(@PathVariable("num") Integer num,@PathVariable("size") Integer size,
	                              @RequestBody IdentityVO queryVO)throws Exception{
		//判断是否登录
		AdminVO adminVO= (AdminVO) TokenUtil.validateToken(request .getHeader(BaseConstans.TOKEN_HEADERS));
		if (adminVO!=null){
			//创建分页视图
			QueryPageVO<IdentityVO> queryPageVO=new QueryPageVO<IdentityVO>(queryVO,num,size);
			//进行查询，获得pageVO对象
			PageVO<IdentityVO> pageVO=identityTransport.getPageList(queryPageVO);
			return ResponseVO.getSueeessResponseVO("查询成功", pageVO);
		}else {
			//未登录
			return ResponseVO.getUnauthResponseVO();
		}
	}

	/**
	 * 根据主键查询视图信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/id/{id}")
	public ResponseVO getById(@PathVariable("id") Long id)throws Exception{
		//判断是否登录
		AdminVO adminVO= (AdminVO) TokenUtil.validateToken(request .getHeader(BaseConstans.TOKEN_HEADERS));
		if (adminVO!=null){
			IdentityVO vo=identityTransport.getById(id);
			return ResponseVO.getSueeessResponseVO("查询成功！", vo);
		}
		return ResponseVO.getUnauthResponseVO();
	}

	/**
	 * 编码查询实体
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/code/{code}")
	public ResponseVO getByCode(@PathVariable("code") String code)throws Exception{
		//判断是否登录
		AdminVO adminVO= (AdminVO) TokenUtil.validateToken(request .getHeader(BaseConstans.TOKEN_HEADERS));
		if (adminVO!=null){
			IdentityVO vo=identityTransport.getByCode(code);
			return ResponseVO.getSueeessResponseVO("查询成功！", vo);
		}
		return ResponseVO.getUnauthResponseVO();
	}

	/**
	 * 插入信息
	 * @param vo
	 * @param bindingResult
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/insert")
	public ResponseVO insert(@Validated @RequestBody IdentityVO vo, BindingResult bindingResult) throws Exception {
		//判断是否登录
		AdminVO adminVO= (AdminVO) TokenUtil.validateToken(request .getHeader(BaseConstans.TOKEN_HEADERS));
		if (adminVO!=null){
			//判断是否有错误信息
			if (!bindingResult.hasErrors()){
				//对编码进行唯一性校验
				if (identityTransport.getByCode(vo.getCode())==null){
					//进行保存
					if (identityTransport.insert(vo)){
						return ResponseVO.getSueeessResponseVO("保存成功！");
					}else {
						return ResponseVO.getFailure("保存失败！");
					}
				}else {
					return ResponseVO.getFailure("编码已被使用！");
				}
			}else {
			return ResponseVO.getFailure("输入信息有误！");
			}

		}
		return ResponseVO.getUnauthResponseVO();
	}

	@PutMapping("/update/{id}")
	public ResponseVO update(@PathVariable("id") Long id,@RequestBody IdentityVO vo,
	                         BindingResult bindingResult)throws Exception{
		//判断是否登录
		AdminVO adminVO= (AdminVO) TokenUtil.validateToken(request .getHeader(BaseConstans.TOKEN_HEADERS));
		if (adminVO!=null){
			//判断是否有错误信息
			if (!bindingResult.hasErrors()){
				//对编码进行唯一性校验
				if (identityTransport.getByCode(vo.getCode())==null||
						identityTransport.getByCode(vo.getCode()).getId().equals(id)){
					vo.setId(id);
					//进行修改
					if (identityTransport.update(vo)){
						return ResponseVO.getSueeessResponseVO("保存成功！");
					}else {
						return ResponseVO.getFailure("修改失败！");
					}
				}else {
					return ResponseVO.getFailure("编码已被使用！");
				}
			}else {
				return ResponseVO.getFailure("输入信息有误！");
			}

		}
		return ResponseVO.getUnauthResponseVO();
	}
}
