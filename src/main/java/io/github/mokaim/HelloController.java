package io.github.mokaim;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.mokaim.mapper.BoardMapper;


@Controller
public class HelloController {
	
	@Resource(name="io.github.mokaim.mapper.BoardMapper")
	BoardMapper mBoardMapper;
	
	@RequestMapping("/")
	public String jspTest() throws Exception {
		
		System.out.println(mBoardMapper.boardCount());

		return "moonsu";
	}
}
