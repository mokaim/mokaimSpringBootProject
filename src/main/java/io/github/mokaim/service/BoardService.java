package io.github.mokaim.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import io.github.mokaim.domain.BoardVO;
import io.github.mokaim.mapper.BoardMapper;

@Service("io.github.mokaim.service.BoardService")
public class BoardService {

	@Resource(name="io.github.mokaim.mapper.BoardMapper")
	BoardMapper mBoardMapper;
	
	public List<BoardVO>boardListService() throws Exception {
		
		return mBoardMapper.boardList();
	}
	
	public BoardVO boardDetailService(int bno) throws Exception {
		
		return mBoardMapper.boardDetail(bno);
	}
	
	public int boardInsertService(BoardVO board) throws Exception {
		return mBoardMapper.boardInsert(board);
	}
	
	public int boardUpdateService(BoardVO board) throws Exception {
		return mBoardMapper.boardUpdate(board);
	}
	
	public int boardDeleteService(int bno) throws Exception {
		return mBoardMapper.boardDelete(bno);
	}
}
