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


@RunWith(SpringRunner.class)
@SpringBootTest
class Test {
	
	private static Logger log = LoggerFactory.getLogger(Testl.class);
	
	@Resource(name="io.github.mokaim.mapper.BoardMapper")
	BoardMapper mBoardMapper;
	
//	@Autowired
//	Testl testl;
	

	//Connection con;
//	ResultSet rs;
//	PreparedStatement pstmt;
	
	@org.junit.jupiter.api.Test
	void TestM() throws Exception {
		
		/*
		try {
			
			String url = "jdbc:mysql://localhost:3306/MOONSU?autoReconnect=true&useSSL=false";
			

			Class.forName("com.mysql.jdbc.Driver");

			con= DriverManager.getConnection(url,"mokaim","anstn1");

			//pstmt = con.prepareStatement(sql)

			System.out.println("여기까지 잘옴");
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		//testl.say();
		System.out.println(mBoardMapper.boardCount());
	}
	
	

}
