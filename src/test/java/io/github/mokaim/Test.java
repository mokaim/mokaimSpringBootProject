package io.github.mokaim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import io.github.mokaim.mapper.BoardMapper;
import io.github.mokaim.service.BoardService;


@RunWith(SpringRunner.class)
@SpringBootTest
class Test {
	
	private static Logger log = LoggerFactory.getLogger(Testl.class);
	
	//@Resource(name="io.github.mokaim.mapper.BoardMapper")
	//BoardMapper mBoardMapper;
	
	@Resource(name="io.github.mokaim.service.BoardService")
	BoardService boardService;
	
	@org.junit.jupiter.api.Test
	void TestM() throws Exception {
		boardService.test();
		
	}
	
	

}
