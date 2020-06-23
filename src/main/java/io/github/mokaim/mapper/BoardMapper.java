package io.github.mokaim.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.github.mokaim.domain.BoardVO;

@Repository("io.github.mokaim.mapper.BoardMapper")
public interface BoardMapper {
	
	public int boardCount() throws Exception;
	
	public List<BoardVO> boardList() throws Exception;
	
	public BoardVO boardDetail(int bno) throws Exception;
	
	public int boardInsert(BoardVO board) throws Exception;
	
	public int boardUpdate(BoardVO board) throws Exception;
	
	public int boardDelete(int bno) throws Exception;
	
	
}
