package com.whackon.generator.controller;

import com.whackon.generator.pojo.vo.GeneratorVO;
import com.whackon.generator.service.GeneratorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <b>代码生成器控制层类</b>
 *
 * @author Arthur
 * @date 2022/1/13
 * @version 1.0.0
 * @since 1.0.0
 */
@Controller("generatorController")
public class GeneratorController {
	@Resource(name = "generatorService")
	private GeneratorService generatorService;

	/**
	 * <b>转发到生成页面</b>
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/generator")
	public String index() throws Exception {
		return "generator_index";
	}

	/**
	 * <b>生成 MyBatis Plus 版本数据</b>
	 * @param generatorVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/generate/mp")
	@ResponseBody
	public boolean generateForMyBatisPlus(GeneratorVO generatorVO) throws Exception {
		return generatorService.createForMyBatisPlus(generatorVO);
	}
}
