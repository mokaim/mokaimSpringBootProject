package io.github.mokaim.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.mokaim.domain.BoardVO;
import io.github.mokaim.service.BoardService;

@Controller
public class BoardController {
	
	@Resource(name="io.github.mokaim.service.BoardService") //name의 패키지 경로에 있는 의존성을 주입시킨다.
	BoardService mBoardService;
	
	@RequestMapping("/list")  //list요청에 따라 boardList 메소드를 실행시킨다.
	private String boardList(Model model) throws Exception {
		
		model.addAttribute("list",mBoardService.boardListService());  //model 객체에 리스트 객체를 집어넣는다.
		
		return "list";  //list View 를 리턴시킨다.
	}
	
	@RequestMapping("/detail/{bno}")   //@PathVariable 어노테이션은 요청에 들어온 값을 자바데이터로 변환시켜 해당 변수에 집어넣는다.
	private String boardDetail(@PathVariable int bno, Model model) throws Exception {
		
		model.addAttribute("detail", mBoardService.boardDetailService(bno));
		
		return "detail";	//detail view 를 리턴시킨다.
	}
	
	
	
	@RequestMapping("/insert")
	private String boardInsert() {
		return "insert";   //insert view 를 리턴시킨다.
	}
	
	@RequestMapping("/insertProcess")   //서블릿 매핑으로 글 삽입 프로세서 서블릿을 호출시킨다.
	private String boardInsertProcess(HttpServletRequest request) throws Exception {  //HttpServlet 으로 사용자의 request를 받아들인다.
		
		//BoardVO boardVO = (BoardVO)request.getParameterMap();
		BoardVO boardVO = new BoardVO();
		String a = request.getParameter("subject");
		String b = request.getParameter("content");
		
		boardVO.setSubject(a);
		boardVO.setContent(b);
		boardVO.setWriter("Kwon");
		boardVO.setReg_date("2020-06-23");
		
		mBoardService.boardInsertService(boardVO);
		
		return "redirect:/list";
	}
	
	@RequestMapping("/update/{bno}")
	private String boardUpdate(@PathVariable int bno, Model model) throws Exception {

		model.addAttribute("detail",mBoardService.boardDetailService(bno));
		
		return "update";
	}
	
	@RequestMapping("/updateProcess")
	private int boardUpdateProcess(HttpServletRequest request) throws Exception {
		
		BoardVO boardVO = (BoardVO)request.getParameterMap();
		
		return mBoardService.boardUpdateService(boardVO);
	}
	
	@RequestMapping("/delete/{bno}")
	private String baordDeleteProcess(@PathVariable int bno) throws Exception {
		
		mBoardService.boardDeleteService(bno);
		return "redirect/list";
	}
	
	


	
	
	
	
	
	
	
}
